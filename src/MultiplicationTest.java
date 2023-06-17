import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void evaluate() {
        var multiplication = new Multiplication(Constant.of(4), Constant.of(3));
        try {
            assertEquals(12, multiplication.evaluate(null));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}