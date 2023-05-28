import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Details extends JPanel 
{
	JLabel u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JButton b1,b2,b3,b4;

Details()
{
	setBackground(Color.cyan);
setLayout(null);



        u1=new JLabel("FULL NAME");
		u1.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u1.setBounds(50,50,200,35);
        add(u1);
        
        t1=new JTextField();
		t1.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t1.setBounds(230,50,200,30);
        add(t1);
        
        u2=new JLabel("AGE");
		u2.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u2.setBounds(50,100,200,35);
        add(u2);
        
        t2=new JTextField();
		t2.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t2.setBounds(230,100,200,30);
        add(t2);
		
		//bg=new ButtonGroup();
        
        u3=new JLabel("GENDER");
		u3.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u3.setBounds(50,150,200,35);
        add(u3);
		
	    t3=new JTextField();
		t3.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t3.setBounds(230,150,200,30);
        add(t3);

	
		u4=new JLabel("DATE OF BIRTH");
		u4.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u4.setBounds(50,200,200,35);
        add(u4);
        
        t4=new JTextField();
		t4.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t4.setBounds(230,200,200,30);
        add(t4);
		
		u5=new JLabel("FROM STATION");
		u5.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u5.setBounds(50,250,200,35);
        add(u5);
        
        t5=new JTextField();
		t5.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t5.setBounds(230,250,200,30);
        add(t5);
        

        
		u6=new JLabel("CONTACT No.");
		u6.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u6.setBounds(500,50,200,35);
        add(u6);
        
        t6=new JTextField();
		t6.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t6.setBounds(650,50,200,30);
        add(t6);
		
		u7=new JLabel("ADHAAR No.");
		u7.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u7.setBounds(500,100,200,35);
        add(u7);
        
        t7=new JTextField();
		t7.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t7.setBounds(650,100,200,30);
        add(t7);
		
		
		u8=new JLabel("RELIGION");
		u8.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u8.setBounds(500,150,200,35);
        add(u8);
        
        t8=new JTextField();
		t8.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t8.setBounds(650,150,200,30);
        add(t8);
		
		u9=new JLabel("CLASS TYPE");
		u9.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u9.setBounds(500,200,120,35);
        add(u9);
		
	    t9=new JTextField();
		t9.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t9.setBounds(650,200,200,30);
        add(t9);
		
		u10=new JLabel("TO STATION");
		u10.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u10.setBounds(500,250,200,35);
        add(u10);
		
	    t10=new JTextField();
		t10.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t10.setBounds(650,250,200,30);
        add(t10);
		
		
		u11=new JLabel("AVAILABLE TRAIN");
		u11.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u11.setBounds(180,350,300,35);
        add(u11);
        
        t11=new JTextField();
		t11.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t11.setBounds(400,350,300,30);
        add(t11);
		
		u12=new JLabel("YOUR PNR NO.");
		u12.setFont(new Font("Times New Roman",Font.BOLD, 20));
        u12.setBounds(180,400,300,35);
        add(u12);
        
        t12=new JTextField();
		t12.setFont(new Font("Times New Roman",Font.BOLD, 20));
        t12.setBounds(400,400,300,30);
        add(t12);
		
 		
b1=new JButton("BACK");
b1.setFont(new Font("Times New Roman",Font.BOLD, 20));
b1.setBounds(50,500,200,30);
add(b1);

b2=new JButton("SAVE");
b2.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b2.setBounds(270,500,200,30);
add(b2);

b3=new JButton("CONFIRM BOOKING");
b3.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b3.setBounds(500,500,250,30);
add(b3);

b4=new JButton("VEIW TICKET");
b4.setFont(new Font("Times New Roman",Font.BOLD, 20));
 b4.setBounds(770,500,180,30);
add(b4);


    }

}