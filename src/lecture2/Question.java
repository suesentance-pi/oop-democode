package lecture2;

class Question {

  private String prompt;
  private String solution;

  Question(String prompt, String solution) {
    this.prompt = prompt;
    this.solution = solution;
  }

  void ask() {
    System.out.println(prompt);
  }

  boolean check(String answer) {
    return solution.equals(answer);
  }

  // we discussed how this does not make the class mutable - but only because Strings are immutable.
  // Otherwise someone could change the contents of the prompt string and therefore change us.
  String getPrompt() {
    return prompt;
  }
}
