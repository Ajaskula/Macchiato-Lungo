package expressions;

/* Represents Division expression
 enable to display and evaluate division of two expressions
 */

import exceptions.VariableNotFoundException;
import exceptions.ZeroDivisionException;
import macchiato.State;

public class Division extends Expression {
  private Expression expresion1;
  private Expression expresion2;

  Division(Expression expression1, Expression expression2) throws IllegalArgumentException {
    if (expression1 == null || expression2 == null) {
      throw new IllegalArgumentException("Expression can't be null");
    }
    this.expresion1 = expression1;
    this.expresion2 = expression2;
  }
  public static Division of(Expression expresion1, Expression expresion2){
      return new Division(expresion1, expresion2);
  }

  @Override
  public int evaluate(State variables) throws VariableNotFoundException, ZeroDivisionException {
    int value1 = expresion1.evaluate(variables);
    int value2 = expresion2.evaluate(variables);

    if (value2 == 0) {
      throw new ZeroDivisionException();
    }
    return value1 / value2;
  }

  @Override
  public String display() {
    return expresion1.display() + "/" + expresion2.display();
  }
}
