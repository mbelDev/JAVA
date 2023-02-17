import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  private JTextField totalMoney;
  private JTextField[] moneyInput = new JTextField[8];
  private String[] eachMoney = new String[8];
  private JLabel alert = new JLabel();

  public Practice03() {
    setTitle("연습문제 3번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 600);
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.setBackground(new Color(200, 150, 150));

    JPanel titlePanel = new JPanel();
    titlePanel.setLayout(new FlowLayout());
    titlePanel.setOpaque(false);
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());
    mainPanel.setOpaque(false);

    totalMoney = new JTextField(20);
    JButton btnCalc = new JButton("계산");
    btnCalc.addActionListener(new RunCalc());
    titlePanel.add(new JLabel("금액"));
    titlePanel.add(totalMoney);
    titlePanel.add(btnCalc);

    String[] nameMoney = {
      "오만원",
      "만원",
      "천원",
      "오백원",
      "백원",
      "오십원",
      "십원",
      "잔돈",
    };
    for (int i = 0; i < 8; i++) {
      mainPanel.add(new JLabel(nameMoney[i]));
      moneyInput[i] = new JTextField(13);
      mainPanel.add(moneyInput[i]);
    }
    alert.setHorizontalAlignment(JLabel.CENTER);
    alert.setFont(new Font("돋움", Font.BOLD, 30));

    contentPane.add(titlePanel, BorderLayout.NORTH);
    contentPane.add(mainPanel, BorderLayout.CENTER);
    contentPane.add(alert, BorderLayout.SOUTH);
    setVisible(true);
  }

  class RunCalc implements ActionListener {

    private int total;

    @Override
    public void actionPerformed(ActionEvent e) {
      if (totalMoney.getText() != null) {
        try {
          total = Integer.parseInt(totalMoney.getText());
          alert.setText("");
        } catch (NumberFormatException total) {
          alert.setText("올바른 금액을 입력하세요.");
          return;
        }
      }
      System.out.println(total);
      if (total > 0) {
        for (int i = 0; i < 8; i++) {
          int value;
          switch (i) {
            case 0:
              value = total / 50000;
              break;
            case 1:
              value = (total % 50000) / 10000;
              break;
            case 2:
              value = (total % 10000) / 1000;
              break;
            case 3:
              value = (total % 1000) / 500;
              break;
            case 4:
              value = (total % 500) / 100;
              break;
            case 5:
              value = (total % 100) / 50;
              break;
            case 6:
              value = (total % 50) / 10;
              break;
            case 7:
              value = total % 10;
              break;
            default:
              value = total % 10;
              break;
          }
          eachMoney[i] = Integer.toString(value);
        }
        for (int j = 0; j < 8; j++) {
          moneyInput[j].setText(eachMoney[j]);
        }
      } else {
        for (int j = 0; j < 8; j++) {
          moneyInput[j].setText("0");
        }
      }
    }
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
