import java.awt.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  public Practice03() {
    setTitle("Gird_Layout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 300);

    Container contentPane = getContentPane();
    GridLayout grid = new GridLayout(1, 10);
    contentPane.setLayout(grid);
    for (int i = 0; i < 10; i++) {
      JButton button = new JButton("Grid" + Integer.toString(i));
      button.setSize(80, 300);
      button.setBackground(colorInt(i));
      contentPane.add(button);
    }

    setVisible(true);
  }

  private Color colorInt(int num) {
    switch (num) {
      case 0:
        return Color.RED;
      case 1:
        return Color.ORANGE;
      case 2:
        return Color.YELLOW;
      case 3:
        return Color.GREEN;
      case 4:
        return Color.CYAN;
      case 5:
        return Color.BLUE;
      case 6:
        return Color.MAGENTA;
      case 7:
        return Color.DARK_GRAY;
      case 8:
        return Color.PINK;
      default:
        return Color.GRAY;
    }
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
