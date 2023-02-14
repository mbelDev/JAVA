import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyActionListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton btn = (JButton) e.getSource();
    if (btn.getText().equals("Action")) {
      btn.setText("액션");
    } else {
      btn.setText("Action");
    }
  }
}

public class IndependantClassListener extends JFrame {

  public IndependantClassListener() {
    setTitle("Action Event");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);
    Container contentPane = getContentPane();
    contentPane.setLayout(null);

    JLabel label = new JLabel("TEST");
    label.setLocation(200, 200);
    label.setSize(100, 50);
    contentPane.add(label);

    JButton button = new JButton("CLick");
    button.setLocation(150, 150);
    button.setSize(100, 50);
    ActionListener listener = new MyActionListener();
    button.addActionListener(listener);
    contentPane.add(button);

    setVisible(true);
  }

  public static void main(String[] args) {
    new IndependantClassListener();
  }
}
