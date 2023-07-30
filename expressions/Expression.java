package expressions;

import exceptions.VariableNotFoundException;
import exceptions.ZeroDivisionException;
import macchiato.State;

public abstract class Expression {
  public abstract int evaluate(State variables) throws VariableNotFoundException, ZeroDivisionException;

  public abstract String display();
}
