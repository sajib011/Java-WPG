package game.pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameFrame12 extends JFrame implements ActionListener {

    ImageIcon back, img1, img2, img3, img4, img5, img6, img7;
    JButton label1, label2, label3, label4, label5, label6, label7;
    JLabel sugg1, sugg2, sugg3;
    JLabel label;
    JTextField f1, f2, f3, f4, scr, bns;
    int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0;
    int mf1 = 0, mf2 = 0, mf3 = 0, mf4 = 4;
    int matches = 0;
    Score s = new Score();

    GameFrame12() {

        setTitle("Word Puzzle - level 14");
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //for the text field
        f1 = new JTextField();
        add(f1);
        f1.setLocation(10, 10);
        f1.setSize(50, 30);

        //suggetion
        sugg1 = new JLabel("3-6 LETTER");
        add(sugg1);
        sugg1.setLocation(100, 10);
        sugg1.setSize(100, 20);

        sugg2 = new JLabel("SCORE") ;
        add(sugg2) ;
        sugg2.setLocation(550, 40) ;
        sugg2.setSize(200, 20) ;
        
        sugg3 = new JLabel("BONUS") ;
        add(sugg3) ;
        sugg3.setLocation(550, 80) ;
        sugg3.setSize(200, 20) ;
        
        //score
        scr = new JTextField();
        add(scr);
        scr.setLocation(600, 40);
        scr.setSize(100, 30);

        bns = new JTextField();
        add(bns);
        bns.setLocation(600, 80);
        bns.setSize(100, 30);
      
        //for the buttons
        img1 = new ImageIcon(getClass().getResource("ddd.jpg"));
        label1 = new JButton(img1);
        add(label1);
        label1.setLocation(100, 320);
        label1.setSize(100, 100);

        img2 = new ImageIcon(getClass().getResource("ooo.jpg"));
        label2 = new JButton(img2);
        add(label2);
        label2.setLocation(500, 320);
        label2.setSize(100, 100);

        img3 = new ImageIcon(getClass().getResource("bbb.jpg"));
        label3 = new JButton(img3);
        add(label3);
        label3.setLocation(300, 320);
        label3.setSize(100, 100);

        img4 = new ImageIcon(getClass().getResource("nnn.jpg"));
        label4 = new JButton(img4);
        add(label4);
        label4.setLocation(200, 200);
        label4.setSize(100, 100);

        img5 = new ImageIcon(getClass().getResource("ttt.jpg"));
        label5 = new JButton(img5);
        add(label5);
        label5.setLocation(400, 200);
        label5.setSize(100, 100);

        img6 = new ImageIcon(getClass().getResource("eee.jpg"));
        label6 = new JButton(img6);
        add(label6);
        label6.setLocation(200, 450);
        label6.setSize(100, 100);

        img7 = new ImageIcon(getClass().getResource("aaa.jpg"));
        label7 = new JButton(img7);
        add(label7);
        label7.setLocation(400, 450);
        label7.setSize(100, 100);

        //for the background
        back = new ImageIcon(getClass().getResource("backframe1.jpg"));
        label = new JLabel(back);
        add(label);
        label.setLocation(0, 0);
        label.setSize(800, 600);

        //button works
        label1.addActionListener(this);
        label2.addActionListener(this);
        label3.addActionListener(this);
        label4.addActionListener(this);
        label5.addActionListener(this);
        label6.addActionListener(this);
        label7.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == label1) {

            if (flag4 == 0) {

                flag4 = 1;
            } else {
                flag4 = 0;
            }

            if (mf2 == 0) {
                if (flag2 == 2) {
                    f4.setText("BED");
                    mf2 = 1;

                    s.bonus = s.bonus + 5;
                    bns.setText(s.bonus + "");

                } else {
                    flag2 = 0;
                }
            }

        }

        if (e.getSource() == label2) {
            if (flag4 == 1) {
                flag4 = 2;
            } else {
                flag4 = 0;
            }

            if (flag1 == 1) {
                flag1 = 2;
            } else {
                flag1 = 0;
            }
            if (flag3 == 1) {
                flag3 = 2;
            } else {
                flag3 = 0;
            }

        }
        if (e.getSource() == label3) {
            if (flag2 == 0) {
                flag2 = 1;
            } else {
                flag2 = 0;
            }

            if (flag1 == 0) {
                flag1 = 1;
            } else {
                flag1 = 0;
            }
        }

        if (e.getSource() == label4) {
            if (flag4 == 2) {
                flag4 = 3;
            } else {
                flag4 = 0;
            }

            if (flag3 == 0) {
                flag3 = 1;
            } else {
                flag3 = 0;
            }

        }

        if (e.getSource() == label5) {
            if (mf4 == 0) {
                if (flag1 == 3) {
                    f3.setText("BOAT");
                    mf4 = 1;
                    s.bonus = s.bonus + 5;
                    bns.setText(s.bonus + "");

                } else {
                    flag1 = 0;
                }
            }

            if (mf3 == 0) {
                if (flag3 == 2) {
                    f2.setText("NOT");
                    mf3 = 1;
                    s.bonus = s.bonus + 5;
                    bns.setText(s.bonus + "");

                } else {
                    flag3 = 0;
                }

            }

        }
        if (e.getSource() == label6) {
            if (flag2 == 1) {
                flag2 = 2;
            } else {
                flag2 = 0;
            }

            if (flag3 == 0) {
                flag3 = 1;
            } else {
                flag3 = 0;
            }

            if (mf1 == 0) {
                if (flag4 == 3) {
                    f1.setText("DONE");
                    mf1 = 1;
                    flag4 = 0;
                    s.score = s.score + 10;
                    scr.setText(s.score + "");
                    if (matches < 2) {
                        matches++;
                    }
                    if (matches == 1) {
                        JOptionPane.showMessageDialog(null, "You've Won!!!!!Congratulation :)", "full match", -1);
                        {
                            this.setVisible(false);
                        }
                        {
                            System.exit(1);
                        }
                    }
                } else {
                    flag4 = 0;
                }
            }

        }
        if (e.getSource() == label7) {
            if (flag1 == 2) {
                flag1 = 3;
            } else {
                flag1 = 0;
            }

        }

    }

}
