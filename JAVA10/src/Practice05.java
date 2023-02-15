import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice05 extends JFrame {

  private Container contentPane = getContentPane();
  private JLabel text;

  public Practice05() {
    setTitle("연습문제 5번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 150);
    contentPane.setLayout(new FlowLayout());

    text = new JLabel("Love Java");
    text.setSize(60, 30);
    text.addKeyListener(new MyKey());
    text.setFont(new Font("Arial", Font.PLAIN, 20));
    contentPane.add(text);

    setVisible(true);
    text.setFocusable(true);
    text.requestFocus();
  }

  private void setSize(int keyCode) {
    Font target = text.getFont();
    int size = target.getSize();
    if (keyCode == 109) {
      size -= 5;
      if (size <= 5) {
        size = 5;
      }
    } else if (keyCode == 107) {
      size += 5;
    }
    text.setFont(new Font("Arial", Font.PLAIN, size));
  }

  private class MyKey extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      setSize(keyCode);
      System.out.println(keyCode);
    }
  }

  public static void main(String[] args) {
    new Practice05();
  }
}
