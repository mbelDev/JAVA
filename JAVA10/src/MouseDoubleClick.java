import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDoubleClick extends JFrame {

  private JLabel[] target;
  Container contentPane = getContentPane();

  public MouseDoubleClick() {
    setTitle("Mouse Event Practice");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 800);
    contentPane.setLayout(null);

    target = new JLabel[7];
    for (int i = 0; i < 7; i++) {
      target[i] =
        new JLabel() {
          public Container cont = contentPane;
        };
      contentPane.add(target[i]);
      target[i].setSize(50, 50);
      target[i].setLocation(
          (int) (Math.random() * 250),
          (int) (Math.random() * 750)
        );
      target[i].setOpaque(true);
      target[i].setBackground(
          new Color(
            (int) (Math.random() * 256),
            (int) (Math.random() * 256),
            (int) (Math.random() * 256)
          )
        );
      if (i != 0) {
        target[i].addMouseListener(new MyMouseListener());
      }
      target[0].setSize(300, 50);
      target[0].setLocation(0, 0);
      target[0].setText("같은 색을 찾아라");
    }

    setVisible(true);
  }

  public void setRandom() {
    for (int i = 0; i < 7; i++) {
      int r, g, b;
      r = (int) (Math.random() * 256);
      g = (int) (Math.random() * 256);
      b = (int) (Math.random() * 256);
      target[i].setBackground(new Color(r, g, b));
      target[i].setLocation(
          (int) (Math.random() * 250 + 25),
          (int) (Math.random() * 700 + 75)
        );
      target[0].setLocation(0, 0);
    }
  }

  class MyMouseListener extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() == 2) {
        setRandom();
      }
    }
  }

  public static void main(String[] args) {
    new MouseDoubleClick();
  }
}
