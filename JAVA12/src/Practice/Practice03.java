package Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  private JLabel cursor = new JLabel();

  public Practice03() {
    setTitle("연습문제 1번 676p");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 600);
    Container contentPane = getContentPane();
    contentPane.setLayout(null);

    ImageIcon icon = new ImageIcon("images/gundam.png");
    Image img = icon.getImage();

    cursor = new JLabel();
    cursor.setSize(64, 64);
    cursor.addMouseMotionListener(new MyMouse());
    contentPane.add(cursor);

    setVisible(true);
  }

  class MyMouse extends MouseAdapter {

    public void mouseDragged(MouseEvent e) {
      // JPanel target = e.getSource().target;
    }
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
