package game.pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameFrame10 extends JFrame implements ActionListener {

    ImageIcon back, img1, img2, img3, img4 ;
    JButton label1, label2, label3, label4 ;
    JLabel sugg1,sugg2,sugg3, sugg4, sugg5, sugg6, sugg7;
    JLabel label ;
    JTextField f1, f2, f3 , f4, f5, scr, bns ;
    int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0  ;
    int mf1 = 0, mf2 = 0, mf3 = 0, mf4 = 0, mf5 = 0 ;
    int matches = 0 ;
    Score s = new Score() ;
    

    GameFrame10() {

        setTitle("Word Puzzle - level 9") ;
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
        
        f4 = new JTextField() ;
        add(f4) ;
        f4.setLocation(10, 190) ;
        f4.setSize(70, 30) ;
        
        f5 = new JTextField() ;
        add(f5) ;
        f5.setLocation(10, 250) ;
        f5.setSize(70, 30) ;
        
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
        sugg3.setSize(200, 20) ;
        
        sugg4 = new JLabel("A word with 3 alphabet") ;
        add(sugg4) ;
        sugg4.setLocation(100, 190) ;
        sugg4.setSize(200, 20) ;
        
        sugg5 = new JLabel("A word with 4 alphabet") ;
        add(sugg5) ;
        sugg5.setLocation(100, 250) ;
        sugg5.setSize(200, 20) ;
        
        sugg6 = new JLabel("SCORE") ;
        add(sugg6) ;
        sugg6.setLocation(550, 40) ;
        sugg6.setSize(200, 20) ;
        
        sugg7 = new JLabel("BONUS") ;
        add(sugg7) ;
        sugg7.setLocation(550, 80) ;
        sugg7.setSize(200, 20) ;
        
        //score
        scr=new JTextField();
        add(scr);
        scr.setLocation(600,40);
        scr.setSize(100,30);
        
        bns=new JTextField();
        add(bns);
        bns.setLocation(600,80);
        bns.setSize(100,30);
        
        //for the buttons
        img1 = new ImageIcon(getClass().getResource("ttt.jpg")) ;
        label1 = new JButton(img1) ;
        add(label1) ;
        label1.setLocation(200, 350) ;
        label1.setSize(100, 100) ;

        img2 = new ImageIcon(getClass().getResource("ooo.jpg")) ;
        label2 = new JButton(img2) ;
        add(label2) ;
        label2.setLocation(500, 350) ;
        label2.setSize(100, 100) ;
        
        img3 = new ImageIcon(getClass().getResource("ppp.jpg")) ;
        label3 = new JButton(img3) ;
        add(label3) ;
        label3.setLocation(350, 450) ;
        label3.setSize(100, 100) ;
        
        img4 = new ImageIcon(getClass().getResource("eee.jpg")) ;
        label4 = new JButton(img4) ;
        add(label4) ;
        label4.setLocation(350, 250) ;
        label4.setSize(100, 100) ;
        
        //for the background
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
            if (flag1 == 0) 
            {
                flag1 = 1 ;
            } 
            else {
                flag1 = 0 ;
            }
            
            if (flag4 == 0) 
            {
                flag4 = 1 ;
            } 
            else {
                flag4 = 0 ;
            }

            if (mf2 == 0) 
            {
                if (flag2 == 2) 
                {
                    f3.setText("POT") ;
                    mf2 = 1 ;
                    
                    s.score = s.score + 10 ;
                    scr.setText(s.score + "") ;
                    
                    if (matches < 6) 
                    {
                        matches++;
                    }
                    
                    if (matches == 5) 
                    {
                        int x = JOptionPane.showConfirmDialog(null, "You Have Won.Wanna play again ?", "full match", 0) ;
                        
                        if (x == 0) 
                        {
                            this.setVisible(false) ;
                            new GameFrame11() ;
                        } 
                        else if (x == 1) 
                        {
                            System.exit(1) ;
                        }
                    }
                } 
                else 
                {
                    flag2 = 0 ;
                }
            }
            
            if (mf3 == 0) 
            {
                if (flag3 == 2) 
                {
                    f1.setText("PET") ;
                    mf3 = 1 ;
                    flag3 = 0 ;
                    s.score = s.score + 10 ;
                    scr.setText(s.score + "") ;
                    if (matches < 6) 
                    {
                        matches++ ;
                    }
                    
                    if (matches == 5) 
                    {
                        int x = JOptionPane.showConfirmDialog(null, "You Have Won.Wanna play again ?", "full match", 0) ;
                        
                        if (x == 0) 
                        {
                            this.setVisible(false) ;
                            new GameFrame11() ;
                        } 
                        else if (x == 1) 
                        {
                            System.exit(1) ;
                        }
                    }
                } 
                else 
                {
                    flag3 = 0;
                }
            }
            
            if (mf5 == 0) 
            {
                if (flag5 == 3) 
                {
                    f5.setText("POET") ;
                    mf5 = 1 ;
                    flag5 = 0 ;
                    
                    s.score = s.score + 10 ;
                    scr.setText(s.score + "") ;
                    if (matches < 6) 
                    {
                        matches++ ;
                    }
                    
                    if (matches == 5) 
                    {
                        int x = JOptionPane.showConfirmDialog(null, "You Have Won.Wanna play again ?", "full match", 0);
                        
                        if (x == 0) 
                        {
                            this.setVisible(false) ;
                            new GameFrame11() ;
                        } 
                        else if (x == 1) 
                        {
                            System.exit(1) ;
                        }
                    }
                } 
                else 
                {
                    flag5 = 0 ;
                }
            }
        }
        
        if (e.getSource() == label2) 
        {
            if (flag1 == 1) 
            {
                flag1 = 2 ;
            } 
            else 
            {
                flag1 = 0 ;
            }
            
            if (flag2 == 1) 
            {
                flag2 = 2 ;
            } 
            else 
            {
                flag2 = 0 ;
            }
            
            if (flag5 == 1) 
            {
                flag5 = 2 ;
                flag2 = 0 ;
                flag3 = 0 ;
            } 
            else 
            {
                flag5 = 0  ;
            }
        }
        
        if (e.getSource() == label3) 
        {
            if (flag2 == 0) 
            {
                flag2 = 1 ;
            } 
            else 
            {
                flag2 = 0 ;
            }
            
            if (flag3 == 0) 
            {
                flag3 = 1 ;
            } 
            else 
            {
                flag3 = 0 ;
            }
            
            if (flag5 == 0) 
            {
                flag5 = 1 ;
            } 
            else 
            {
                flag5 = 0 ;
            }
            
            if (mf1 == 0) 
            {
                if (flag1 == 2) 
                {
                    f2.setText("TOP") ;
                    mf1 = 1 ;
                    flag1 = 0 ;
                    
                    s.score = s.score + 10 ;
                    scr.setText(s.score + "");
                    
                    if (matches < 6) 
                    {
                        matches++ ;
                    }
                    if (matches == 5) 
                    {
                        int x = JOptionPane.showConfirmDialog(null, "You've Won! Wanna play again ?", "full match", 0) ;
                        if (x == 0) 
                        {
                            this.setVisible(false) ;
                            new GameFrame11() ;
                        } 
                        else if (x == 1) 
                        {
                            System.exit(1) ;
                        }
                    }
                } 
                else {
                    flag1 = 0;
                }
            }
            
            if (mf4 == 0) 
            {
                if (flag4 == 2) 
                {
                    f4.setText("TEP") ;
                    mf4 = 1;
                    flag4 = 0;
                    s.score = s.score + 10;
                    scr.setText(s.score + "") ;
                    if (matches < 6) 
                    {
                        matches++;
                    }
                    if (matches == 5) 
                    {
                        int x = JOptionPane.showConfirmDialog(null, "You've Won! Wanna play again ?", "full match", 0) ;
                        
                        if (x == 0) 
                        {
                            this.setVisible(false) ;
                            new GameFrame11() ;
                        } 
                        else if (x == 1) 
                        {
                            System.exit(1) ;
                        }
                    }
                } 
                else {
                    flag1 = 0 ;
                }
            }

        }
        if (e.getSource() == label4) 
        {
            if(flag3 == 1)
            {
                flag3 = 2 ;
            }
            else
            {
                flag3 = 0 ;
            }
            
            if(flag4 == 1)
            {
                flag4 = 2 ;
                flag1 = 0 ;
            }
            else
            {
                flag4 = 0 ;
            }
            
            if (flag5 == 2) 
            {
                flag5 = 3 ;
                flag2 = 0 ;
                flag3 = 0 ;
            } 
            else 
            {
                flag5 = 0 ;
            }
        }
    }

}
