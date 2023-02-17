import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice01 extends JFrame {

  private JButton testBtn = new JButton("TEST BUTTON");

  public Practice01() {
    setTitle("연습문제 1번 634p");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 200);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    JCheckBox boxActive = new JCheckBox("버튼 비활성화");
    JCheckBox boxVisible = new JCheckBox("버튼 감추기");
    boxActive.addItemListener(new ActiveBtn());
    boxVisible.addItemListener(new VisibleBtn());
    contentPane.add(boxActive);
    contentPane.add(boxVisible);
    contentPane.add(testBtn);

    setVisible(true);
  }

  class ActiveBtn implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
      testBtn.setEnabled(e.getStateChange() != ItemEvent.SELECTED);
    }
  }

  class VisibleBtn implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
      testBtn.setVisible(e.getStateChange() != ItemEvent.SELECTED);
    }
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
