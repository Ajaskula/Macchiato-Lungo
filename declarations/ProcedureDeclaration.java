package declarations;

import exceptions.ProcedureAlreadyDeclaredException;
import exceptions.VariableAlreadyDeclaredException;
import instructions.Block;
import macchiato.Pair;
import macchiato.State;

import java.util.*;
/* Class represents ProcedureDeclaration in Macchiato Lungo language*/
public class ProcedureDeclaration extends Declaration {

    private String name;
    private List<Character> parameters;
    private Block content;


    public ProcedureDeclaration(String name, List<Character> parameters, Block content) throws VariableAlreadyDeclaredException{

        if(!isProcedureNameCorrect(name)){
            throw new IllegalArgumentException("Illegal Procedure name");
        }
        if(!areParametersValid(parameters)){
            throw new VariableAlreadyDeclaredException("Given Parameters, aren't unique!");
        }
        this.name = name;
        this.content = content;
        this.parameters = parameters;
    }

    private boolean isProcedureNameCorrect(String name){

        if(name.isEmpty()){
            return false;
        }
        for(int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
    private boolean areParametersValid(List<Character> parameters){

        for (Character c : parameters){
            if (!Character.isLowerCase(c) || c < 'a' || c > 'z'){
                return false;
            }
        }
        Set<Character> uniqueCharacters = new HashSet<>(parameters);
        return uniqueCharacters.size() == parameters.size();
    }

    private static Map<Character, Integer> createMapOfParameters(List<Character> characters){
        Map<Character, Integer> map = new IdentityHashMap<>();
        for(Character c : characters){
            map.put(c, null);
        }
        return map;
    }

    // Adds procedure to actual state.
    @Override
    public void execute(State state) throws ProcedureAlreadyDeclaredException {

        state.addProcedure(name, new Pair<List<Character>, Block>(parameters, content));
    }
}
