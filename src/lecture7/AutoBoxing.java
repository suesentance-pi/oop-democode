package lecture7;

public class AutoBoxing {

  private static void test(int i) {
    System.out.println(i);
  }

  private static void test2(Integer i) {
    int j = i + 3;
  }

  public static void main(String[] args) {

    int i = 1;
    Integer j = 2; // autoboxes primitive type

    test(i);
    test(j); // unboxes the object

    test2(i); // boxes the primitive type
    test2(null);
  }
}
