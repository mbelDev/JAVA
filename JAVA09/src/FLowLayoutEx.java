import java.awt.*;
import javax.swing.*;

public class FLowLayoutEx extends JFrame {

  public FLowLayoutEx() {
    setTitle("Flow_Layout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);

    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
    contentPane.add(new JButton("add"));
    contentPane.add(new JButton("sub"));
    contentPane.add(new JButton("div"));
    contentPane.add(new JButton("mul"));

    setVisible(true);
  }

  public static void main(String[] args) {
    new FLowLayoutEx();
  }
}
