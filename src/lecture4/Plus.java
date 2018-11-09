package lecture4;

public class Plus extends Expression2 {

  private final Expression2 left;
  private final Expression2 right;

  public Plus(Expression2 left, Expression2 right) {
    this.left = left;
    this.right = right;
  }

  @Override
  int evaluate() {
    return left.evaluate() + right.evaluate();
  }
}
