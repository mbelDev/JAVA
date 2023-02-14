import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Practice05 extends JFrame {

  public Practice05() {
    setTitle("Practice05");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);

    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(4, 4));

    for (int i = 0; i < 16; i++) {
      JLabel label = new JLabel(Integer.toString(i));
      label.setOpaque(true);
      label.setBackground(colorSet(i));
      if (i != 10) {
        label.setForeground(Color.WHITE);
      }
      label.setSize(100, 50);
      contentPane.add(label);
    }

    setVisible(true);
  }

  private Color colorSet(int num) {
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
        return Color.GRAY;
      case 8:
        return Color.PINK;
      case 9:
        return Color.LIGHT_GRAY;
      case 10:
        return Color.WHITE;
      case 11:
        return Color.DARK_GRAY;
      case 12:
        return Color.BLACK;
      case 13:
        return Color.ORANGE;
      case 14:
        return Color.BLUE;
      default:
        return Color.MAGENTA;
    }
  }

  public static void main(String[] args) {
    new Practice05();
  }
}
