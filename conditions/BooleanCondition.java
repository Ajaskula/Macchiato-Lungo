package conditions;

import exceptions.*;
import macchiato.State;
import expressions.*;

public interface BooleanCondition {
  abstract boolean evaluate(State variables, Expression left, Expression right)
      throws VariableNotFoundException, ZeroDivisionException;

  abstract String getOperator();
}
