import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxEx extends JFrame {

  private String mobileSuit[] = { "RX-78", "RGM-79", "RMS-102", "NTX-03" };
  private ImageIcon iconsList[] = {
    new ImageIcon("images/gundam.png"),
    new ImageIcon("images/gundam_line.png"),
    new ImageIcon("images/gundam_line_gradient.png"),
    new ImageIcon("images/gundam_color.png"),
  };

  public JComboBoxEx() {
    setTitle("JButton  실습");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    JComboBox<String> strList = new JComboBox<>(mobileSuit);
    contentPane.add(new JScrollPane(strList));
    JComboBox<ImageIcon> imgList = new JComboBox<>(iconsList);
    contentPane.add(
      new JScrollPane(
        imgList,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
      )
    );

    setVisible(true);
  }

  public static void main(String[] args) {
    new JComboBoxEx();
  }
}
