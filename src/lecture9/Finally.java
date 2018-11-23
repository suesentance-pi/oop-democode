package lecture9;

public class Finally {

  private static int finallyTest() {
    try {
      return 4;
    } finally {
      return 5;
    }
  }

  public static void main(String[] args) {
    System.out.println(finallyTest());
  }
}
