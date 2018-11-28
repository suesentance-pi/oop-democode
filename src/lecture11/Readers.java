package lecture11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readers {

  public static void main(String[] args) throws IOException {

    try (BufferedReader r = new BufferedReader(new FileReader("/Users/acr31/file.txt"))) {
      String line = null;
      while ((line = r.readLine()) != null) {
        System.out.println(">>> " + line);
      }
    }
  }
}
