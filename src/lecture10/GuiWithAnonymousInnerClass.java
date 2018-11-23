package lecture10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiWithAnonymousInnerClass {

  private final JFrame frame;
  private final JButton button;
  private int counter;

  GuiWithAnonymousInnerClass() {
    counter = 0;
    frame = new JFrame();
    button = new JButton("BUTTON");
    button.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            button.setText(counter++ + "");
          }
        });
    frame.add(button);
  }

  void show() {
    frame.setSize(100, 100);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    GuiWithAnonymousInnerClass gui = new GuiWithAnonymousInnerClass();
    gui.show();
  }
}
