import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice02 extends JFrame {

  private Container contentPane = getContentPane();
  private JLabel tester;

  public Practice02() {
    setTitle("연습문제 2번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    contentPane.setLayout(null);
    contentPane.setBackground(Color.GREEN);
    MyMouse mouse = new MyMouse();
    contentPane.addMouseListener(mouse);
    contentPane.addMouseMotionListener(mouse);

    tester = new JLabel("드래그 중");
    tester.setSize(60, 30);
    tester.setOpaque(true);
    tester.setBackground(Color.WHITE);
    tester.setLocation(-100, -100);
    contentPane.add(tester);

    setVisible(true);
  }

  private class MyMouse extends MouseAdapter {

    public void mouseDragged(MouseEvent e) {
      contentPane.setBackground(Color.YELLOW);
      tester.setLocation(e.getX() + 20, e.getY() - 20);
    }

    public void mouseReleased(MouseEvent e) {
      contentPane.setBackground(Color.GREEN);
      tester.setLocation(-100, -100);
    }
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
