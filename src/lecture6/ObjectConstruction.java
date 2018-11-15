package lecture6;

import java.util.ArrayList;
import java.util.List;

class O1 {

  private static final int CONSTANT = makeMeAConstant();

  private static final List<String> veryComplicated;

  static {
    System.out.println("static initialiser");
    veryComplicated = new ArrayList<>();
    veryComplicated.add("thing");
  }

  private static final int ANOTHER = makeMeAnother();

  private final int y = makeMeAY();
  private final int x;

  O1() {
    System.out.println("Constructor for o1");
    x = 1;
  }

  static int makeMeAConstant() {
    System.out.println("Initialise CONSTANT");
    return 4;
  }

  static int makeMeAnother() {
    System.out.println("Initialise ANOTHER");
    return 4;
  }

  int makeMeAY() {
    System.out.println("Initialise y");
    return 1;
  }
}

public class ObjectConstruction {

  public static void main(String[] args) {

    new O1();
    new O1();
  }
}
