package lecture1;

import java.util.List;
import java.util.stream.IntStream;

public class PrintingNumbers {

  static void forLoop() {
    for (int i = 1; i < 11; i++) {
      System.out.println(i);
    }
  }

  static void whileLoop() {
    int i = 1;
    while (i < 11) {
      System.out.println(i++);
    }
  }

  static void doWhileLoop() {
    int i = 1;
    do {
      System.out.println(i++);
    } while (i < 11);
  }

  static void doForEach() {
    List<Integer> i = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    for (int v : i) {
      System.out.println(v);
    }
  }

  static void intStream() {
    IntStream.range(1, 11).forEach(System.out::println);
  }

  static void recursion(int i) {
    if (i > 10) {
      return;
    }
    System.out.println(i);
    recursion(i + 1);
  }

  static void whileBreak() {
    int i = 1;
    while (true) {
      if (i > 10) {
        break;
      }
      System.out.println(i++);
    }
  }

  static void whileContinue() {
    int i = 1;
    while (true) {
      if (i < 11) {
        System.out.println(i++);
        continue;
      }
      break;
    }
  }

  static void whileSwitch() {
    int i = 1;
    LOOP:
    while (true) {
      switch (i) {
        case 11:
          break LOOP;
        case 1:
        case 2:
        case 3:
        default:
          System.out.println(i++);
      }
    }
  }

  public static void main(String[] args) {
    whileSwitch();
    System.out.println("Done");
  }
}
