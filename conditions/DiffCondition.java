package conditions;

import expressions.*;
import exceptions.*;
import macchiato.State;

public class DiffCondition implements BooleanCondition {
  @Override
  public boolean evaluate(State variables, Expression left, Expression right)
      throws VariableNotFoundException, ZeroDivisionException {
    return left.evaluate(variables) != right.evaluate(variables);
  }

  @Override
  public String getOperator() {
    return " != ";
  }
}
