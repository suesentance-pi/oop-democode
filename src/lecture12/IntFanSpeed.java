package lecture12;

class IntFan {

  private int state = 0;

  void turn() {
    switch (state) {
      case 0:
        System.out.println("OFF");
        break;
      case 1:
        System.out.println("SLOW");
        break;
      case 2:
        System.out.println("FAST");
        break;
    }
  }

  void click() {
    switch (state) {
      case 0:
        state = 1;
        break;
      case 1:
        state = 2;
        break;
      case 2:
        state = 0;
        break;
    }
  }
}

public class IntFanSpeed {

  public static void main(String[] args) {

      IntFan i = new IntFan();
      i.turn();
      i.click();
      i.turn();
      i.click();
      i.turn();
      i.click();
      i.turn();
  }
}
