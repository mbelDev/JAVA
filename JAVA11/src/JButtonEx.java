import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonEx extends JFrame {

  public JButtonEx() {
    setTitle("JButton  실습");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    ImageIcon icon = new ImageIcon("images/gundam_line.png");
    ImageIcon iconOver = new ImageIcon("images/gundam_line_gradient.png");
    ImageIcon iconClick = new ImageIcon("images/gundam_color.png");
    JButton btn = new JButton("BUTTON");
    JButton btnImg = new JButton("이미지 버튼", icon);
    btnImg.setBorderPainted(false);
    btnImg.setContentAreaFilled(false);
    btnImg.setFocusPainted(false);
    btnImg.setPressedIcon(iconClick);
    btnImg.setRolloverIcon(iconOver);
    contentPane.add(btn);
    contentPane.add(btnImg);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JButtonEx();
  }
}
