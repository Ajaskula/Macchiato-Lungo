import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcedureCallTest {

    @Test
    void execute() {

        //declaration
        try{
            var declaration = new ProcedureDeclaration("name", List.of('a'), new BlockBuilder()
                    .print(Variable.named('a'))
                    .build());

            var state = new State(null);
            declaration.execute(state);

            var procedureCall = new ProcedureCall("name", List.of(Constant.of(17)));

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            System.setOut(printStream);

            procedureCall.execute(state, null);

            System.setOut(System.out);

            String expected = "17\n";
            String output = outputStream.toString();

            assertEquals(expected, output);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}