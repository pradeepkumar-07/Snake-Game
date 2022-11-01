import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame implements ActionListener {
    JButton start = new JButton("Start Game");
    JButton exit = new JButton("Exit");
    StartFrame() {
        this.setTitle("Snake");
        this.setIconImage(new ImageIcon("game_logo.png").getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0,180,45));
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        start.addActionListener(this);
        start.setBounds(100,50,100,50);
        start.setBackground(Color.YELLOW);
        start.setFocusable(false);
        this.add(start);
        exit.addActionListener(this);
        exit.setBackground(Color.RED);
        exit.setBounds(100,150,100,50);
        exit.setFocusable(false);
        this.add(exit);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start) {
            new GameFrame();
            this.dispose();
        }
        if(e.getSource() == exit) {
            int selected = JOptionPane.showConfirmDialog(null,"Are you Sure you Want to exit ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if(selected == 0) {
                System.exit(0);
            }
        }
    }
}
