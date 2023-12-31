package declarations;

import exceptions.ModuloException;
import exceptions.VariableAlreadyDeclaredException;
import exceptions.VariableNotFoundException;
import exceptions.ZeroDivisionException;
import expressions.Expression;
import macchiato.State;

public class VariableDeclaration extends Declaration{
  private Expression expression;
  private Character name;

  public VariableDeclaration(Character name, Expression expression) {
    if (name == null || expression == null || !name.isLowerCase(name)) {
      throw new IllegalArgumentException("Illegal variable name");
    }
    this.expression = expression;
    this.name = name;
  }

  // adds variable to the current state
  @Override
  public void execute(State variables) throws VariableAlreadyDeclaredException,
          VariableNotFoundException, ZeroDivisionException,
          ModuloException {
    variables.addVariable(this.name, this.expression.evaluate(variables));
  }
}
