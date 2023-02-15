import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JLabelEx extends JFrame {

  public JLabelEx() {
    setTitle("JLabel Common Method");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel txtLabel = new JLabel("GUNDAM");
    JLabel imgLabel = new JLabel(new ImageIcon("images/gundam.png"));

    contentPane.add(txtLabel);
    contentPane.add(imgLabel);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JLabelEx();
  }
}
