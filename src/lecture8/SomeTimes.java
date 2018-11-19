package lecture8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SomeTimes {

  public static void main(String[] args) {

    // 1
    long start1 = System.nanoTime();
    List<Integer> list1 = new LinkedList<>(List.of(1, 2, 3));
    int total1 = 0;
    for (int i = 0; i < list1.size(); i++) {
      total1 += list1.get(i);
    }
    long duration1 = System.nanoTime() - start1;

    // 2
    long start2 = System.nanoTime();
    List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
    int total2 = 0;
    for (int i = 0; i < list2.size(); i++) {
      total2 += list2.get(i);
    }
    long duration2 = System.nanoTime() - start2;

    // 3
    long start3 = System.nanoTime();
    int total3 = 0;
    for (int i = 0; i < 1000; i++) {
      total3 += i;
    }
    long duration3 = System.nanoTime() - start3;

    System.out.println(duration1);
    System.out.println(duration2);
    System.out.println(duration3);
  }
}
