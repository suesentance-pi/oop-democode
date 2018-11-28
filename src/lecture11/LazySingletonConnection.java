package lecture11;

public class LazySingletonConnection {

  private static LazySingletonConnection instance = null;

  // no instances
  private LazySingletonConnection() {}

  public static LazySingletonConnection getInstance() {
    if (instance == null) {
      instance = new LazySingletonConnection();
    }
    return instance;
  }
}
