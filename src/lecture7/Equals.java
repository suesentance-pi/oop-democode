package lecture7;

public class Equals {

  private int x = 8;

  /*
   * It is reflexive: for any non-null reference value x, x.equals(x)
   * should return true.
   * It is symmetric: for any non-null reference values x and y, x.equals(y)
   * should return true if and only if y.equals(x) returns true.
   * It is transitive: for any non-null reference values x, y, and z,
   * if x.equals(y) returns true and y.equals(z) returns true, then
   * x.equals(z) should return true.
   * It is consistent: for any non-null reference values x and y,
   * multiple invocations of x.equals(y) consistently return true or
   * consistently return false, provided no information used
   * in equals comparisons on the objects is modified.
   * For any non-null reference value x, x.equals(null) should return false.
   *
   */
  @Override
  public boolean equals(Object o) {
      // doesn't comply with spec...
    Equals e = (Equals) o;
    return (this.x == e.x);
  }
}
