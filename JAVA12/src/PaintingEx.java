import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaintingEx extends JFrame {

  private MyPanel myPanel = new MyPanel();

  public PaintingEx() {
    setTitle("Graphics 컴포넌트 활용");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 800);
    setContentPane(myPanel);
    // Container contentPane = getContentPane();
    // contentPane.add(test);

    setVisible(true);
  }

  class MyPanel extends JPanel {

    private ImageIcon icon = new ImageIcon("images/gundam_color.png");
    private Image img = icon.getImage();

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setClip(100, 100, 50, 150);
      g.drawImage(img, 50, 50, 300, 300, this);
    }
  }

  public static void main(String[] args) {
    new PaintingEx();
  }
}
