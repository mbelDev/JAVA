import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoinPanel extends JPanel implements Runnable {

  private Image back = new ImageIcon("images/brick-wall.png").getImage();
  private Image coin = new ImageIcon("images/star.png").getImage();
  private Image player = new ImageIcon("images/metroid.png").getImage();
  private int ani = 0;
  private int statusGame = 0;
  private boolean[] keyList = new boolean[4];
  private Thread th;
  private int playerX = 600;
  private int playerY = 600;
  private int coinX = 600;
  private int coinY = 600;
  private int count = 0;

  public CoinPanel() {
    th = new Thread(this);
    th.start();

    System.out.println("game panel");
    this.setPreferredSize(new Dimension(1280, 720));
    this.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub

          }

          @Override
          public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_LEFT) {
              keyList[0] = true;
            }
            if (keyCode == KeyEvent.VK_UP) {
              keyList[1] = true;
            }
            if (keyCode == KeyEvent.VK_RIGHT) {
              keyList[2] = true;
            }
            if (keyCode == KeyEvent.VK_DOWN) {
              keyList[3] = true;
            }
            if (keyCode == KeyEvent.VK_SPACE) {
              if (statusGame == 0) {
                statusGame = 1;
              }
            }
            // if (keyCode == KeyEvent.VK_SPACE){ System.out.println(this.)}
          }

          @Override
          public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_LEFT) {
              keyList[0] = false;
            }
            if (keyCode == KeyEvent.VK_UP) {
              keyList[1] = false;
            }
            if (keyCode == KeyEvent.VK_RIGHT) {
              keyList[2] = false;
            }
            if (keyCode == KeyEvent.VK_DOWN) {
              keyList[3] = false;
            }
          }
        }
      );
    this.setFocusable(true);
    this.requestFocus();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 8; j++) {
        g.drawImage(back, i * 110 - 10, j * 100 - 18, null);
      }
    }
    if (statusGame == 0) {
      g.setFont(new Font("Arial", Font.BOLD, 96));
      g.drawString("Get The Coin", 320, 300);
      g.setFont(new Font("Arial", Font.PLAIN, 32));
      g.drawString("Press Space bar to Start", 440, 500);
    }
    if (statusGame == 1) {
      g.drawImage(coin, coinX - 32, coinY - 32, null);
      g.drawArc(coinX - 32, coinY - 32, 64, 64, ani, 64);
      g.drawArc(coinX - 32, coinY - 32, 64, 64, ani + 180, 64);
      g.drawImage(player, playerX - 32, playerY - 32, null);

      g.setColor(Color.RED);
      g.drawRect(0, 0, 1280, 720);
    }
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(20);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      repaint();
      if (statusGame == 1) {
        ani += 3;
        playerMove();
        getCoin();
      }
    }
  }

  public void playerMove() {
    if (keyList[0] == true) {
      playerX -= 5;
    }
    if (keyList[1] == true) {
      playerY -= 5;
    }
    if (keyList[2] == true) {
      playerX += 5;
    }
    if (keyList[3] == true) {
      playerY += 5;
    }
  }

  public void getCoin() {
    double distX = coinX - playerX;
    double distY = coinY - playerY;
    double dist = Math.sqrt((distX * distX) + (distY * distY));
    if (dist < 32) {
      coinX = (int) (Math.random() * 1216 + 32);
      coinY = (int) (Math.random() * 656 + 32);
      count++;
    }
    if (count > 3) {
      if (dist < 120) {
        coinX += (coinX - playerX) / 32;
        coinY += (coinY - playerY) / 32;
      }
    }
    System.out.println(dist + " / " + coinX + ":" + coinY);
  }
}
