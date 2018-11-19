package lecture7;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class BetterEquals {

  int x;

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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BetterEquals that = (BetterEquals) o;
    return x == that.x;
  }

  // hash code - if you override equals() you should also override hashCode
  @Override
  public int hashCode() {
    return Objects.hash(x);
  }

  private static boolean urlEquals() throws MalformedURLException {
    URL u = new URL("http://www.cam.ac.uk");
    URL u2 = new URL("http://www.ox.ac.uk");
    // here's an example of a poorly defined equals function
    return u.equals(u2);
  }
}
