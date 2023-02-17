import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaintPanelEx extends JFrame {

  private MyPanel myPanel = new MyPanel();

  public PaintPanelEx() {
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
      g.drawRect(10, 10, 50, 50);
      g.drawRect(50, 50, 50, 50);
      g.setColor(Color.MAGENTA);
      g.drawRect(90, 90, 50, 50);
    }
  }

  public static void main(String[] args) {
    new PaintPanelEx();
  }
}
