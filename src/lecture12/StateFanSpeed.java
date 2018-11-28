package lecture12;

class StateFan {

  void turn() {}

  void click() {}
}

public class StateFanSpeed {

  public static void main(String[] args) {

    StateFan fan = new StateFan();
    fan.turn();
    fan.click();
    fan.turn();
    fan.click();
    fan.turn();
    fan.click();
    fan.turn();
  }
}
