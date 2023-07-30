package tests;

import instructions.AssigmentInstruction;
import instructions.Constant;
import macchiato.Debugger;
import macchiato.State;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssigmentInstructionTest {

    @Test
    void execute() {
        try {
            var state = new State(null);
            state.addVariable('x', 4);
            var instruction = new AssigmentInstruction('x', Constant.of(7));
            instruction.execute(state, new Debugger(-1));
            assertEquals(state.getVariableValue('x'), 7);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}