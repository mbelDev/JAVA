import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

  static int GAP = 2;
  public Paddle paddle;
  public Ball ball;
  public Block blocks[][];
  public Thread th;

  public GamePanel() {
    System.out.println("Game Panel 생성자");
    this.setBackground(Color.BLACK);
    this.setPreferredSize(new Dimension(60 * 10 + GAP * 9, 900));

    th = new Thread(this);
    th.start();

    paddle = new Paddle();
    ball = new Ball();
    ball.x = paddle.x + 35;
    ball.y = paddle.y - 10;
    blocks = new Block[5][10];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        blocks[i][j] = new Block();
        blocks[i][j].x = (60 + GAP) * j;
        blocks[i][j].y = (30 + GAP) * i;
        blocks[i][j].color = i;
      }
    }

    this.addKeyListener(
        new KeyAdapter() {
          public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_LEFT) {
              paddle.isLeft = true;
              paddle.isRight = false;
            } else if (keyCode == KeyEvent.VK_RIGHT) {
              paddle.isLeft = false;
              paddle.isRight = true;
            } else if (keyCode == KeyEvent.VK_SPACE) {
              ball.shoot();
            }
          }

          public void keyReleased(KeyEvent e) {
            paddle.isLeft = false;
            paddle.isRight = false;
          }
        }
      );
    this.setFocusable(true);
    this.requestFocus();
  }

  public void paintComponent(Graphics g) {
    // super.paintComponents(g);
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);
    g.setColor(Color.RED);
    g.drawRect(paddle.x, paddle.y, paddle.width, paddle.height);
    g.fillOval(ball.x, ball.y, ball.width, ball.height);
    g.setColor(Color.RED);
    g.drawOval(ball.x, ball.y, ball.width, ball.height);
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        if (blocks[i][j].color == 0) {
          g.setColor(Color.BLUE);
        } else if (blocks[i][j].color == 1) {
          g.setColor(Color.GREEN);
        } else if (blocks[i][j].color == 2) {
          g.setColor(Color.MAGENTA);
        } else if (blocks[i][j].color == 3) {
          g.setColor(Color.YELLOW);
        } else if (blocks[i][j].color == 4) {
          g.setColor(Color.ORANGE);
        }
        if (!blocks[i][j].isHide) {
          g.fillRect(
            blocks[i][j].x,
            blocks[i][j].y,
            blocks[i][j].width,
            blocks[i][j].height
          );
        }
      }
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
      paddleMove();
      ball.move(paddle);
      ball.checkCollision(blocks);
    }
  }

  public void paddleMove() {
    if (paddle.isLeft) {
      paddle.x -= 10;
      if (!ball.moving) {
        ball.x -= 10;
      }
    } else if (paddle.isRight) {
      paddle.x += 10;
      if (!ball.moving) {
        ball.x += 10;
      }
    }
  }

  public void ballMove() {
    ball.x += ball.speedX;
    ball.y += ball.speedY;
  }
}
