import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Option extends JPanel 
{
JButton b1,b2,b3,b4,b5;
JLabel l;

Option()
{
	setBackground(Color.cyan);
	setLayout(null);
	
l=new JLabel("");
l.setFont(new Font("Times New Roman",Font.BOLD, 20));
l.setBounds(600,1,300,200);
add(l);	


b1=new JButton("BOOK TICKETS");
b1.setFont(new Font("Times New Roman",Font.BOLD, 20));
b1.setBounds(50,50,300,50);
add(b1);


b2=new JButton("CANCEL RESERVATION");
b2.setFont(new Font("Times New Roman",Font.BOLD, 20));
b2.setBounds(50,150,300,50);
add(b2);


b3=new JButton("LOGOUT");
b3.setFont(new Font("Times New Roman",Font.BOLD, 20));
b3.setBounds(50,250,300,50);
add(b3);




}
}