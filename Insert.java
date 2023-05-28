import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Insert extends JPanel 
{
	JLabel u1,u2,u3,u4,u5,u6,u7,u8;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2;
Insert()
{
	setBackground(Color.yellow);
setLayout(null);
        u1=new JLabel("Name");
        u1.setBounds(50,50,120,35);
        add(u1);
        
        t1=new JTextField();
        t1.setBounds(180,50,150,30);
        add(t1);
        
        u2=new JLabel("Age");
        u2.setBounds(50,100,120,35);
        add(u2);
        
        t2=new JTextField();
        t2.setBounds(180,100,150,30);
        add(t2);
        
        u3=new JLabel("Gender");
        u3.setBounds(50,150,120,35);
        add(u3);
        
        t3=new JTextField();
        t3.setBounds(180,150,150,30);
        add(t3);
		
		u4=new JLabel("Date of Birth");
        u4.setBounds(50,200,120,35);
        add(u4);
        
        t4=new JTextField();
        t4.setBounds(180,200,150,30);
        add(t4);
        
        u5=new JLabel("Adhar No.");
        u5.setBounds(50,250,120,35);
        add(u5);
        
        t5=new JTextField();
        t5.setBounds(180,250,150,30);
        add(t5);
        
        u6=new JLabel("Contact");
        u6.setBounds(50,300,120,35);
        add(u6);
        
        t6=new JTextField();
        t6.setBounds(180,300,150,30);
        add(t6);
		
		u7=new JLabel("Address");
        u7.setBounds(50,350,120,35);
        add(u7);
        
        t7=new JTextField();
        t7.setBounds(180,350,150,30);
        add(t7);
		
		u8=new JLabel("Email");
        u8.setBounds(500,50,120,35);
        add(u8);
        
       t8=new JTextField();
        t8.setBounds(600,50,150,30);
        add(t8);
		
		
b1=new JButton("BACK");
 b1.setBounds(350,500,100,30);
add(b1);
b2=new JButton("PROCEED APPLICATION");
 b2.setBounds(500,500,200,30);
add(b2);
}
}