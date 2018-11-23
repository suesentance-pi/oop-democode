package lecture10;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {

  private final JButton button;
  private final JFrame frame;

  Gui() {
    frame = new JFrame();
    button = new JButton();
    frame.add(button);
    button.setText("HELLO!");
  }

  void show() {
    frame.setSize(100, 100);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Gui g = new Gui();
    g.show();
  }
}
