import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice06 extends JFrame {

  private JLabel target;

  public Practice06() {
    setTitle("연습문제 6번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    Container contentPane = getContentPane();
    contentPane.setLayout(null);

    target = new JLabel("C");
    target.setSize(20, 20);
    target.setLocation(100, 100);
    target.addMouseListener(new MyMouse());
    contentPane.add(target);

    setVisible(true);
  }

  private void jumpPointer() {
    target.setLocation(
      (int) (Math.random() * 250),
      (int) (Math.random() * 250)
    );
  }

  private class MyMouse extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
      jumpPointer();
    }
  }

  public static void main(String[] args) {
    new Practice06();
  }
}
