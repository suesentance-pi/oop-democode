package lecture10;

public class BadCase {

  private static void decode(int i) {
    String result;
    switch (i) {
      case 1:
        result = "one bean";
      case 2:
        result = "two beans";
      default:
        result = "some beans";
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    decode(0); decode(1); decode(2); decode(3);
  }
}
