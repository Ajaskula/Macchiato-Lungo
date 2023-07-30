package builders;

import conditions.BooleanCondition;
import instructions.*;
import declarations.*;
import expressions.*;
import java.util.*;
import expressions.Expression;
public class BlockBuilder {
    private List<Instruction> instructions;

    public BlockBuilder(){
        this.instructions = new ArrayList<>();
    }
    public BlockBuilder block(Block inst, List<Declaration> declarations){
        ProgramBlock instruction = new ProgramBlock(inst, declarations);
        instructions.add(instruction);
        return this;
    }
    public BlockBuilder invoke(String name, List<Expression> parameters){
        ProcedureCall instruction = new ProcedureCall(name, parameters);
        instructions.add(instruction);
        return this;
    }
    public BlockBuilder print(Expression expression){
        Print instruction = new Print(expression);
        instructions.add(instruction);
        return this;
    }
    public BlockBuilder ifStatement(Expression expression1, Expression expression2, BooleanCondition condition){
        IfInstruction instruction = new IfInstruction(expression1, expression2, condition);
        instructions.add(instruction);
        return this;
    }
    public BlockBuilder loop(Variable variable, Expression expression){
        ForLoop instruction = new ForLoop(variable, expression);
        instructions.add(instruction);
        return this;
    }
    public BlockBuilder assign(Character name, Expression expression){
        AssigmentInstruction instruction = new AssigmentInstruction(name, expression);
        instructions.add(instruction);
        return this;
    }

    public Block build() {
        return new Block(instructions);
    }
}
