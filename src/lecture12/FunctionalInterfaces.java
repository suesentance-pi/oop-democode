package lecture12;

interface CleverThing {

  int doStuff(int a, int b);
}

public class FunctionalInterfaces {

  private final int secret = 4;

  private static void test(CleverThing c) {
    for (int i = 0; i < 10; i++) {
      System.out.println(c.doStuff(i, 2 * i));
    }
  }

  private static int someMethod(int x, int y) {
    return x * y;
  }

  private int hahaha(int x, int y) {
    return x + y % secret;
  }

  public static void main(String[] args) {

    CleverThing f1 =
        new CleverThing() {
          @Override
          public int doStuff(int a, int b) {
            return a;
          }
        };
    test(f1);

    CleverThing f2 = (a, b) -> a;

    test(f2);

    test((a, b) -> b);

    CleverThing f3 = FunctionalInterfaces::someMethod;
    test(f3);

    test(FunctionalInterfaces::someMethod);

    FunctionalInterfaces fi = new FunctionalInterfaces();
    CleverThing f5 = fi::hahaha;
  }
}
