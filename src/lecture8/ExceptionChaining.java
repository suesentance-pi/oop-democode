package lecture8;

import java.io.FileOutputStream;
import java.io.IOException;

class MyException extends Exception {

  MyException(String message, Throwable t) {
    super(message, t);
  }
}

public class ExceptionChaining {

  private static void doStuff() throws MyException {
    try (FileOutputStream fos = new FileOutputStream("/cantWrite.txt")) {

    } catch (IOException e) {
      // this is exception chaining - we keep a copy of the original
      // exception inside our new one
      throw new MyException("something bad!", e);
    }
  }

  public static void main(String[] args) throws MyException {
    doStuff();
  }
}
