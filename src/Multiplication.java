/*
Represents Multiplication Expressions
enable to display and evaluate product of expressions
*/

public class Multiplication extends Expression {
  private Expression expresion1;
  private Expression expresion2;

  Multiplication(Expression expression1, Expression expression2) throws IllegalArgumentException {
    if (expression2 == null || expression1 == null) {
      throw new IllegalArgumentException("Expression can't be null");
    }
    this.expresion1 = expression1;
    this.expresion2 = expression2;
  }
  public static Multiplication of(Expression expresion1, Expression expresion2){
    return new Multiplication(expresion1, expresion2);
  }

  @Override
  public int evaluate(State variables) throws VariableNotFoundException, ZeroDivisionException {
    int value1 = expresion1.evaluate(variables);
    int value2 = expresion2.evaluate(variables);
    return value1 * value2;
  }

  @Override
  public String display() {
    return expresion1.display() + "*" + expresion2.display();
  }
}
