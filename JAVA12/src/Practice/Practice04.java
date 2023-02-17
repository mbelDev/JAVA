package Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice04 extends JFrame {

    private JLabel cursor = new myLabel()
    public Practice04(){
        setTitle("연습문제 1번 676p");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,600);
        setContentPane(cursor);

        JButton hideBtn = new JButton("Hide/Show");

        setVisible(true);
    }

    class MyPanel extends JPanel{

        private ImageIcon icon = new ImageIcon("images/gundam.png");
        private Image img = icon.getImage();

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), null);

        }
    }

    class ActionHidden implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            // JPanel target = e.getSource().target;
        }
    }
    public static void main(String[] args) {
        new Practice04();
    }
}
