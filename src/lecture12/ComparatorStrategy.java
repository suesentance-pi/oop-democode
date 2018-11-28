package lecture12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorStrategy {

  public static void main(String[] args) {
    List<Integer> i = new ArrayList<>(List.of(1, 2, 3));

    Collections.sort(
        i,
        new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            return 0;
          }
        });
  }
}
