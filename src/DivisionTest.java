import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void evaluate() {
        try{
            assertEquals(3, Division.of(Constant.of(15), Constant.of(5)).evaluate(null));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}