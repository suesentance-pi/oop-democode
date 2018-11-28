package lecture12;

class EnumFan {

  enum State {
    OFF,
    SLOW,
    FAST
  }

  State state = State.OFF;

  void turn() {
    switch (state) {
      case OFF:
        System.out.println("OFF");
        break;
      case SLOW:
        System.out.println("SLOW");
        break;
      case FAST:
        System.out.println("FAST");
        break;
    }
  }

  void click() {
    switch (state) {
      case OFF:
        state = State.SLOW;
        break;
      case SLOW:
        state = State.FAST;
        break;
      case FAST:
        state = State.OFF;
        break;
    }
  }
}

public class EnumFanSpeed {

  public static void main(String[] args) {

    EnumFan fan = new EnumFan();
    fan.turn();
    fan.click();
    fan.turn();
    fan.click();
    fan.turn();
    fan.click();
    fan.turn();
  }
}
