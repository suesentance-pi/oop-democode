package lecture4;

public class ExpressionEvaluator {

  public static void main(String[] args) {

    // Write a program that can evaluate arithmetic expressions such as 1 + 2 * 3

    //     +
    //    / \
    //   1  *
    //     / \
    //    2  3

    Literal one = new Literal(1);
    Literal two = new Literal(2);
    Literal three = new Literal(3);
    Mult mult = new Mult(two, three);
    Plus plus = new Plus(one, mult);

    System.out.println(plus.evaluate());

    //    Expression one = Expression.literal(1);
    //    Expression two = Expression.literal(2);
    //    Expression three = Expression.literal(3);
    //    Expression mult = Expression.mult(two, three);
    //    Expression plus = Expression.plus(one, mult);
    //    System.out.println(plus.evaluate());
  }
}
