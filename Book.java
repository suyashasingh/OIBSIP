import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Book extends JPanel 
{
	JLabel u1,u2,u3;
    JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
Book()
{
	setBackground(Color.cyan);
setLayout(null);
        u1=new JLabel("FROM STATION");
		u1.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u1.setBounds(50,100,180,35);
        add(u1);
        
        t1=new JTextField();
		t1.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t1.setBounds(250,100,180,30);
        add(t1);
        
        u2=new JLabel("TO STATION");
		u2.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u2.setBounds(500,100,180,35);
        add(u2);
        
        t2=new JTextField();
		t2.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t2.setBounds(650,100,180,30);
        add(t2);
		
		u3=new JLabel("TRAIN AVAILABLE");
		u3.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u3.setBounds(200,250,250,35);
        add(u3);
        
        t3=new JTextField();
		t3.setFont(new Font("Times New Roman",Font.BOLD, 10));
        t3.setBounds(430,250,250,30);
        add(t3);
        

		
b1=new JButton("BACK");
b1.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b1.setBounds(50,500,180,30);
add(b1);


b2=new JButton("SEARCH TRAIN");
b2.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b2.setBounds(280,500,200,30);
add(b2);


b3=new JButton("BOOK TICKETS");
b3.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b3.setBounds(530,500,200,30);
add(b3);


b4=new JButton("SAVE");
b4.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b4.setBounds(770,500,180,30);
add(b4);
}
}