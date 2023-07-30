package declarations;

import exceptions.ProcedureAlreadyDeclaredException;
import exceptions.VariableAlreadyDeclaredException;
import exceptions.VariableNotFoundException;
import exceptions.ZeroDivisionException;
import macchiato.State;

public abstract class Declaration {
    public abstract void execute(State declarations) throws ProcedureAlreadyDeclaredException, VariableAlreadyDeclaredException,
            VariableNotFoundException, ZeroDivisionException;
}
