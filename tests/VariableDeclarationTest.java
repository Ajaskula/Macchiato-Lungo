package tests;

import declarations.VariableDeclaration;
import instructions.Constant;
import jdk.jshell.execution.JdiExecutionControl;
import macchiato.State;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableDeclarationTest {

    @Test
    void execute() {
        var declaration = new VariableDeclaration('x', Constant.of(4));

        var state1 = new State(null);
        var state2 = new State(null);
        try {
            declaration.execute(state1);
            state2.addVariable('x', 4);
            assertEquals(state2.getVariables(), state1.getVariables());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}