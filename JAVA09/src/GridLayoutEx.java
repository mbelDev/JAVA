import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {

  public GridLayoutEx() {
    setTitle("Gird_Layout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);

    Container contentPane = getContentPane();
    GridLayout grid = new GridLayout(5, 2, 10, 10);
    // or
    // Frame gird = new Frame();
    // grid.setLayout(new GridLayout(5, 2, 10, 10);
    contentPane.setLayout(grid);
    contentPane.add(new JLabel("Grid01"));
    contentPane.add(new JTextArea("Grid02"));
    contentPane.add(new JLabel("Grid03"));
    contentPane.add(new JTextArea("Grid04"));
    contentPane.add(new JLabel("Grid05"));
    contentPane.add(new JTextArea("Grid06"));
    contentPane.add(new JLabel("Grid07"));
    contentPane.add(new JTextArea("Grid08"));
    contentPane.add(new JButton("Grid09"));

    setVisible(true);
  }

  public static void main(String[] args) {
    new GridLayoutEx();
  }
}
