import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void evaluate() {
        var substraction = new Subtraction(Constant.of(5), Constant.of(7));
        try {
            assertEquals(-2, substraction.evaluate(null));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}