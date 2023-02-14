import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

  public MyFrame() {
    setTitle("300x300으로 스윙 프레임 만들기");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(new JButton("OK"));
    contentPane.add(new JButton("CANCEL"));
    contentPane.add(new JButton("Ignore"));

    setSize(300, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame();
  }
}
