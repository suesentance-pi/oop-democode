package lecture5;

public interface Driveable {

  static final float PI = 3.14f;

  // this is actually final AND static
  int f = 1;

  // every method is public
  public void turn();

  // every method is abstract
  abstract void brake();
}

interface Another {
  int f = 2;
}

class A implements Driveable, Another {

  @Override
  public void turn() {
    // cant do this f is final
    //     f = 2;
    System.out.println(Another.f);
  }

  @Override
  public void brake() {}
}
