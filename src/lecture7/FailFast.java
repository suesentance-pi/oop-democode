package lecture7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    //
    //    for (int i : list) {
    //      System.out.println(i);
    //      if (i == 0) {
    //        list.remove(0);
    //      }
    //    }

    Iterator<Integer> step = list.iterator();
    while (step.hasNext()) {
      int next = step.next();
      System.out.println(next);
      if (next == 0) {
        step.remove();
      }
    }
  }
}
