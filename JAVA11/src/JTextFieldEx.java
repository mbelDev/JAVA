import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldEx extends JFrame {

  private JRadioButton msList[] = new JRadioButton[4];
  private JTextField txtField = new JTextField(20);
  private JTextArea txtArea = new JTextArea(10, 20);

  public JTextFieldEx() {
    setTitle("JButton  실습");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    contentPane.add(new JLabel("이름"));
    contentPane.add(new JTextField(20));
    contentPane.add(new JLabel("학과"));
    contentPane.add(new JTextField("컴퓨터 조립학과", 20));
    // contentPane.add(txtArea);
    contentPane.add(txtField);
    contentPane.add(
      new JScrollPane(
        txtArea,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
      )
    );

    txtField.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          JTextField txtTarget = (JTextField) e.getSource();
          txtArea.append(txtTarget.getText() + "\n");
          txtTarget.setText("");
        }
      }
    );

    setVisible(true);
  }

  public static void main(String[] args) {
    new JTextFieldEx();
  }
}
