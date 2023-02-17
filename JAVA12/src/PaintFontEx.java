import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaintFontEx extends JFrame {

  private MyPanel myPanel = new MyPanel();

  public PaintFontEx() {
    setTitle("Graphics 컴포넌트 활용");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 800);
    setContentPane(myPanel);
    // Container contentPane = getContentPane();
    // contentPane.add(test);

    setVisible(true);
  }

  class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.BLUE);
      g.drawString("GUNDAM", 30, 30);
      g.setFont(new Font("Arial", Font.ITALIC, 30));
      g.drawString("GUNDAM", 30, 60);
      g.drawLine(100, 100, 200, 100);
      g.drawLine(200, 100, 200, 200);
      g.drawLine(200, 200, 100, 200);
      g.drawLine(100, 200, 100, 100);
      g.setColor(new Color(0x99ccff));
      g.fillRect(250, 250, 100, 100);
      g.setColor(new Color(0x66ffcc));
      g.fillOval(250, 50, 100, 200);
      g.fillArc(150, 300, 100, 100, 0, 180);
      int[] x = { 30, 10, 30, 60 };
      int[] y = { 250, 300, 400, 300 };
      g.fillPolygon(x, y, 4);
    }
  }

  public static void main(String[] args) {
    new PaintFontEx();
  }
}
