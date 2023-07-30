package instructions;

import expressions.Expression;
import macchiato.State;

/*
 represents numerical literal expression in Macchiato
 */
public class Constant extends Expression {
  private int value;

  public Constant(int value) {
    this.value = value;
  }

  public static Constant of(int value){
    return new Constant(value);
  }
  @Override
  public int evaluate(State variables) {
    return this.value;
  }

  @Override
  public String display() {
    return Integer.toString(value);
  }
}
