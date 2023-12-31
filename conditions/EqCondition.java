package conditions;

import exceptions.*;
import expressions.Expression;
import macchiato.State;

public class EqCondition implements BooleanCondition {
  @Override
  public boolean evaluate(State variables, Expression left, Expression right)
      throws VariableNotFoundException, ZeroDivisionException {
    return left.evaluate(variables) == right.evaluate(variables);
  }

  @Override
  public String getOperator() {
    return " == ";
  }
}