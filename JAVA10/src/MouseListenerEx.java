import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {

  private JLabel label = new JLabel("Hello");

  public MouseListenerEx() {
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

  class MyMouseListener implements MouseListener {

    public void mousePressed(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      label.setLocation(x, y);
    }

    public void mouseReleased(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
  }

  public static void main(String[] args) {
    new MouseListenerEx();
  }
}
