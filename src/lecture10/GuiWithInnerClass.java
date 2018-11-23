package lecture10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiWithInnerClass {

  private final JFrame frame;
  private final JButton button;
  private int counter;

  class ButtonCounter2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      counter++;
      button.setText(counter + "");
    }
  }

  GuiWithInnerClass() {
    counter = 0;
    frame = new JFrame();
    button = new JButton("BUTTON");
    button.addActionListener(new ButtonCounter2());
    frame.add(button);
  }

  void show() {
    frame.setSize(100, 100);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    GuiWithInnerClass gui = new GuiWithInnerClass();
    gui.show();
  }
}
