package lecture2;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion {

  // final here means that options and prompt cannot be changed to reference something else after
  // they have been initialized. It doesn't prevent options being changed e.g. by adding a new
  // element
  private final List<String> options;
  private final String prompt;

  // we discussed immutability - if I don't take a copy of the list then someone could change it
  // after the fact
  public MultipleChoiceQuestion(List<String> options, String prompt) {
    this.options = new ArrayList<>(options);
    this.prompt = prompt;
  }
}
