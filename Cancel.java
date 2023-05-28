import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Cancel extends JPanel
{
JButton b1,b2,b3;
JLabel u1;
JTextField t1;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
Cancel()
{
	setBackground(Color.cyan);
	setLayout(null);
	
	 u1=new JLabel("PNR No.");
	 u1.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u1.setBounds(20,20,200,35);
        add(u1);
        
        t1=new JTextField();
		t1.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t1.setBounds(100,20,200,30);
        add(t1);
		
b1=new JButton("FIND TICKET ");
b1.setFont(new Font("Times New Roman",Font.BOLD, 20));
b1.setBounds(310,20,170,30);
add(b1);

b2=new JButton("CONFIRM CANCELLATION");
b2.setFont(new Font("Times New Roman",Font.BOLD, 18));
 b2.setBounds(670,20,300,30);
add(b2);

b3=new JButton("BACK");
b3.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b3.setBounds(500,20,140,30);
add(b3);

l1=new JLabel("");
l1.setFont(new Font("Times New Roman",Font.BOLD, 20));
l1.setBounds(100,50,300,200);
add(l1);

l2=new JLabel("");
l2.setFont(new Font("Times New Roman",Font.BOLD, 20));
l2.setBounds(100,100,200,200);
add(l2);

l3=new JLabel("");
l3.setFont(new Font("Times New Roman",Font.BOLD, 20));
l3.setBounds(100,150,200,200);
add(l3);

l4=new JLabel("");
l4.setFont(new Font("Times New Roman",Font.BOLD, 20));
l4.setBounds(100,200,200,200);
add(l4);

l5=new JLabel("");
l5.setFont(new Font("Times New Roman",Font.BOLD, 20));
l5.setBounds(100,250,200,200);
add(l5);

l6=new JLabel("");
l6.setFont(new Font("Times New Roman",Font.BOLD, 20));
l6.setBounds(100,300,300,200);
add(l6);

l7=new JLabel("");
setFont(new Font("Times New Roman",Font.BOLD, 20));
l7.setBounds(100,350,200,200);
add(l7);

l8=new JLabel("");
l8.setFont(new Font("Times New Roman",Font.BOLD, 20));
l8.setBounds(500,50,200,200);
add(l8);

l9=new JLabel("");
l9.setFont(new Font("Times New Roman",Font.BOLD, 20));
l9.setBounds(500,100,200,200);
add(l9);

l10=new JLabel("");
l10.setFont(new Font("Times New Roman",Font.BOLD, 20));
l10.setBounds(500,150,200,200);
add(l10);

l11=new JLabel("");
l11.setFont(new Font("Times New Roman",Font.BOLD, 20));
l11.setBounds(500,200,200,200);
add(l11);

l12=new JLabel("");
l12.setFont(new Font("Times New Roman",Font.BOLD, 20));
l12.setBounds(500,250,200,200);
add(l12);

l13=new JLabel("");
l13.setFont(new Font("Times New Roman",Font.BOLD, 20));
l13.setBounds(500,300,200,200);
add(l13);




}
}