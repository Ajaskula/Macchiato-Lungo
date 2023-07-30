package conditions;

import exceptions.VariableNotFoundException;
import exceptions.ZeroDivisionException;
import expressions.Expression;
import macchiato.State;

public class LessCondition implements BooleanCondition {
  @Override
  public boolean evaluate(State variables, Expression left, Expression right)
      throws VariableNotFoundException, ZeroDivisionException {
    return left.evaluate(variables) < right.evaluate(variables);
  }

  @Override
  public String getOperator() {
    return " < ";
  }
}
