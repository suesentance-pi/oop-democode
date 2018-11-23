package lecture9;

class C1 {

  void doStuff(String s) {
    System.out.println("C1");
  }
}

class C2 extends C1 {

  // this is contravariant argument types - not supported in Java
  // instead this method is overloaded
  //  @Override
  void doStuff(Object o) {
    System.out.println("C2");
  }
}

public class Contravariance {

  private static void takesC1(C1 c1) {
    c1.doStuff("hello");
  }

  private static void takesC2(C2 c2) {
    c2.doStuff(new Object());
  }

  public static void main(String[] args) {
    takesC1(new C1());
    takesC2(new C2());
    takesC1(new C2());
  }
}
