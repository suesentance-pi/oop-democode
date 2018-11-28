package lecture11;

public class SingletonConnection {

  private int x;

  private static final SingletonConnection instance = new SingletonConnection();

  // no instances
  private SingletonConnection() {}

  public static SingletonConnection getInstance() {
    return instance;
  }
}
