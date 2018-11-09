package lecture4;

public class Literal extends Expression2 {

  private final int value;

  public Literal(int value) {
    this.value = value;
  }

  @Override
  int evaluate() {
    return value;
  }
}
