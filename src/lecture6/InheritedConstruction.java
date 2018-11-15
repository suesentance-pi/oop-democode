package lecture6;

class I1 {

  private final int x = makeX();

  I1() {
    System.out.println("Constructor I1");
  }

  private int makeX() {
    System.out.println("I1.makeX()");
    return 1;
  }
}

class I2 extends I1 {
  private final int y = makeY();

  I2() {
    System.out.println("Constructor I2");
  }

  private int makeY() {
    System.out.println("I2.makeY()");
    return 6;
  }
}

public class InheritedConstruction {

  public static void main(String[] args) {
    new I2();
  }
}
