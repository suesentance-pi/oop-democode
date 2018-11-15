package lecture6;

class F1 {

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.out.println("I'm free!");
  }
}

public class Finalizer {

  public static void main(String[] args) {
    for (int i = 1; i < 1000000; i++) {
      new F1();
    }
    System.out.println("Done");
  }
}
