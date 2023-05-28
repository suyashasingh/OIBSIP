import javax.swing.*;
import java.awt.*;
import java.sql.*;

class Login extends JPanel{

JButton b1,b2;
JTextField tx1;
JPasswordField t2;
JLabel u1,u2;

Login(){
setLayout(null);
setBackground(Color.yellow);

 u1=new JLabel("Enter UserName");
 u1.setFont(new Font("Times New Roman",Font.BOLD, 20));
 u1.setBounds(250,50,180,30);
 add(u1);
 
tx1=new JTextField(20);
tx1.setFont(new Font("Times New Roman",Font.BOLD, 20));
tx1.setBounds(450,50,180,30);
add(tx1);

u2=new JLabel("Enter password");
u2.setFont(new Font("Times New Roman",Font.BOLD, 20));
 u2.setBounds(250,100,180,30);
 add(u2);
 
t2=new JPasswordField(20);
t2.setFont(new Font("Times New Roman",Font.BOLD, 20));
t2.setBounds(450,100,180,30);
add(t2);

b1=new JButton("Login");
b1.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b1.setBounds(450,200,100,30);
add(b1);

b2=new JButton("Back");
b2.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b2.setBounds(350,200,90,30);
add(b2);
	}
	}