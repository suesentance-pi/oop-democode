package lecture10;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiWithLambda {
  private final JFrame frame;
  private final JButton button;
  private int counter;

  GuiWithLambda() {
    counter = 0;
    frame = new JFrame();
    button = new JButton("BUTTON");
    button.addActionListener(a -> button.setText(counter++ + ""));
    frame.add(button);
  }

  void show() {
    frame.setSize(100, 100);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    GuiWithLambda gui = new GuiWithLambda();
    gui.show();
  }
}
