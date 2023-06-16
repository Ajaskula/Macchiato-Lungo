import java.io.IOException;
import java.util.*;
/* Instruction represents Procedure Call in Macchiato Lungo*/
public class ProcedureCall extends Instruction{

    private String name;
    private List<Expression> parameters;

    public ProcedureCall(String name, List<Expression> parameters){
        this.name = name;
        this.parameters = parameters;
    }

    //wylicza wartości dla procedury do wykonania jej
    public void execute(State oldState, Debugger debugger) throws VariableNotFoundException,
            ProcedureAlreadyDeclaredException, ZeroDivisionException, IOException, VariableAlreadyDeclaredException {

        //tworzy nowy state
        State state = new State(oldState);
        debugger.trace_instructions(this, state);
        //Lista zmiennych dostępnych w procedurze
        List<Character> parameterNames = oldState.getProcedureValues(name);

        //tworzy nową mapę, w której znajdują się wartości parametrów
        for (int i = 0; i < parameterNames.size(); i++) {
            state.addVariable(parameterNames.get(i), parameters.get(i).evaluate(oldState));
        }
        //debugger.trace_instructions(this, oldState);

        //wykonuje procedure o wskazanej nazwie
        oldState.getProcedureContent(name).execute(state, debugger);
        ;
    }

    public String display(int level){
        StringBuilder sb = new StringBuilder();
        sb.append("  ".repeat(level) + name + "( " );
        for(Expression e : parameters){
            sb.append(e.display() + " ");
        }
        sb.append(")\n");
        //sb.append(state.getProcedureContent(this.name).display(level+1));
        return sb.toString();
    }

}
