import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// represents Block in Macchiato
public class ProgramBlock extends Instruction {
  private List<Declaration> declarations;
  private Block instructions;

  public ProgramBlock() {
    this.instructions = new Block();
    this.declarations = new ArrayList<>();
  }

  public ProgramBlock(Block instructions) {
    this.instructions = instructions;
    this.declarations = new ArrayList<>();
  }
  public Block getInstructions() {
    return this.instructions;
  }

  public void addInstruction(Instruction instruction) {
    this.instructions.getInstructions().add(instruction);
  }

  public void addDeclaration(Declaration declaration) {
    declarations.add(declaration);
  }

  public void setDeclarations(State variables)
      throws VariableNotFoundException, VariableAlreadyDeclaredException, ZeroDivisionException, ProcedureAlreadyDeclaredException {
    for (Declaration declaration : declarations) {
      declaration.execute(variables);
    }
  }

  public void execute(State oldState, Debugger debugger)
      throws IOException, VariableNotFoundException, VariableAlreadyDeclaredException,
             ZeroDivisionException, ModuloException, ProcedureAlreadyDeclaredException {
    State state = new State(oldState);
    debugger.trace_instructions(this, oldState);
    try {
      setDeclarations(state);
    } catch (VariableAlreadyDeclaredException e) {
      throw new VariableAlreadyDeclaredException(e.getMessage() + " in:\n " + this.display(0));
    }

    // execute instructions
    instructions.execute(state, debugger);
    // display declarations if the block is the main block of the program
    if (state.getParent() == null) {
      System.out.print(state.displayVariables());
    }
  }

  public String display(int level) {
    StringBuilder sb = new StringBuilder();
    sb.append("  ".repeat(level)).append("begin block\n");
    sb.append(instructions.display(level + 1));
    sb.append("  ".repeat(level)).append("end block\n");
    return sb.toString();
  }
}
