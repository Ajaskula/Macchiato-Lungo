package tests;

import builders.BlockBuilder;
import declarations.VariableDeclaration;
import expressions.Variable;
import instructions.Constant;
import instructions.ProgramBlock;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgramBlockTest {

    @Test
    void execute() {

        var programBlock = new ProgramBlock(new BlockBuilder()
                .print(Variable.named('x'))
                .build(), List.of(new VariableDeclaration('x', Constant.of(101))));
        try {

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            System.setOut(printStream);

            programBlock.execute(null, null);

            System.setOut(System.out);

            String expected = "101\n";
            String output = outputStream.toString();

            assertEquals(expected, output);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}