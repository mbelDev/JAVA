import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class DrawLineE extends JFrame {

  private MyPanel myPanel = new MyPanel();

  public DrawLineE() {
    setTitle("Graphics 컴포넌트 활용");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 800);
    setContentPane(myPanel);
    // Container contentPane = getContentPane();
    // contentPane.add(test);

    setVisible(true);
  }

  class MyPanel extends JPanel {

    private Vector<Point> vStart = new Vector<>();
    private Vector<Point> vEnd = new Vector<>();
    private ImageIcon icon = new ImageIcon("images/gundam_color.png");
    private Image img = icon.getImage();
    private int delay = 0;

    MyPanel() {
      //   vStart.add(new Point(100, 100));
      //   vStart.add(new Point(300, 150));
      //   vStart.add(new Point(200, 450));
      //   vEnd.add(new Point(200, 200));
      //   vEnd.add(new Point(200, 200));
      //   vEnd.add(new Point(200, 200));
      this.addMouseMotionListener(
          new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
              delay++;
              System.out.println(delay);
              if (delay > 10) {
                Point endPoint = e.getPoint();
                vEnd.add(endPoint);
                repaint();
                vStart.add(endPoint);
                delay = 0;
              }
            }
          }
        );
      this.addMouseListener(
          new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              Point startPoint = e.getPoint();
              vStart.add(startPoint);
            }
            // public void mouseReleased(MouseEvent e) {
            //   Point endPoint = e.getPoint();
            //   vEnd.add(endPoint);
            //   repaint();
            // }
          }
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.RED);
      for (int i = 0; i < vStart.size(); i++) {
        Point start = vStart.elementAt(i);
        Point end = vEnd.elementAt(i);
        g.drawLine(
          (int) start.getX(),
          (int) start.getY(),
          (int) end.getX(),
          (int) end.getY()
        );
      }
    }
  }

  public static void main(String[] args) {
    new DrawLineE();
  }
}
