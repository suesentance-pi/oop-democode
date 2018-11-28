package lecture12;

class A implements Cloneable {
  @Override
  public A clone() {
    try {
      return (A) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }
}

class B extends A {
  @Override
  public B clone() {
    return (B) super.clone();
  }
}

public class Cloning {

  public static void main(String[] args) throws CloneNotSupportedException {

    A a1 = new A();
    A a2 = (A) a1.clone();

    B b1 = new B();
    B b2 = b1.clone();
  }
}
