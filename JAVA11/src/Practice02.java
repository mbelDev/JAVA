import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice02 extends JFrame {

  private JComboBox<String> itemBox;

  public Practice02() {
    setTitle("연습문제 2번 635p");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(
      new JLabel("일단 적고 엔터를 치면 콤보 박스에 추가된당께▽")
    );

    JTextField inputBox = new JTextField(10);
    itemBox = new JComboBox<>();
    inputBox.addActionListener(new inputAction());
    contentPane.add(inputBox);
    contentPane.add(itemBox);

    setVisible(true);
  }

  class inputAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      JTextField target = (JTextField) e.getSource();
      itemBox.addItem(target.getText());
      target.setText("");
    }
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
