package lecture1;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Printing the numbers from 1 to 10.
 *
 * <p>Demos of various control structures in Java
 */
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
    // In the lecture I recommended always writing braces for an if-statement in order to make your
    // code easier to read in future. And also to avoid misintepretation from bad-intentation. I
    // also talked about the importance of regular indentation to make the structure of your code
    // clear. For this course I am not prescribing what particular layout style you use - just be
    // consistent.
    if (i > 10) {
      return;
    }
    System.out.println(i);
    recursion(i + 1);
  }

  static void whileBreak() {
    int i = 1;
    while (true) {
      // In the lecture I talked about the fact that its better to minimise levels of nesting in
      // your code if possible. In this case we don't need to write 'else' and nest the println
      // because the loop exits in the if statement anyway.
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
      // switch statements are actually quite odd things - the code between case statements are NOT
      // separate blocks, and if you don't say break then it will fall through to the next case
      switch (i) {
        case 11:
          // In the lecture we saw that this didn't terminate if you just said break - because it
          // only exits the switch statement and not the while loop
          break LOOP;
        case 1:
          // there could be code here, and if it doesn't include break then we will fall through and
          // execute case 2,3 and default
        case 2:
        case 3:
        default:
          System.out.println(i++);
      }
    }
  }

  public static void main(String[] args) {
    forLoop();
    whileLoop();
    doWhileLoop();
    doForEach();
    intStream();
    recursion(1);
    whileBreak();
    whileContinue();
    whileSwitch();
    System.out.println("Done");
  }
}
