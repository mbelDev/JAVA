import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JComponentEx extends JFrame {

  public JComponentEx() {
    setTitle("JComponent Common Method");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);

    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    JButton btn01 = new JButton("bg:MAGENTA / color:YELLOW");
    btn01.setBackground(Color.MAGENTA);
    btn01.setForeground(Color.YELLOW);
    btn01.setFont(new Font("Arial", Font.PLAIN, 20));

    JButton btn02 = new JButton("Disalbe Button");
    btn02.setEnabled(false);
    btn02.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Click");
        }
      }
    );

    JButton btn03 = new JButton("getX(), getY()");

    contentPane.add(btn01);
    contentPane.add(btn02);
    contentPane.add(btn03);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JComponentEx();
  }
}
