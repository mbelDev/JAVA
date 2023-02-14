import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {

  private JLabel label = new JLabel("Hello");

  public MouseAdapterEx() {
    setTitle("If you Click AnyWhere, Label is Coming");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);

    Container contentPane = getContentPane();
    contentPane.addMouseListener(new MyMouseListener());

    contentPane.setLayout(null);
    label.setSize(50, 20);
    label.setLocation(30, 30);
    contentPane.add(label);

    setVisible(true);
  }

  class MyMouseListener extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      label.setLocation(x, y);
    }
  }

  public static void main(String[] args) {
    new MouseAdapterEx();
  }
}
