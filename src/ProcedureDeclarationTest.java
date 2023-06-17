import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProcedureDeclarationTest {

    @Test
    void execute() {
        try{
        var declaration = new ProcedureDeclaration("name", List.of('a'), new BlockBuilder()
                .print(Constant.of(21))
                .build());

            var state = new State(null);
            declaration.execute(state);

            assertTrue(state.checkIfProcedureIsDeclared("name"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}