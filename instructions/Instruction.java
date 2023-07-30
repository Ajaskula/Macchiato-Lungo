package instructions;

import exceptions.ProcedureAlreadyDeclaredException;
import exceptions.VariableAlreadyDeclaredException;
import exceptions.VariableNotFoundException;
import exceptions.ZeroDivisionException;
import macchiato.Debugger;
import macchiato.State;

import java.io.IOException;

public abstract class Instruction {
  abstract void execute(State declarations, Debugger debugger)
      throws IOException, VariableNotFoundException, VariableAlreadyDeclaredException,
          ZeroDivisionException, ProcedureAlreadyDeclaredException;

  abstract public String display(int level);
}
