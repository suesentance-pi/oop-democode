package lecture9;

class A {

  Object doStuff() {
    return new Object();
  }
}

class B extends A {
  @Override
  // covariance of return type
  String doStuff() {
    return "hello";
  }
}

public class Covariance {

  private static void takesA(A a) {
    Object o = a.doStuff();
  }

  private static void takesB(B b) {
    String s = b.doStuff();
  }

  public static void main(String[] args) {
    takesA(new A());
    takesB(new B());
    takesA(new B());
  }
}
