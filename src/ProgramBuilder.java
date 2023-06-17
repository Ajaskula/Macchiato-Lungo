import java.util.*;
public class ProgramBuilder {
    private List<Declaration> declarations;
    //private List<ProcedureDeclaration> procedureDeclarations;
    private Block instructions;
    //private String name;
    //private Character name;

    public ProgramBuilder(){
        //this.variableDeclarations = new ArrayList<>();
        this.declarations = new ArrayList<>();
        this.instructions = new Block();
    }

    //zwraca program blok, który w liście deklaracji ma deklarację zmiennej
    public ProgramBuilder declareVariable(Character variableName, Expression expression) {
        VariableDeclaration declaration = new VariableDeclaration(variableName, expression);
        declarations.add(declaration);
        return this;
    }

    //zwraca program blok, który w liście deklaracji ma deklarację procedury
    public ProgramBuilder declareProcedure(String procedureName, List<Character> parameters, Block content) throws VariableAlreadyDeclaredException {
        ProcedureDeclaration declaration = new ProcedureDeclaration(procedureName, parameters, content);
        declarations.add(declaration);
        return this;
    }
    public ProgramBuilder assign(Character name, Expression expression){
        AssigmentInstruction instruction = new AssigmentInstruction(name, expression);
        instructions.addInstruction(instruction);
        return this;
    }
    public ProgramBuilder loop(Variable variable, Expression expression){
        ForLoop instruction = new ForLoop(variable, expression);
        instructions.addInstruction(instruction);
        return this;
    }
    public ProgramBuilder ifStatement(Expression expression1, Expression expression2, BooleanCondition condition){
        IfInstruction instruction = new IfInstruction(expression1, expression2, condition);
        instructions.addInstruction(instruction);
        return this;
    }
    public ProgramBuilder print(Expression expression){
        Print instruction = new Print(expression);
        instructions.addInstruction(instruction);
        return this;
    }
    public ProgramBuilder invoke(String name, List<Expression> parameters){
        ProcedureCall instruction = new ProcedureCall(name, parameters);
        instructions.addInstruction(instruction);
        return this;
    }
    public ProgramBuilder block(Block inst, List<Declaration> declarations){
        ProgramBlock instruction = new ProgramBlock(inst, declarations);
        instructions.addInstruction(instruction);
        return this;
    }
    public ProgramBlock build(){
        return new ProgramBlock(instructions, declarations);
    }
}
