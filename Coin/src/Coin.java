import javax.swing.*;

public class Coin extends JFrame {

  public Coin() {
    this.setTitle("코인 먹기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CoinPanel coinPanel = new CoinPanel();
    this.setContentPane(coinPanel);
    this.setVisible(true);
    this.pack();
    this.setResizable(true);
  }

  public static void main(String[] args) {
    new Coin();
  }
}
