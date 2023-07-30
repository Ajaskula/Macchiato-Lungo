package tests;

import expressions.Variable;
import macchiato.State;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableTest {

    @Test
    void evaluate() {
        var variable = new Variable('x');
        var state = new State(null);
        try {
            state.addVariable('x', 3);
            assertEquals(3, variable.evaluate(state));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}