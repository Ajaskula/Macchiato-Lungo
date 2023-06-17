import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class IfInstructionTest {

    // if is true
    @Test
    void execute() {
        var instruction = new IfInstruction(Constant.of(2), Constant.of(1), new GreaterCondition());
        instruction.addIfInstruction(new Print(Constant.of(7)));
        instruction.addElseInstruction(new Print(Constant.of(11)));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);
        try {
            instruction.execute(null, new Debugger(-1));

            System.setOut(System.out);

            String expected = "7\n";
            String output = outputStream.toString();

            assertEquals(expected, output);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        @Test
        void execute2() {
            var instruction = new IfInstruction(Constant.of(0), Constant.of(1), new GreaterCondition());
            instruction.addIfInstruction(new Print(Constant.of(7)));
            instruction.addElseInstruction(new Print(Constant.of(11)));

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            System.setOut(printStream);
            try {
                instruction.execute(null, new Debugger(-1));

                System.setOut(System.out);

                String expected = "11\n";
                String output = outputStream.toString();

                assertEquals(expected, output);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

    }

}