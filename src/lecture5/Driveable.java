package lecture5;

public interface Driveable {

  static final float PI = 3.14f;

  // this is actually final
  int f = 1;

  // every method is public
  public void turn();

  // every method is abstract
  abstract void brake();
}

class A implements Driveable {

  @Override
  public void turn() {
     // cant do this f is final
      f = 2;
  }

  @Override
  public void brake() {}
}
