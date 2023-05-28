import javax.swing.*;
import java.awt.*;

class HomeDemo extends JPanel
{
JButton b1,b2,b3;
	JLabel u1;
HomeDemo()
{
	setLayout(null);
		setBackground(Color.yellow);


		
	    u1=new JLabel("ONLINE RESERVATION SYSTEM");
				u1.setFont(new Font("Algerian",Font.BOLD, 50));
        u1.setBounds(100,50,2000,60);
		
        add(u1);
		//setFont(f);

	b1=new JButton("Login");
					b1.setFont(new Font("Times New Roman",Font.BOLD, 20));
	 b1.setBounds(300,200,180,30);
	//setFont(f);
	add(b1);
	
	b2=new JButton("Registration");
					b2.setFont(new Font("Times New Roman",Font.BOLD, 20));
	 b2.setBounds(500,200,180,30);
		//setFont(f);
	add(b2);
	
	
}
}