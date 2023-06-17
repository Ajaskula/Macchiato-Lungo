public class ProcedureAlreadyDeclaredException extends Exception{
    public ProcedureAlreadyDeclaredException(String name) {
        super("Procedure " + name + " has been declared before");
    }
}
