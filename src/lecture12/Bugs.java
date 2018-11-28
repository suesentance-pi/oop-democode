package lecture12;

public class Bugs {

  private static String a;
  private String b;

  Bugs(String a, String b) {
    this.a = a;
    this.b = b;
  }

  boolean matching() {
    return a.toLowerCase() == b.toLowerCase();
  }

  @Override
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    }
    if (other instanceof Bugs) {
      Bugs otherBugs = (Bugs) other;
      return a.equals(otherBugs.a) && b.equals(otherBugs.b);
    }
    return false;
  }
}
