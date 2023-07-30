package tests;

import expressions.Variable;
import instructions.Constant;
import instructions.ForLoop;
import instructions.Print;
import macchiato.Debugger;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ForLoopTest {

    @Test
    void execute() {
        var forloop = new ForLoop(Variable.named('i'), Constant.of(5));
        forloop.addInstruction(new Print(Constant.of(3)));
        try {

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            System.setOut(printStream);

            forloop.execute(null, new Debugger(-1));

            System.setOut(System.out);

            String expected = "3\n3\n3\n3\n3\n";
            String output = outputStream.toString();

            assertEquals(expected, output);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}