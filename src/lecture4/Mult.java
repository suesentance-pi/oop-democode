package lecture4;

public class Mult extends Expression2 {

  private final Expression2 left;
  private final Expression2 right;

  public Mult(Expression2 left, Expression2 right) {
    this.left = left;
    this.right = right;
  }

  @Override
  int evaluate() {
    return left.evaluate() * right.evaluate();
  }
}
