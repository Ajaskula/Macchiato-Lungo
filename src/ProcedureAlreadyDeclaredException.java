public class ProcedureAlreadyDeclaredException extends Exception{
    public ProcedureAlreadyDeclaredException(String name) {
        super("Procedure " + name + " has been declared before");
    }
    //public ProcedureAlreadyDeclaredException(String string) {
//        super(string);
//    }

//    public ProcedureAlreadyDeclaredException(String name) {
//        super(name);
//    }
}
