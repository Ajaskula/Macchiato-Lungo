abstract class Declaration {
    abstract void execute(State declarations) throws ProcedureAlreadyDeclaredException, VariableAlreadyDeclaredException,
            VariableNotFoundException, ZeroDivisionException;
}
