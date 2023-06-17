import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    @Test
    void execute() {
        var print = new Print(Constant.of(17));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);
        try {
            print.execute(null, new Debugger(-1));

            System.setOut(System.out);

            String expected = "17\n";
            String output = outputStream.toString();

            assertEquals(expected, output);
    } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}