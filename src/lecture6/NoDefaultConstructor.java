package lecture6;

class No1 {

  final int x;

  No1(int x) {
    this.x = x;
  }
}

class No2 extends No1 {

  No2() {
    this(4);
  }

  No2(int x) {
    super(x);
  }
}

public class NoDefaultConstructor {
  public static void main(String[] args) {
    new No2();
  }
}
