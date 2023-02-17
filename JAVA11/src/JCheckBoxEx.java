import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxEx extends JFrame {

  private JCheckBox msList[] = new JCheckBox[4];
  private String nameList[] = { "자쿠", "겔구그", "돔", "지옹" };
  private JLabel sumLabel;

  public JCheckBoxEx() {
    setTitle("JButton  실습");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel title = new JLabel(
      "자쿠 500원 / 겔구그 1,400원 / 돔 900원 / 지옹 4,200원"
    );
    contentPane.add(title);

    MyItemListener listener = new MyItemListener();
    ButtonGroup btnGroup = new ButtonGroup();
    for (int i = 0; i < 4; i++) {
      msList[i] = new JCheckBox(nameList[i]);
      msList[i].addItemListener(listener);
      btnGroup.add(msList[i]);
      contentPane.add(msList[i]);
    }

    sumLabel = new JLabel("합계 : 0원");
    contentPane.add(sumLabel);

    setVisible(true);
  }

  class MyItemListener implements ItemListener {

    private int sum = 0;

    @Override
    public void itemStateChanged(ItemEvent e) {
      if (e.getStateChange() == ItemEvent.SELECTED) {
        if (e.getItem() == msList[0]) {} else if (
          e.getItem() == msList[1]
        ) {} else if (e.getItem() == msList[2]) {} else if (
          e.getItem() == msList[3]
        ) {}
      }
      if (e.getStateChange() != ItemEvent.SELECTED) {
        if (e.getItem() == msList[0]) {} else if (
          e.getItem() == msList[1]
        ) {} else if (e.getItem() == msList[2]) {} else if (
          e.getItem() == msList[3]
        ) {}
      }
      sumLabel.setText("합계 : " + sum + "원");
    }
  }

  public static void main(String[] args) {
    new JCheckBoxEx();
  }
}
