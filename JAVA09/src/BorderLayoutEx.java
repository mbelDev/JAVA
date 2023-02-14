import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {

  public BorderLayoutEx() {
    setTitle("Border_Layout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout(20, 20));
    contentPane.add(new JButton("OK"), BorderLayout.EAST);
    contentPane.add(new JButton("CANCEL"), BorderLayout.WEST);
    contentPane.add(new JButton("NORTH"), BorderLayout.NORTH);
    contentPane.add(new JButton("SOUTH"), BorderLayout.SOUTH);

    setVisible(true);
  }

  public static void main(String[] args) {
    new BorderLayoutEx();
  }
}
