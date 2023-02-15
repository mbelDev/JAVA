import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame {

  private JLabel[] numPanel;
  private JLabel txtPanel;
  private boolean getReady = true;

  public Game() {
    setTitle("숫자 맞추기 게임");
    setSize(600, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();
    contentPane.setLayout(null);
    contentPane.addKeyListener(new MyKey());

    numPanel = new JLabel[3];
    for (int i = 0; i < 3; i++) {
      numPanel[i] = new JLabel("0");
      numPanel[i].setSize(80, 80);
      numPanel[i].setLocation(160 + (100 * i), 50);
      numPanel[i].setOpaque(true);
      numPanel[i].setBackground(Color.MAGENTA);
      numPanel[i].setForeground(Color.YELLOW);
      numPanel[i].setHorizontalAlignment(JLabel.CENTER);
      numPanel[i].setFont(new Font("Arial", Font.BOLD, 36));
      numPanel[i].setText("0");
      contentPane.add(numPanel[i]);
    }
    txtPanel = new JLabel("시작합니다");
    txtPanel.setSize(300, 50);
    txtPanel.setHorizontalAlignment(JLabel.CENTER);
    txtPanel.setFont(new Font("굴림", Font.BOLD, 36));
    txtPanel.setLocation(150, 180);
    contentPane.add(txtPanel);

    setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
  }

  boolean setRand() {
    int count = 0;
    for (int i = 0; i < 3; i++) {
      numPanel[i].setText(Integer.toString((int) (Math.random() * 5)));
      if (i > 0 && numPanel[i].getText().equals(numPanel[i - 1].getText())) {
        count++;
      }
    }
    return (count == 2);
  }

  class MyKey extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      if (e.getKeyChar() == '\n' && getReady) {
        if (setRand()) {
          txtPanel.setText("축하합니다!!");
          getReady = false;
        } else {
          txtPanel.setText("아쉽군요.");
        }
      }
    }

    public void keyReleased(KeyEvent e) {
      if (e.getKeyChar() == '\n') {
        getReady = true;
      }
    }
  }

  public static void main(String[] args) {
    new Game();
  }
}
