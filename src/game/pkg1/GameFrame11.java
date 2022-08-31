package game.pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameFrame11 extends JFrame implements ActionListener {

    ImageIcon back, img1, img2, img3, img4, img5, bl1, bl2, pic1;
    JButton label1, label2, label3, label4, label5;
    JLabel label, sugg1, sugg2, sugg3, sugg4, sugg5;
    JTextField f1, f2, f3, scr, bns;
    int flag4 = 0, flag1 = 0, flag2 = 0, flag5 = 0;
    int mf1 = 0, mf2 = 0, mf4 = 0, mf5 = 0;
    int matches = 0;
    Score s = new Score();

    GameFrame11() {

        setTitle("Word Puzzle - level 10");
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //firstmatch
        f1 = new JTextField();
        add(f1);
        f1.setLocation(10, 10);
        f1.setSize(70, 35);
        //
        f2 = new JTextField();
        add(f2);
        f2.setLocation(10, 70);
        f2.setSize(70, 35);
        //
        f3 = new JTextField();
        add(f3);
        f3.setLocation(10, 130);
        f3.setSize(70, 35);
        
        //suggetion
        sugg1 = new JLabel("Use 5 Alphabet");
        add(sugg1);
        sugg1.setLocation(100, 10);
        sugg1.setSize(100, 20);

        sugg2 = new JLabel("Use 4 Alphabet");
        add(sugg2);
        sugg2.setLocation(100, 70);
        sugg2.setSize(100, 20);

        sugg3 = new JLabel(" Use 3 Alphabet");
        add(sugg3);
        sugg3.setLocation(100, 130);
        sugg3.setSize(100, 20);
        
        sugg5 = new JLabel("SCORE") ;
        add(sugg5) ;
        sugg5.setLocation(550, 40) ;
        sugg5.setSize(200, 20) ;
        
        sugg4 = new JLabel("BONUS") ;
        add(sugg4) ;
        sugg4.setLocation(550, 80) ;
        sugg4.setSize(200, 20) ;

        //score
        scr = new JTextField();
        add(scr);
        scr.setLocation(600, 40);
        scr.setSize(100, 30);

        bns = new JTextField();
        add(bns);
        bns.setLocation(600, 80);
        bns.setSize(100, 30);

        //button rrr
        img1 = new ImageIcon(getClass().getResource("ttt.jpg"));
        label1 = new JButton(img1);
        add(label1);
        label1.setLocation(200, 300);
        label1.setSize(100, 100);

        //button aaa
        img2 = new ImageIcon(getClass().getResource("eee.jpg"));
        label2 = new JButton(img2);
        add(label2);
        label2.setLocation(500, 300);
        label2.setSize(100, 100);
        //button ddd
        img3 = new ImageIcon(getClass().getResource("aaa.jpg"));
        label3 = new JButton(img3);
        add(label3);
        label3.setLocation(350, 430);
        label3.setSize(100, 100);
        //button yyy
        img4 = new ImageIcon(getClass().getResource("ddd.jpg"));
        label4 = new JButton(img4);
        add(label4);
        label4.setLocation(350, 170);
        label4.setSize(100, 100);
        //
        img5 = new ImageIcon(getClass().getResource("xxx.jpg"));
        label5 = new JButton(img5);
        add(label5);
        label5.setLocation(350, 300);
        label5.setSize(100, 100);

        //back........
        back = new ImageIcon(getClass().getResource("backframe1.jpg"));
        label = new JLabel(back);
        add(label);
        label.setLocation(0, 0);
        label.setSize(800, 600);
       
        //button label
        label1.addActionListener(this);
        label2.addActionListener(this);
        label3.addActionListener(this);
        label4.addActionListener(this);
        label5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == label1) {
            if (flag1 == 0) {
                flag1 = 1;
            } else {
                flag1 = 0;
            }

            if (flag2 == 2) {
                flag2 = 3;
            } else {
                flag2 = 0;
            }

            if (flag5 == 0) {
                flag5 = 1;
            } else {
                flag5 = 0;
            }
            if (mf5 == 0) {
                if (flag4 == 2) {
                    //f3.setText("EAT");
                    mf5 = 1;

                    s.bonus = s.bonus + 5;
                    bns.setText(s.bonus + "");

                } 
                else {
                    flag4 = 0;
                }
            }

        }

        if (e.getSource() == label2)
        {
            if (flag1 == 3) {
                flag1 = 4;
            } else {
                flag1 = 0;
            }
            if (mf2 == 0) {
                if (flag2 == 3) {
                    f2.setText("DATE");
                    mf2 = 1;
                    flag2 = 0;
                    s.score = s.score + 10;
                    scr.setText(s.score + "");
                    if (matches < 4) {
                        matches++;
                    }
                    if (matches == 3) {
                        int x = JOptionPane.showConfirmDialog(null, "You've Won! Wanna play again ?", "full match", 0);
                        if (x == 0) {
                            this.setVisible(false);
                            new GameFrame12();
                        } else if (x == 1) {
                            System.exit(1);
                        }
                    }
                }
                else {
                    flag2 = 0;
                }
            }
            
                if (flag5 == 1) {
                    flag5 = 2;
                } else {
                    flag5 = 0;
                }
                
                if (flag4 == 0) {
                    flag4 = 1;
                } 
                else {
                    flag4 = 0;
                }
        }
        

            if (e.getSource() == label3) {
                if (flag1 == 1) {
                    flag1 = 2;
                } else {
                    flag1 = 0;
                }
                if (flag4 == 1) {
                    flag4 = 2;
                } 
                else {
                    flag4 = 0;
                }

                if (flag2 == 1) {
                    flag2 = 2;
                } 
                else {
                    flag2 = 0;
                }
                if (mf4 == 0) {
                    if (flag5 == 2) {
                        f3.setText("TEA");
                        mf4 = 1;
                        flag5 = 0;
                        s.score = s.score + 10;
                        scr.setText(s.score + "");
                        if (matches < 4) {
                            matches++;
                        }
                        if (matches == 3) {
                            int x = JOptionPane.showConfirmDialog(null, "You've Won! Wanna play again ?", "full match", 0);
                            if (x == 0) {
                                this.setVisible(false);
                                new GameFrame12();
                            } else if (x == 1) {
                                System.exit(1);
                            }
                        }
                    }
                    else {
                        flag5 = 0;
                    }
                }
            }

            if (e.getSource() == label4) {
                if (mf1 == 0) {
                    if (flag1 == 4) {
                        f1.setText("TAXED");
                        mf1 = 1;
                        flag1 = 0;
                        s.score = s.score + 10;
                        scr.setText(s.score + "");
                        if (matches < 4 ) {
                            matches++;
                           
                        }
                        if (matches == 3) {
                            int x = JOptionPane.showConfirmDialog(null, "You've Won! Wanna play again ?", "full match", 0);
                            if (x == 0) {
                              this.setVisible(false);
                              new GameFrame12();
                            } 
                            else if (x == 1) {
                                System.exit(1);
                            }
                        }
                    }
                    else {
                        flag1 = 0;
                    }
                }
                    if (flag2 == 0) {
                        flag2 = 1;
                    } 
                    else {
                        flag2 = 0;
                    }
                }

            

            if (e.getSource() == label5) {
                if (flag1 == 2) {
                    flag1 = 3;
                }
                else {
                    flag1 = 0;
                }

            }
        
    }
}
