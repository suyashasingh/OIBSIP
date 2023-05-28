import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

class Regis extends JPanel implements ActionListener
{
JTextField tx1;
JLabel u1,u2;
JPasswordField t2;
JButton b1,b2;

Regis()
{
	setBackground(Color.yellow);

	setLayout(null);
 u1=new JLabel("Enter UserName");
u1. setFont(new Font("Times New Roman",Font.BOLD, 20));
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

b1=new JButton("Registration");
b1.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b1.setBounds(470,200,200,30);
add(b1);

b2=new JButton("Back");
b2.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b2.setBounds(260,200,200,30);
add(b2);


b1.addActionListener(this);
//b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
	String s1=tx1.getText();
	String s2=t2.getText();
	try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
Statement st=con.createStatement();
st.executeUpdate("insert into Regis values ('"+s1+"','"+s2+"')");
JOptionPane.showMessageDialog(b1,"Registered successfully","Registration page",JOptionPane.INFORMATION_MESSAGE);
//System.out.println("data insert");
tx1.setText("");
t2.setText("");

con.close();
}
catch(Exception e1)
{
	System.out.println(e1);
}
}


}
