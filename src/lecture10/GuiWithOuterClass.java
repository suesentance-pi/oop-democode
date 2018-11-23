package lecture10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class ButtonCounter implements ActionListener {
  private final JButton button;
  private int counter;

  public ButtonCounter(JButton button) {
    this.button = button;
    this.counter = 0;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    counter++;
    button.setText(String.valueOf(counter));
  }
}

public class GuiWithOuterClass {
  private final JFrame frame;
  private final JButton button;

  GuiWithOuterClass() {
    frame = new JFrame();
    button = new JButton("BUTTON");
    button.addActionListener(new ButtonCounter(button));
    frame.add(button);
  }

  void show() {
    frame.setSize(100, 100);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    GuiWithOuterClass gui = new GuiWithOuterClass();
    gui.show();
  }
}
