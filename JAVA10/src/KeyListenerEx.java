import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// class Player {

//   private int hp, spd, def, life;
//   private int x, y;

//   public Player() {
//     hp = 30;
//     spd = 5;
//     def = 0;
//     life = 3;
//   }

//   public Player(int _hp, int _spd, int _def, int _life) {
//     hp = _hp;
//     spd = _spd;
//     def = _def;
//     life = _life;
//   }

//   public void move(KeyEvent e) {
//     switch (e.getKeyCode()) {
//       case e.VK_LEFT:
//         x -= spd;
//       case e.VK_RIGHT:
//         x += spd;
//     }
//   }

//   public int getX() {
//     return x;
//   }

//   public int getY() {
//     return y;
//   }
// }

public class KeyListenerEx extends JFrame {

  private JLabel[] keyMessage;
  private JLabel player;

  public KeyListenerEx() {
    setTitle("Keyboard Input Check");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 800);
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.addKeyListener(new MyKeyListener());

    JPanel flowPanel = new JPanel();
    flowPanel.setLayout(new FlowLayout());
    flowPanel.setBackground(Color.GREEN);
    contentPane.add(flowPanel, BorderLayout.NORTH);

    JPanel nullPanel = new JPanel();
    nullPanel.setLayout(null);
    contentPane.add(nullPanel, BorderLayout.CENTER);

    keyMessage = new JLabel[3];
    keyMessage[0] = new JLabel("getKeyCode");
    keyMessage[1] = new JLabel("getKeyChar");
    keyMessage[2] = new JLabel("getKeyText");

    for (int i = 0; i < 3; i++) {
      flowPanel.add(keyMessage[i]);
      keyMessage[i].setOpaque(true);
      keyMessage[i].setBackground(Color.YELLOW);
      // keyMessage[i].
    }

    player = new JLabel("▲");
    player.setOpaque(true);
    player.setSize(50, 50);
    player.setLocation(150, 500);
    System.out.println(player.getX() + "/" + player.getY());
    nullPanel.add(player);

    setVisible(true);

    contentPane.setFocusable(true);
    contentPane.requestFocus();
  }

  private class MyKeyListener extends KeyAdapter {

    // @Override
    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      char keyChar = e.getKeyChar();
      keyMessage[0].setText(Integer.toString(keyCode));
      keyMessage[1].setText(Character.toString(keyChar));
      keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
      System.out.println("keyPressed");

      switch (keyCode) {
        case KeyEvent.VK_UP:
          player.setLocation(player.getX(), player.getY() - 10);
          break;
        case KeyEvent.VK_DOWN:
          player.setLocation(player.getX(), player.getY() + 10);
          break;
        case KeyEvent.VK_LEFT:
          player.setLocation(player.getX() - 10, player.getY());
          break;
        case KeyEvent.VK_RIGHT:
          player.setLocation(player.getX() + 10, player.getY());
          break;
      }
      System.out.println(player.getX() + "/" + player.getY());
    }

    public void keyReleased(KeyEvent e) {
      System.out.println("keyReleased");
    }

    public void keyTyped(KeyEvent e) {
      System.out.println("keyTyped");
    }
  }

  public static void main(String[] args) {
    new KeyListenerEx();
  }
}
