package lecture10;

import java.util.ArrayList;
import java.util.List;

public class CovariantGenerics {

  public static void main(String[] args) {
    String s = "s";
    Object o = s;

    List<String> ls = List.of("Andy");
//    List<Object> os = ls;

//    Object o1 = os.get(0);

//    os.add(new ArrayList<String>());
  }
}
