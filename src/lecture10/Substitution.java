package lecture10;

public class Substitution {

  static void a(Object o) {
    System.out.println(o.hashCode());
  }

  static void a(int v) {
    System.out.println(v);
  }

  static int b() {
    return 2;
  }

  public static void main(String[] args) {
    /* 1 */
    a("andy");
    /* 2 */ Number two = b();
    /* 3 */ a(3);
    /* 4 */ "else".equals(null);
  }
}
