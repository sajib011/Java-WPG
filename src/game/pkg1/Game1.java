package game.pkg1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Game1 {

    public static void main(String[] args) 
    {
        Window1 w1 = new Window1(); 
    }
    
}

class Window1 extends JFrame implements ActionListener{
    
    ImageIcon image1,img,ab,ex;
    JLabel label1;
    JButton start,about,exit;
    
    Window1(){
        
        setTitle("Word Puzzle - Home");
        setVisible(true);
        setSize(800,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        image1 = new ImageIcon(getClass().getResource("homepage5.jpg"));
        label1 = new JLabel (image1);
        add(label1);
        label1.setLocation(0,0);
        label1.setSize(800,600);

        img = new ImageIcon(getClass().getResource("start1.jpg"));
        ab = new ImageIcon(getClass().getResource("about.jpg"));
        ex = new ImageIcon(getClass().getResource("exit.jpg"));

        start = new JButton(img);
        about=new JButton(ab);
        exit = new JButton(ex);
        
        //start = new JButton("Start");
        add(start);
        start.setLocation(230,200+200);
        start.setSize(300, 50);
        add(about);
        about.setLocation(230,260+200);
        about.setSize(300, 50);
        add(exit);
        exit.setLocation(230,320+200);
        exit.setSize(300, 50);
          
        //add to addclick listener
        start.addActionListener(this);
        about.addActionListener(this);
        exit.addActionListener(this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==start){
            
            GameFrame1 g1 = new GameFrame1();
            //GameFrame1 g1 = new GameFrame1(); // etae real
            this.setVisible(false);
            System.out.println("start");
            
        }
        else if (e.getSource()==about){
            //System.out.println("About");
            About aboutpage = new About();
            //aboutpage.setVisible(true);

        }
        else if (e.getSource()==exit){
            //System.out.println("Exit");
            System.exit(1);
        }       
    }
}

class About extends JFrame implements ActionListener{
    
    JLabel l ;
    ImageIcon image1 = new ImageIcon(getClass().getResource("aboutpage5.jpg"));
    ImageIcon image2 = new ImageIcon(getClass().getResource("backbutton.jpg"));
    
    JButton backbutton;
    
    About(){
        setTitle("Word Puzzle - About");
        setVisible(true);
        setSize(800,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l= new JLabel(image1);
        add(l);
        l.setLocation(0, 0);
        l.setSize(800,600);
        
        backbutton = new JButton(image2);
        add(backbutton);
        backbutton.setLocation(430, 470);
        backbutton.setSize(300,50);
        
        backbutton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==backbutton){
            System.out.println("back");
            this.setVisible(false);
        }
    }
    
}