import java.io.IOException;
import java.util.*;
/*
Instruction represents Procedure Call in Macchiato Lungo
*/
public class ProcedureCall extends Instruction{
    private String name;
    private List<Expression> parameters;

    public ProcedureCall(String name, List<Expression> parameters){
        this.name = name;
        this.parameters = parameters;
    }

    // Calculates parameters values and runs procedure
    public void execute(State oldState, Debugger debugger) throws VariableNotFoundException,
            ProcedureAlreadyDeclaredException, ZeroDivisionException, IOException, VariableAlreadyDeclaredException {

        State state = new State(oldState);
        debugger.trace_instructions(this, state);
        List<Character> parameterNames = oldState.getProcedureValues(name);

        // Creates state with parameters
        for (int i = 0; i < parameterNames.size(); i++) {
            state.addVariable(parameterNames.get(i), parameters.get(i).evaluate(oldState));
        }

        // Executes procedure
            oldState.getProcedureContent(name).execute(state, debugger);
    }

    public String display(int level){
        StringBuilder sb = new StringBuilder();
        sb.append("  ".repeat(level) + name + "( " );
        for(Expression e : parameters){
            sb.append(e.display() + " ");
        }
        sb.append(")\n");
        return sb.toString();
    }

}
