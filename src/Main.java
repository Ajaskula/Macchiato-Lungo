import java.util.List;

public class Main {
  public static void main(String[] args) throws VariableAlreadyDeclaredException {

    // In my implementation, "Block" can only contain instructions, while "ProgramBlock" can also contain declarations.
    // The implementation utilizes dynamic variable binding.

    // Program from the task
    var program = new ProgramBuilder()
            .declareVariable('x', Constant.of(101))
            .declareVariable('y', Constant.of(1))
            .declareProcedure("out", List.of('a'), new BlockBuilder()
                    .print(Addition.of(Variable.named('a'), Variable.named('x')))
                    .build()
            )
            .assign('x', Subtraction.of(Variable.named('x'), Variable.named('y')))
            .invoke("out", List.of(Variable.named('x')))
            .invoke("out", List.of(Constant.of(100)))
            .programBlock(new ProgramBuilder()
                    .declareVariable('x', Constant.of(10))
                    .invoke("out", List.of(Constant.of(100)))
                    .build()
            )
            .build();

    ProgramExecution execute = new ProgramExecution(program);
    // uncomment this line to run program with debugging
    execute.debug();
    // uncomment this to run program without debugging
    //      execute.execute();
  }
}