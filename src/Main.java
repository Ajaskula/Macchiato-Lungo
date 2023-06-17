import javax.sound.midi.VoiceStatus;
import java.util.List;

public class Main {
  // This is Program from the task, there are some commented lines to test this code for Exceptions
  public static void main(String[] args) throws VariableAlreadyDeclaredException {
    // This is program from the task
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    ProgramBlock glownyBlok = new ProgramBlock();
//
//    VariableDeclaration przyp1 = new VariableDeclaration('n', new NumericalLiteral(30));
//
//    glownyBlok.addDeclaration(przyp1);
//
//    ForLoop petla1 =
//        new ForLoop(new Variable('k'), new Subtraction(new Variable('n'), new NumericalLiteral(1)));
//
//    glownyBlok.addInstruction(petla1);
//
//    ProgramBlock blokwew = new ProgramBlock();
//
//    petla1.addInstruction(blokwew);
//
//    VariableDeclaration przyp2 = new VariableDeclaration('p', new NumericalLiteral(1));
//
//    blokwew.addDeclaration(przyp2);
//
//    AssigmentInstruction przyp =
//        new AssigmentInstruction('k', new Addition(new Variable('k'), new NumericalLiteral(2)));
//
//    blokwew.addInstruction(przyp);
//    List<Character> charList = Arrays.asList('a', 'b');
//    Block blokxd = new Block();
//    blokxd.addInstruction(new Print(new Addition(new Variable('a'), new Variable('k'))));
//    try {
//      blokwew.addDeclaration(new VariableDeclaration('k', new NumericalLiteral(2)));
//      blokwew.addDeclaration(new ProcedureDeclaration("name", charList, blokxd));
//    }catch (Exception e){
//
//    }
//    List<Expression> expressionList = Arrays.asList(new Variable('k'), new NumericalLiteral(4));
//    blokwew.addInstruction(new ProcedureCall("name", expressionList));
//
//    ForLoop loop2 =
//        new ForLoop(new Variable('i'), new Subtraction(new Variable('k'), new NumericalLiteral(2)));
//    blokwew.addInstruction(loop2);
//
//    AssigmentInstruction przyp3 =
//        new AssigmentInstruction('i', new Addition(new Variable('i'), new NumericalLiteral(2)));
//
//    loop2.addInstruction(przyp3);
//
//    IfInstruction war2 = new IfInstruction(new Modulo(new Variable('k'), new Variable('i')),
//        new NumericalLiteral(0), new EqExpression());
//
//    loop2.addInstruction(war2);
//
//    AssigmentInstruction przpy4 = new AssigmentInstruction('p', new NumericalLiteral(0));
//
//    war2.addIfInstruction(przpy4);
//
//    IfInstruction war3 =
//        new IfInstruction(new Variable('p'), new NumericalLiteral(1), new EqExpression());
//    blokwew.addInstruction(war3);
//
//    Print pri = new Print(new Variable('k'));
//
//    war3.addIfInstruction(pri);
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // This is code to test program for VariableAlreadyDeclaredException
    //       ProgramBlock glownyBlok = new ProgramBlock();
    //
    //       VariableDeclaration przyp1 = new VariableDeclaration('n', new NumericalLiteral(30));
    //
    //       glownyBlok.addDeclaration(przyp1);
    //
    //       ForLoop petla1 =
    //               new ForLoop(new Variable('k'), new Subtraction(new Variable('n'), new
    //               NumericalLiteral(1)));
    //
    //       glownyBlok.addInstruction(petla1);
    //
    //       ProgramBlock blokwew = new ProgramBlock();
    //
    //       petla1.addInstruction(blokwew);
    //
    //       VariableDeclaration przyp2 = new VariableDeclaration('p', new NumericalLiteral(1));
    //     VariableDeclaration przyp9 = new VariableDeclaration('p', new NumericalLiteral(1));
    //
    //       blokwew.addDeclaration(przyp2);
    //     blokwew.addDeclaration(przyp9);
    //
    //       AssigmentInstruction przyp =
    //               new AssigmentInstruction('k', new Addition(new Variable('k'), new
    //               NumericalLiteral(2)));
    //
    //       blokwew.addInstruction(przyp);
    //
    //       ForLoop loop2 =
    //               new ForLoop(new Variable('i'), new Subtraction(new Variable('k'), new
    //               NumericalLiteral(2)));
    //       blokwew.addInstruction(loop2);
    //
    //       AssigmentInstruction przyp3 =
    //               new AssigmentInstruction('i', new Addition(new Variable('i'), new
    //               NumericalLiteral(2)));
    //
    //       loop2.addInstruction(przyp3);
    //
    //       IfInstruction war2 = new IfInstruction(new Modulo(new Variable('k'), new
    //       Variable('i')),
    //               new NumericalLiteral(0), new EqExpression());
    //
    //       loop2.addInstruction(war2);
    //
    //       AssigmentInstruction przpy4 = new AssigmentInstruction('p', new NumericalLiteral(0));
    //
    //       war2.addIfInstruction(przpy4);
    //
    //       IfInstruction war3 =
    //               new IfInstruction(new Variable('p'), new NumericalLiteral(1), new
    //               EqExpression());
    //       blokwew.addInstruction(war3);
    //
    //       Print pri = new Print(new Variable('k'));
    //
    //       war3.addIfInstruction(pri);
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // This is code to test program for ZeroDivisionException
    //       ProgramBlock glownyBlok = new ProgramBlock();
    //
    //       VariableDeclaration przyp1 = new VariableDeclaration('n', new NumericalLiteral(30));
    //
    //       glownyBlok.addDeclaration(przyp1);
    //
    //       ForLoop petla1 =
    //               new ForLoop(new Variable('k'), new Subtraction(new Variable('n'), new
    //               NumericalLiteral(1)));
    //
    //       glownyBlok.addInstruction(petla1);
    //
    //       ProgramBlock blokwew = new ProgramBlock();
    //
    //       petla1.addInstruction(blokwew);
    //
    //       VariableDeclaration przyp2 = new VariableDeclaration('p', new NumericalLiteral(1));
    //
    //       blokwew.addDeclaration(przyp2);
    //
    //       AssigmentInstruction przyp =
    //               new AssigmentInstruction('k', new Addition(new Variable('k'), new
    //               NumericalLiteral(2)));
    //
    //       blokwew.addInstruction(przyp);
    //
    //       ForLoop loop2 =
    //               new ForLoop(new Variable('i'), new Subtraction(new Variable('k'), new
    //               NumericalLiteral(2)));
    //       blokwew.addInstruction(loop2);
    //
    //       AssigmentInstruction przyp3 =
    //               new AssigmentInstruction('i', new Addition(new Variable('i'), new
    //               NumericalLiteral(0)));
    //
    //       loop2.addInstruction(przyp3);
    //
    //       IfInstruction war2 = new IfInstruction(new Division(new Variable('k'), new
    //       Variable('i')),
    //               new NumericalLiteral(0), new EqExpression());
    //
    //       loop2.addInstruction(war2);
    //
    //       AssigmentInstruction przpy4 = new AssigmentInstruction('p', new NumericalLiteral(0));
    //
    //       war2.addIfInstruction(przpy4);
    //
    //       IfInstruction war3 =
    //               new IfInstruction(new Variable('p'), new NumericalLiteral(1), new
    //               EqExpression());
    //       blokwew.addInstruction(war3);
    //
    //       Print pri = new Print(new Variable('k'));
    //
    //       war3.addIfInstruction(pri);
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // This is code to test program for ModuloException
    //       ProgramBlock glownyBlok = new ProgramBlock();
    //
    //       VariableDeclaration przyp1 = new VariableDeclaration('n', new NumericalLiteral(30));
    //
    //       glownyBlok.addDeclaration(przyp1);
    //
    //       ForLoop petla1 =
    //               new ForLoop(new Variable('k'), new Subtraction(new Variable('n'), new
    //               NumericalLiteral(1)));
    //
    //       glownyBlok.addInstruction(petla1);
    //
    //       ProgramBlock blokwew = new ProgramBlock();
    //
    //       petla1.addInstruction(blokwew);
    //
    //       VariableDeclaration przyp2 = new VariableDeclaration('p', new NumericalLiteral(1));
    //
    //       blokwew.addDeclaration(przyp2);
    //
    //       AssigmentInstruction przyp =
    //               new AssigmentInstruction('k', new Addition(new Variable('k'), new
    //               NumericalLiteral(2)));
    //
    //       blokwew.addInstruction(przyp);
    //
    //       ForLoop loop2 =
    //               new ForLoop(new Variable('i'), new Subtraction(new Variable('k'), new
    //               NumericalLiteral(2)));
    //       blokwew.addInstruction(loop2);
    //
    //       AssigmentInstruction przyp3 =
    //               new AssigmentInstruction('i', new Addition(new Variable('i'), new
    //               NumericalLiteral(0)));
    //
    //       loop2.addInstruction(przyp3);
    //
    //       IfInstruction war2 = new IfInstruction(new Modulo(new Variable('k'), new
    //       Variable('i')),
    //               new NumericalLiteral(0), new EqExpression());
    //
    //       loop2.addInstruction(war2);
    //
    //       AssigmentInstruction przpy4 = new AssigmentInstruction('p', new NumericalLiteral(0));
    //
    //       war2.addIfInstruction(przpy4);
    //
    //       IfInstruction war3 =
    //               new IfInstruction(new Variable('p'), new NumericalLiteral(1), new
    //               EqExpression());
    //       blokwew.addInstruction(war3);
    //
    //       Print pri = new Print(new Variable('k'));
    //
    //       war3.addIfInstruction(pri);
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // This is code to test program for VariableNotFoundException
    //       ProgramBlock glownyBlok = new ProgramBlock();
    //
    //       VariableDeclaration przyp1 = new VariableDeclaration('n', new NumericalLiteral(30));
    //
    //       glownyBlok.addDeclaration(przyp1);
    //
    //       ForLoop petla1 =
    //               new ForLoop(new Variable('k'), new Subtraction(new Variable('n'), new
    //               NumericalLiteral(1)));
    //
    //       glownyBlok.addInstruction(petla1);
    //
    //       ProgramBlock blokwew = new ProgramBlock();
    //
    //       petla1.addInstruction(blokwew);
    //
    //       VariableDeclaration przyp2 = new VariableDeclaration('p', new NumericalLiteral(1));
    //
    //       blokwew.addDeclaration(przyp2);
    //
    //       AssigmentInstruction przyp =
    //               new AssigmentInstruction('k', new Addition(new Variable('k'), new
    //               NumericalLiteral(2)));
    //
    //       blokwew.addInstruction(przyp);
    //
    //       ForLoop loop2 =
    //               new ForLoop(new Variable('i'), new Subtraction(new Variable('j'), new
    //               NumericalLiteral(2)));
    //       blokwew.addInstruction(loop2);
    //
    //       AssigmentInstruction przyp3 =
    //               new AssigmentInstruction('i', new Addition(new Variable('i'), new
    //               NumericalLiteral(2)));
    //
    //       loop2.addInstruction(przyp3);
    //
    //       IfInstruction war2 = new IfInstruction(new Modulo(new Variable('k'), new
    //       Variable('i')),
    //               new NumericalLiteral(0), new EqExpression());
    //
    //       loop2.addInstruction(war2);
    //
    //       AssigmentInstruction przpy4 = new AssigmentInstruction('p', new NumericalLiteral(0));
    //
    //       war2.addIfInstruction(przpy4);
    //
    //       IfInstruction war3 =
    //               new IfInstruction(new Variable('p'), new NumericalLiteral(1), new
    //               EqExpression());
    //       blokwew.addInstruction(war3);
    //
    //       Print pri = new Print(new Variable('k'));
    //
    //       war3.addIfInstruction(pri);
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    var program = new ProgramBuilder()
            .declareVariable('x', Constant.of(57))
            .declareVariable('y', Constant.of(15))
            .declareProcedure(
                    "out", List.of('a'),
                    new BlockBuilder().print(Variable.named('a')).build()
            )
            .assign('x', Subtraction.of(Variable.named('x'), Variable.named('y')))
            .invoke("out", List.of(Variable.named('x')))
            .invoke("out", List.of(Constant.of(125)))
            .build();

    ProgramExecution execute = new ProgramExecution(program);
    // uncomment this line to run program with debugging
    execute.debug();
    // uncomment this to run program without debugging
    //      execute.execute();
  }
}