import java.awt.*;
import javax.swing.*;

public class Practice06 extends JFrame {

  public Practice06() {
    setTitle("Pracitce06");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);

    Container contentPane = getContentPane();
    contentPane.setLayout(null);
    for (int i = 0; i < 20; i++) {
      JLabel label = new JLabel();
      label.setSize(10, 10);
      label.setOpaque(true);
      label.setBackground(Color.BLUE);
      label.setLocation(
        (int) (Math.random() * 200 + 50),
        (int) (Math.random() * 200 + 50)
      );
      contentPane.add(label);
    }

    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice06();
  }
}
