import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DreamMS extends JFrame {

  private String[] MSlist = {
    "MA05.png",
    "MA05ad.png",
    "MS05.png",
    "MS06.png",
    "MS09.png",
    "MS14.png",
    "MSM03c.png",
    "MSM04.png",
    "MSM07E.png",
    "MSM10.png",
  };
  private String[] nameList = {
    "비그로(MA05)",
    "비그랑(MA05ad)",
    "구 자쿠(MS05)",
    "자쿠(MS06)",
    "돔(MS09)",
    "겔구그(MS14)",
    "하이곡그(MSM03c)",
    "앗가이(MSM04)",
    "즈고크 익스페리언트(MSM07E)",
    "족그(MSM10)",
  };
  private int round = 1;

  public DreamMS() {
    setTitle("당신이 꿈꾸는 드림MS~~");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 600);
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JLabel titleLabel = new JLabel(
      "당신이 꿈꾸는 모빌슈트" +
      (32 / round) +
      "강 원하는 모빌슈트를 클릭해 주세요."
    );
    titleLabel.setFont(new Font("돋움", Font.BOLD, 20));
    titleLabel.setHorizontalAlignment(JLabel.CENTER);

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());

    JPanel subPanel = new JPanel();
    subPanel.setSize(160, 200);
    JLabel txtLabel = new JLabel("VS");
    txtLabel.setSize(200, 200);
    txtLabel.setLocation(40, 30);
    txtLabel.setHorizontalAlignment(JLabel.CENTER);
    JLabel imgLabel = new JLabel(new ImageIcon("images/gundam.png"));
    imgLabel.setSize(200, 200);
    imgLabel.setLocation(40, 30);
    subPanel.add(txtLabel);
    subPanel.add(imgLabel);

    JPanel leftPanel = new JPanel();
    leftPanel.setLayout(new BorderLayout());
    JPanel rightPanel = new JPanel();
    rightPanel.setLayout(new BorderLayout());

    JLabel leftTitle = new JLabel(nameList[0]);
    leftTitle.setHorizontalAlignment(JLabel.CENTER);
    leftTitle.setFont(new Font("돋움", Font.BOLD, 20));
    JLabel leftLabel = new JLabel(setImage(0));
    leftPanel.add(leftLabel, BorderLayout.NORTH);
    leftPanel.setSize(300, 300);
    JLabel rightTitle = new JLabel(nameList[1]);
    rightTitle.setHorizontalAlignment(JLabel.CENTER);
    rightTitle.setFont(new Font("돋움", Font.BOLD, 20));
    JLabel rightLabel = new JLabel(setImage(1));
    rightPanel.add(rightLabel, BorderLayout.NORTH);
    rightPanel.setSize(300, 300);

    leftLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          if (round < 9) {
            round++;
            rightLabel.setIcon(setImage(round));
            rightTitle.setText(nameList[round]);
          } else {
            rightPanel.setVisible(false);
            subPanel.setVisible(false);
            leftLabel.setIcon(setImage((ImageIcon) leftLabel.getIcon(), 500));
            titleLabel.setText(
              "당신의 모빌슈트는" + leftTitle.getText() + "입니다!!"
            );
          }
        }
      }
    );
    leftPanel.add(leftTitle);

    rightLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          if (round < 9) {
            round++;
            leftLabel.setIcon(setImage(round));
            leftTitle.setText(nameList[round]);
          } else {
            leftPanel.setVisible(false);
            subPanel.setVisible(false);
            rightLabel.setIcon(setImage((ImageIcon) rightLabel.getIcon(), 500));
            titleLabel.setText(
              "당신의 모빌슈트는" + rightTitle.getText() + "입니다!!"
            );
          }
        }
      }
    );
    rightPanel.add(rightTitle);

    mainPanel.add(leftPanel); // 왼쪽 이미지 + 이름
    mainPanel.add(subPanel); // VS 표시
    mainPanel.add(rightPanel); // 오른쪽 이미지 + 이름

    //titleLabel = 제목 표시
    //mainPanel = FlowLayout으로 << leftPanel - subPanel - rightPanel >> 을 포함하고있음
    contentPane.add(titleLabel, BorderLayout.NORTH);
    contentPane.add(mainPanel, BorderLayout.CENTER);

    setVisible(true);
  }

  private ImageIcon setImage(int _round) {
    ImageIcon _img = new ImageIcon("images/" + MSlist[_round]);
    Image icon = _img.getImage();
    Image updateImg = icon.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
    ImageIcon updateIcon = new ImageIcon(updateImg);
    return updateIcon;
  }

  private ImageIcon setImage(ImageIcon _target, int _size) {
    Image icon = _target.getImage();
    Image updateImg = icon.getScaledInstance(_size, _size, Image.SCALE_SMOOTH);
    ImageIcon updateIcon = new ImageIcon(updateImg);
    return updateIcon;
  }

  public static void main(String[] args) {
    new DreamMS();
  }
}
