import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice07 extends JFrame {

  private Container contentPane = getContentPane();
  private JLabel text;

  public Practice07() {
    setTitle("연습문제 5번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 150);
    contentPane.setLayout(new FlowLayout());

    text = new JLabel("Love Java");
    text.setSize(60, 30);
    MyMouse mouse = new MyMouse();
    text.addMouseListener(mouse);
    text.addMouseWheelListener(mouse);
    text.setFont(new Font("Arial", Font.PLAIN, 20));
    contentPane.add(text);

    setVisible(true);
  }

  private void setSize(int n) {
    Font target = text.getFont();
    int size = target.getSize();
    size += (5 * n);
    text.setFont(new Font("Arial", Font.PLAIN, size));
  }

  private class MyMouse extends MouseAdapter {

    public void mouseWheelMoved(MouseWheelEvent e) {
      setSize(e.getWheelRotation());
    }
  }

  public static void main(String[] args) {
    new Practice07();
  }
}
