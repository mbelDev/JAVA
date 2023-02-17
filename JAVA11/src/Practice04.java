import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice04 extends JFrame {

  private JTextField totalMoney;
  private JTextField[] moneyInput = new JTextField[8];
  private String[] eachMoney = new String[8];
  private String[] checkMoney = new String[8];
  private JLabel alert = new JLabel();
  private JCheckBox[] checkBox;

  public Practice04() {
    setTitle("연습문제 4번");
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
    checkBox = new JCheckBox[8];
    CheckCalc checkListener = new CheckCalc();
    for (int i = 0; i < 8; i++) {
      mainPanel.add(new JLabel(nameMoney[i]));
      moneyInput[i] = new JTextField(10);
      mainPanel.add(moneyInput[i]);
      checkBox[i] = new JCheckBox("", true);
      checkBox[i].addItemListener(checkListener);
      mainPanel.add(checkBox[i]);
      checkMoney[i] = "true";
    }
    alert.setHorizontalAlignment(JLabel.CENTER);
    alert.setFont(new Font("돋움", Font.BOLD, 30));

    contentPane.add(titlePanel, BorderLayout.NORTH);
    contentPane.add(mainPanel, BorderLayout.CENTER);
    contentPane.add(alert, BorderLayout.SOUTH);
    setVisible(true);
  }

  class CheckCalc implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
      if (e.getStateChange() == ItemEvent.SELECTED) {
        if (e.getItem() == checkBox[0]) {
          checkMoney[0] = "true";
        }
        if (e.getItem() == checkBox[1]) {
          checkMoney[1] = "true";
        }
        if (e.getItem() == checkBox[2]) {
          checkMoney[2] = "true";
        }
        if (e.getItem() == checkBox[3]) {
          checkMoney[3] = "true";
        }
        if (e.getItem() == checkBox[4]) {
          checkMoney[4] = "true";
        }
        if (e.getItem() == checkBox[5]) {
          checkMoney[5] = "true";
        }
        if (e.getItem() == checkBox[6]) {
          checkMoney[6] = "true";
        }
        if (e.getItem() == checkBox[7]) {
          checkMoney[7] = "true";
        }
      }
      if (e.getStateChange() != ItemEvent.SELECTED) {
        if (e.getItem() == checkBox[0]) {
          checkMoney[0] = "false";
        }
        if (e.getItem() == checkBox[1]) {
          checkMoney[1] = "false";
        }
        if (e.getItem() == checkBox[2]) {
          checkMoney[2] = "false";
        }
        if (e.getItem() == checkBox[3]) {
          checkMoney[3] = "false";
        }
        if (e.getItem() == checkBox[4]) {
          checkMoney[4] = "false";
        }
        if (e.getItem() == checkBox[5]) {
          checkMoney[5] = "false";
        }
        if (e.getItem() == checkBox[6]) {
          checkMoney[6] = "false";
        }
        if (e.getItem() == checkBox[7]) {
          checkMoney[7] = "false";
        }
      }
    }
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
          int value = 0;
          switch (i) {
            case 0:
              if (checkMoney[0] != "true") {
                break;
              }
              value = total / 50000;
              total = value > 0 ? total % 50000 : total;
              break;
            case 1:
              if (checkMoney[1] != "true") {
                break;
              }
              value = total / 10000;
              total = value > 0 ? total % 10000 : total;
              break;
            case 2:
              if (checkMoney[2] != "true") {
                break;
              }
              value = total / 1000;
              total = value > 0 ? total % 1000 : total;
              break;
            case 3:
              if (checkMoney[3] != "true") {
                break;
              }
              value = total / 500;
              total = value > 0 ? total % 500 : total;
              break;
            case 4:
              if (checkMoney[4] != "true") {
                break;
              }
              value = total / 100;
              total = value > 0 ? total % 100 : total;
              break;
            case 5:
              if (checkMoney[5] != "true") {
                break;
              }
              value = total / 50;
              total = value > 0 ? total % 50 : total;
              break;
            case 6:
              if (checkMoney[6] != "true") {
                break;
              }
              value = total / 10;
              total = value > 0 ? total % 10 : total;
              break;
            case 7:
              if (checkMoney[7] != "true") {
                break;
              }
              value = total;
              total = 0;
              break;
            default:
              value = 0;
              alert.setText("계산할 수 없습니다!!");
              break;
          }
          eachMoney[i] = Integer.toString(value);
        }
        if (total > 0) {
          alert.setText("계산 후 잔액 : " + total + "원");
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
    new Practice04();
  }
}
