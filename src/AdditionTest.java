import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void evaluate() {
        try {
            var addition = Addition.of(Constant.of(7), Constant.of(3));
            assertEquals(10, addition.evaluate(null));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}