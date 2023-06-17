import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstantTest {

    @Test
    void evaluate() {
        var constant = Constant.of(5);
        assertEquals(5, constant.evaluate(null));
    }

}