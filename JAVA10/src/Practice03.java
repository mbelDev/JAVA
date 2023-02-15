import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  private Container contentPane = getContentPane();
  private JLabel text;

  public Practice03() {
    setTitle("연습문제 2번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 150);
    contentPane.setLayout(new FlowLayout());
    contentPane.addKeyListener(new MyKey());

    text = new JLabel("Love Java");
    text.setSize(60, 30);
    contentPane.add(text);

    setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
  }

  private String loveJava(String txt) {
    StringBuffer target = new StringBuffer(txt);
    target.reverse();
    return target.toString();
  }

  private class MyKey extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      if (keyCode == KeyEvent.VK_LEFT) {
        text.setText(loveJava(text.getText()));
      }
    }
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
