package lecture9;

import java.io.FileInputStream;
import java.io.IOException;

class MyFileInputStream extends FileInputStream {

  private MyFileInputStream(String name) throws IOException {
    super(name);
  }

  @Override
  public void close() throws IOException {
    super.close();
    System.out.println("CLOSE");
  }

  private static void test() {
    try (MyFileInputStream f = new MyFileInputStream("/doesntExist.txt")) {
      System.out.println("TRY");
    } catch (IOException e) {
      System.out.println("CATCH");
    } finally {
      System.out.println("FINALLY");
    }
  }

  public static void main(String[] args) {
    test();
  }
}
