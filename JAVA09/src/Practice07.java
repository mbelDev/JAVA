import java.awt.*;
import javax.swing.*;

public class Practice07 extends JFrame {

  public Practice07() {
    setTitle("Practice07");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    final JPanel northPanel = new JPanel();
    // northPanel.setLayout(new GridLayout());
    northPanel.setBackground(Color.LIGHT_GRAY);
    final JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new GridLayout(4, 4));
    final JPanel southPanel = new JPanel();
    southPanel.setLayout(new FlowLayout());
    southPanel.setBackground(Color.YELLOW);

    JLabel northTitle = new JLabel("수식입력");
    JTextField north = new JTextField(16);
    northPanel.add(northTitle);
    northPanel.add(north);

    for (int i = 0; i < 16; i++) {
      JButton button = new JButton(stringSet(i));
      if (i > 11) {
        button.setBackground(Color.GREEN);
      }
      centerPanel.add(button);
    }

    JLabel southTitle = new JLabel("계산 결과");
    JTextField south = new JTextField(16);
    southTitle.setSize(400, 50);
    southPanel.add(southTitle);
    southPanel.add(south);

    contentPane.add(northPanel, BorderLayout.NORTH);
    contentPane.add(centerPanel, BorderLayout.CENTER);
    contentPane.add(southPanel, BorderLayout.SOUTH);

    setVisible(true);
  }

  private String stringSet(int num) {
    if (num < 10) {
      return Integer.toString(num);
    }
    switch (num) {
      case 10:
        return "CE";
      case 11:
        return "계산";
      case 12:
        return "+";
      case 13:
        return "-";
      case 14:
        return "*";
      default:
        return "/";
    }
  }

  public static void main(String[] args) {
    new Practice07();
  }
}
