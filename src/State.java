import java.util.*;

// class represents the set of currently visible variables and their values
public class State {
  private State parent;

  // stores variables and values visible in a given blocMMmm
  private Map<Character, Integer> variables;

  //stores procedures, visible in a given block
  private Map<String, Pair <List<Character>, Block>> procedures;

  public State(State parent) {
    this.parent = parent;
    this.variables = new IdentityHashMap<>();
    this.procedures = new LinkedHashMap<>();
  }

  public boolean checkIfVariableIsDeclared(Character name) {
    if (this.variables.containsKey(name)) {
      return true;
    } else if (parent != null) {
      return parent.checkIfVariableIsDeclared(name);
    }
    return false;
  }

  public boolean checkIfProcedureIsDeclared(String name){
      if (this.procedures.containsKey(name)){
        return true;
      }else if(parent != null){
        return parent.checkIfProcedureIsDeclared(name);
      }
      return false;
  }

  // displays values of variables declared in a <level> outside block
  public String display_level(int level) {
    StringBuilder sb = new StringBuilder();

    if (level > 0) {
      if (this.parent != null) {
        return parent.display_level(level - 1);
      } else {
        sb.append("Block is not nested this many times\n");
      }
    } else if (level == 0) {
      sb.append(displayVariables());
    }
    return sb.toString();
  }

  // displays visible procedures and its parameters
//  public String displayVisibleProcedures(){
//      StringBuilder sb = new StringBuilder();
//      if(parent == null){
//        return sb.toString();
//      }else{
//
//      }
//  }

  // displays visible procedures and its parameters in a block
//  public String displayProceduresInBlock(){
//    StringBuilder sb = new StringBuilder();
//
//    Set<String> names = procedures.keySet();
//    for(String n : names){
//      sb.append(diplayProcedure(n));
//    }
//    return sb.toString();
//  }
  //displays procedure of a given name
//  private String diplayProcedure(String name){
//      StringBuilder sb = new StringBuilder();
//      sb.append("(").append(name);
//
//      //gets pair
//      Pair<Map<Character, Integer>, ProgramBlock> pair = procedures.get(name);
//
//      Map<Character, Integer> innerMap = pair.getKey();
//
//      Set<Character> parameters = innerMap.keySet();
//
//      for(Character p : parameters){
//        sb.append(p.toString() + " ");
//      }
//      sb.append(")");
//      return sb.toString();
//  }

  // set variable (name) to value
  public void setVariable(Character name, Integer value) throws VariableNotFoundException {
    if (this.variables.containsKey(name)) {
      this.variables.put(name, value);
    } else if (parent != null) {
      parent.setVariable(name, value);
    } else {
      throw new VariableNotFoundException(name);
    }
  }

  public Integer getVariableValue(Character name) throws VariableNotFoundException {
    if (this.variables != null && this.variables.containsKey(name)) {
      return variables.get(name);
    } else if (parent != null) {
      return parent.getVariableValue(name);
    } else {
      throw new VariableNotFoundException(name);
    }
  }

  // adds new variable to the map
  public void addVariable(Character name, Integer value) throws VariableAlreadyDeclaredException {
    if (variables.containsKey(name)) {
      throw new VariableAlreadyDeclaredException(name);
    } else {
      this.variables.put(name, value);
    }
  }

  // adds new procedure to the map
  public void addProcedure(String name, Pair< List<Character>, Block> pair) throws ProcedureAlreadyDeclaredException{
      if( procedures.containsKey(name)) {
        throw new ProcedureAlreadyDeclaredException(name);
      } else{
        this.procedures.put(name, pair);
      }
  }
  public List<Character> getProcedureValues(String name){
    return getProcedure(name).getKey();
  }
  public Map<String, Pair<List<Character>, Block>> getProcedures(){
    return this.procedures;
  }

  public void removeVariable(Character name) {
    this.variables.remove(name);
  }

  public State getParent() {
    return this.parent;
  }

  public Map<Character, Integer> getVariables() {
    return this.variables;
  }

  private Pair< List<Character>, Block> getProcedure(String name) {
    if(!procedures.containsKey(name)){

      if(parent != null){
        return parent.getProcedure(name);
      }
    }
    return procedures.get(name);
  }
  public Block getProcedureContent(String name){
    return getProcedure(name).getValue();
  }

  public String displayVariables() {
    if (variables == null) {
      return "";
    }
    StringBuilder sb = new StringBuilder();

    Map<Character, Integer> mapToDisplay = new HashMap<>();

    mapToDisplay.putAll(variables);

    State parent = this.parent;

    while (parent != null) {
      Map<Character, Integer> parentVariables = parent.getVariables();
      for (Map.Entry<Character, Integer> variable : parentVariables.entrySet()) {
        if (!mapToDisplay.containsKey(variable.getKey())) {
          mapToDisplay.put(variable.getKey(), variable.getValue());
        }
      }

      parent = parent.getParent();
    }
    for (Map.Entry<Character, Integer> entry : mapToDisplay.entrySet()) {
      sb.append(entry.getKey()).append("=").append(entry.getValue()).append(" ");
    }
    sb.append("\n");
    return sb.toString();
  }
  // wypisuje informację o aktualnie dostępnych procedurach w bloku
  public String displayProcedures(){
    if(procedures == null){
      return "";
    }
    StringBuilder sb = new StringBuilder();

    //będzie to mapa którą wyświetlę
    Map<String, List<Character>> mapToDisplay = new LinkedHashMap<>();

    //dokładam wszystko z bierzącej mapy
    for(Map.Entry<String, Pair<List<Character>, Block>> entry : procedures.entrySet()){
        mapToDisplay.put(entry.getKey(), entry.getValue().getKey());
    }

     State parent = this.parent;

     while(parent != null){
       Map<String, Pair<List<Character>, Block>> parentProcedures = parent.getProcedures();

       for(Map.Entry<String, Pair<List<Character>, Block>> entry : parentProcedures.entrySet()){
         if(!mapToDisplay.containsKey(entry.getKey())){
           mapToDisplay.put(entry.getKey(), entry.getValue().getKey());
         }
       }

       parent = parent.getParent();
     }
      for(Map.Entry<String, List<Character>> entry : mapToDisplay.entrySet()){
        sb.append(entry.getKey() + "(");
        for( Character character : entry.getValue()){
          sb.append(" " + character.toString());
        }
        sb.append(" )");
      }
      sb.append("\n");
    return sb.toString();
  }
  public String display(){
    StringBuilder sb = new StringBuilder();
    sb.append(displayVariables());
    sb.append(displayProcedures());
    return sb.toString();
  }
}
