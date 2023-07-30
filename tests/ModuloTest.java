package tests;

import expressions.Modulo;
import instructions.Constant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuloTest {

    @Test
    void evaluate() {
        var mod = new Modulo(Constant.of(7), Constant.of(4));

        try {
            assertEquals(3, mod.evaluate(null));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}