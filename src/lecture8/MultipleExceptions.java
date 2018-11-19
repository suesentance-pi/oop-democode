package lecture8;

import java.io.IOException;
import java.sql.SQLException;

public class MultipleExceptions {

  private static void doStuff(int x) throws IOException, SQLException {
    if (x == 0) {
      throw new IOException();
    }
    throw new SQLException();
  }

  public static void main(String[] args) {
    try {
      doStuff(2);
    } catch (IOException | SQLException e) { // this is called a multi-catch block
        // handle exception stored in e
    }
  }
}
