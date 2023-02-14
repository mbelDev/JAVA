import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {

  public AnonymousClassListener() {
    setTitle("Action Event");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);
    Container contentPane = getContentPane();
    contentPane.setLayout(null);

    JButton button = new JButton("CLick");
    button.setLocation(150, 150);
    button.setSize(100, 50);
    ActionListener listener = new MyActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (button.getText().equals("Action")) {
          button.setText("액션");
        } else {
          button.setText("Action");
        }
        setTitle("UGOKUNA");
      }
    };
    button.addActionListener(listener);
    contentPane.add(button);

    JLabel label = new JLabel("TEST");
    label.setLocation(200, 200);
    label.setSize(100, 50);
    contentPane.add(label);

    setVisible(true);
  }

  public static void main(String[] args) {
    new AnonymousClassListener();
  }
}
