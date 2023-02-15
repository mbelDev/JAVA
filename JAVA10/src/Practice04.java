import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice04 extends JFrame {

  private Container contentPane = getContentPane();
  private JLabel text;

  public Practice04() {
    setTitle("연습문제 4번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 150);
    contentPane.setLayout(new FlowLayout());

    text = new JLabel("Love Java");
    text.setSize(60, 30);
    text.addKeyListener(new MyKey());
    contentPane.add(text);

    setVisible(true);
    text.setFocusable(true);
    text.requestFocus();
  }

  private String loveJava(String txt) {
    String result = (txt.substring(1) + txt.substring(0, 1));
    return result;
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
    new Practice04();
  }
}
