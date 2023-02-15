import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice01 extends JFrame {

  public Practice01() {
    setTitle("연습문제 1번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel label = new JLabel("I Like GUNDAM");
    label.addMouseListener(new MyMouse());
    contentPane.add(label);

    setVisible(true);
  }

  private class MyMouse extends MouseAdapter {

    public void mouseEntered(MouseEvent e) {
      JLabel target = (JLabel) e.getSource();
      target.setText("나는 건담이 좋아");
    }

    public void mouseExited(MouseEvent e) {
      JLabel target = (JLabel) e.getSource();
      target.setText("I like GUNDAM");
    }
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
