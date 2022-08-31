package game.pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameFrame5 extends JFrame implements ActionListener {

    ImageIcon back, img1, img2, img3, img4, bl1, bl2, pic1;
    JButton label1, label2, label3, label4;
    JLabel label;
    JLabel sugg1, sugg2, sugg3, sugg4, sugg5 ;
    JTextField f1, f2, f3, scr, bns ;
    int flag = 0, flag2 = 0, flag4 = 0 ;
    int mf1 = 0, mf2 = 0, mf3 = 0, mf4 = 0;
    int matches = 0;
    Score s = new Score( );

    GameFrame5() {

        setTitle("Word Puzzle - level 5") ;
        setVisible(true) ;
        setSize(800, 600) ;
        setLocationRelativeTo(null) ;
        setLayout(null) ;
        setResizable(false) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;

        //for the text field
        f1 = new JTextField() ;
        add(f1) ;
        f1.setLocation(10, 10) ;
        f1.setSize(70, 30) ;
        
        f2 = new JTextField() ;
        add(f2) ;
        f2.setLocation(10, 70) ;
        f2.setSize(70, 30) ;
        
        f3 = new JTextField() ;
        add(f3) ;
        f3.setLocation(10, 130) ;
        f3.setSize(70, 30) ;
        
        //for suggetion
        sugg1 = new JLabel("A word with 3 alphabet") ;
        add(sugg1) ;
        sugg1.setLocation(100, 10) ;
        sugg1.setSize(200, 20) ;
        
        sugg2 = new JLabel("A word with 3 alphabett") ;
        add(sugg2) ;
        sugg2.setLocation(100, 70) ;
        sugg2.setSize(200, 20) ;
       
        sugg3 = new JLabel("A word with 3 alphabet") ;
        add(sugg3) ;
        sugg3.setLocation(100, 130) ;
        sugg3.setSize(200, 20);
        
        sugg5 = new JLabel("SCORE") ;
        add(sugg5) ;
        sugg5.setLocation(550, 40) ;
        sugg5.setSize(200, 20) ;
        
        sugg4 = new JLabel("BONUS") ;
        add(sugg4) ;
        sugg4.setLocation(550, 80) ;
        sugg4.setSize(200, 20) ;
        
        //score
        scr=new JTextField();
        add(scr);
        scr.setLocation(600,40);
        scr.setSize(100,30);
        
        bns=new JTextField();
        add(bns);
        bns.setLocation(600,80);
        bns.setSize(100,30);
        
        //for buttons
        img1 = new ImageIcon(getClass().getResource("aaa.jpg")) ;
        label1 = new JButton(img1) ;
        add(label1) ;
        label1.setLocation(200, 350) ;
        label1.setSize(100, 100) ;

        img2 = new ImageIcon(getClass().getResource("ppp.jpg")) ;
        label2 = new JButton(img2) ;
        add(label2) ;
        label2.setLocation(500, 350) ;
        label2.setSize(100, 100) ;
        
        img3 = new ImageIcon(getClass().getResource("ccc.jpg")) ;
        label3 = new JButton(img3) ;
        add(label3) ;
        label3.setLocation(350, 450) ;
        label3.setSize(100, 100) ;
       
        img4 = new ImageIcon(getClass().getResource("ttt.jpg")) ;
        label4 = new JButton(img4);
        add(label4);
        label4.setLocation(350, 250);
        label4.setSize(100, 100);

        //for background
        back = new ImageIcon(getClass().getResource("backframe1.jpg")) ;
        label = new JLabel(back) ;
        add(label) ;
        label.setLocation(0, 0) ;
        label.setSize(800, 600) ;

        //button works
        label1.addActionListener(this) ;
        label2.addActionListener(this) ;
        label3.addActionListener(this) ;
        label4.addActionListener(this) ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == label1) 
        {
            if (flag == 1) 
            {
                flag = 2;
            } 
            else 
            {
                flag = 0;
            }
            if (flag2 == 0) {
                flag2 = 1;
            } else {
                flag2 = 0;
            }
            
            if(flag4 == 1)
            {
                flag4 = 2 ;
            }
            else
            {
                flag4 = 0 ;
            }
        }
        if (e.getSource() == label2) {
            if (mf3 == 0) 
            {
                if (flag == 2) 
                {
                    f1.setText("CAP");
                    s.score=s.score+10;
                    scr.setText(s.score+"");
                    mf3 = 1;
                    
                    if (matches < 4) {
                        matches++;
                    }
                    
                    if (matches == 3) 
                    {
                        int x = JOptionPane.showConfirmDialog(null, "You Have Won.Wanna play again ?", "full match", 0);
                        
                        if (x == 0) 
                        {
                           this.setVisible(false);
                           new GameFrame6();
                        } 
                        else if (x == 1) 
                        {
                            System.exit(1);
                        }
                    }
                } 
                else {
                    flag = 0;
                }
            }
            
            if (mf4 == 0) 
            {
                if (flag4 == 2) 
                {
                    
                    mf4 = 1;
                    
                    s.bonus = s.bonus + 5 ;
                    bns.setText(s.bonus + "") ;
                } 
                else {
                    flag4 = 0;
                }
            }
            
        }
        if (e.getSource() == label3) {
            if (flag == 0) 
            {
                flag = 1;
            } 
            else 
            {
                flag = 0;
            }
            if (flag2 == 1) {
                flag2 = 2;
            } else {
                flag2 = 0;
            }
        }
        if (e.getSource() == label4) {
            if (mf1 == 0) {
                if (flag == 2) {
                    f2.setText("CAT");
                    s.score=s.score+10;
                    scr.setText(s.score+"");
                    mf1 = 1;
                    flag = 0;
                    if (matches < 4) {
                        matches++;
                    }
                    if (matches == 3) {
                        int x = JOptionPane.showConfirmDialog(null, "You Have Won.Wanna play again ?", "full match", 0);
                        if (x == 0) {
                           this.setVisible(false);
                           new GameFrame6();
                        } else if (x == 1) {
                            System.exit(1);
                        }
                    }
                } else {
                    flag = 0;
                }
            }
            if (mf2 == 0) {
                if (flag2 == 2) {
                    f3.setText("ACT");
                    s.score=s.score+10;
                    scr.setText(s.score+"");
                    mf2 = 1;
                    if (matches < 4) {
                        matches++;
                    }
                    if (matches == 3) {
                        int x = JOptionPane.showConfirmDialog(null, "You Have Won.Wanna play again ?", "full match", 0);
                        if (x == 0) {
                            this.setVisible(false);
                           new GameFrame6();
                        } else if (x == 1) {
                            System.exit(1);
                        }
                    }
                } else {
                    flag2 = 0;
                }
            }
            
            if(flag4 == 0)
            {
                flag4 = 1 ;
            }
            else
            {
                flag4 = 0 ;
            }
        }
    }
}
