import java.awt.*;
import javax.swing.*;

public class Practice08 extends JFrame {

  public Practice08() {
    setTitle("Practice08");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel northPanel = new JPanel();
    northPanel.setLayout(new FlowLayout());
    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(null);
    JPanel southPanel = new JPanel();
    southPanel.setLayout(new FlowLayout());

    northPanel.setBackground(Color.LIGHT_GRAY);
    northPanel.add(new JButton("열기"));
    northPanel.add(new JButton("닫기"));
    northPanel.add(new JButton("나가기"));

    for (int i = 0; i < 10; i++) {
      JLabel label = new JLabel("*");
      label.setForeground(Color.RED);
      label.setSize(10, 10);
      label.setLocation(
        (int) (Math.random() * 290),
        (int) (Math.random() * 175) + 38
      );
      centerPanel.add(label);
    }

    southPanel.setBackground(Color.GREEN);
    JButton southButton = new JButton("Word Input");
    southPanel.add(southButton);
    JTextField southField = new JTextField(15);
    southPanel.add(southField);

    contentPane.add(northPanel, BorderLayout.NORTH);
    contentPane.add(centerPanel, BorderLayout.CENTER);
    contentPane.add(southPanel, BorderLayout.SOUTH);

    setVisible(true);

    System.out.println(centerPanel.HEIGHT + " " + centerPanel.WIDTH);
    System.out.println(centerPanel.getX() + " " + centerPanel.getY());
    System.out.println(southPanel.getX() + " " + southPanel.getY());
  }

  public static void main(String[] args) {
    new Practice08();
  }
}
