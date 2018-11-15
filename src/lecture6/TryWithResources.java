package lecture6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class AutoFileInputStream implements AutoCloseable {

  private final FileInputStream fis;

  AutoFileInputStream() throws FileNotFoundException {
    this.fis = new FileInputStream("/tmp/stuff");
  }

  @Override
  public void close() throws IOException {
    fis.close();
    System.out.println("Closed");
  }
}

public class TryWithResources {

  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("/tmp/stuff.txt");
    try {
      // read a load of data
    } finally {
      fis.close();
    }

    try (AutoFileInputStream fis2 = new AutoFileInputStream()) {
      // read a load of data
    }
  }
}
