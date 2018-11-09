package lecture4;

class Expression {

  private static final String OP_LITERAL = "LIT";
  private static final String OP_PLUS = "PLUS";
  private static final String OP_MULT = "MULT";

  private final int value;
  private final String operation;
  private final Expression left;
  private final Expression right;

  private Expression(int value, String operation, Expression left, Expression right) {
    this.value = value;
    this.operation = operation;
    this.left = left;
    this.right = right;
  }

  static Expression literal(int value) {
    return new Expression(value, OP_LITERAL, null, null);
  }

  static Expression mult(Expression left, Expression right) {
    return new Expression(0, OP_MULT, left, right);
  }

  static Expression plus(Expression left, Expression right) {
    return new Expression(0, OP_PLUS, left, right);
  }

  int evaluate() {
    switch (operation) {
      case OP_LITERAL:
        return value;
      case OP_PLUS:
        return left.evaluate() + right.evaluate();
      case OP_MULT:
        return left.evaluate() * right.evaluate();
    }
    throw new AssertionError("Unrecognised operation " + operation);
  }
}
