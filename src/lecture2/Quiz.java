package lecture2;

import java.util.List;
import java.util.Scanner;

public class Quiz {

  private void start() {

    List<Question> questions =
        List.of(
            new Question("What's the best programming language?", "Prolog"),
            new Question("What's the best college?", "Mine"));

    int numberCorrect = 0;
    Scanner scanner = new Scanner(System.in);

    for (Question q : questions) {
      q.ask();
      String answer = scanner.nextLine();
      if (q.check(answer)) {
        numberCorrect++;
      }
    }

    System.out.printf("Fantastic! You got %d correct%n", numberCorrect);
  }

  public static void main(String[] args) {
    new Quiz().start();
  }
}
