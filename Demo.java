import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import java.time.LocalDate;

class FDemo extends JFrame implements ActionListener
{
	//long number;
CardLayout card;
	Container cn=getContentPane();
	HomeDemo home;
	Login log;
	 Regis res;
	 Book bkt;
	 Option opt;
	Details del;
	ViewTicket vwt;
	Cancel cln;
	FDemo()
{
	card=new CardLayout();
	   setLayout(card);
	    home=new HomeDemo();
		log=new Login();
		res=new Regis();
		bkt=new Book();
		opt=new Option();
		del=new Details();
		vwt=new ViewTicket();
		cln=new Cancel();
		
		
		add("hm",home);
		add("lg",log);
		add("rs",res);
		add("bt",bkt);
		add("op",opt);
		add("dl",del);
		add("vt",vwt);
		add("ca",cln);
		
      home.b1.addActionListener(this);
	  home.b2.addActionListener(this);
	 // res.b1.addActionListener(this);
	 
	  res.b2.addActionListener(this);
	  
	  log.b1.addActionListener(this);
      log.b2.addActionListener(this);
	  
	  bkt.b2.addActionListener(this);
	  bkt.b1.addActionListener(this);
	  	  bkt.b3.addActionListener(this);
		  	  	  bkt.b4.addActionListener(this);
	  
	  opt.b1.addActionListener(this);
	   opt.b2.addActionListener(this);
	    opt.b3.addActionListener(this);
		
		del.b1.addActionListener(this);
		del.b2.addActionListener(this);
		del.b3.addActionListener(this);
		del.b4.addActionListener(this);
		 
		 vwt.b1.addActionListener(this);
		 		 vwt.b2.addActionListener(this);
				 
				 		 cln.b1.addActionListener(this);
						  cln.b2.addActionListener(this);
						 cln.b3.addActionListener(this);
	  }
	  
	  public void actionPerformed(ActionEvent e){
		//  long number=0;


if(e.getSource()==log.b1)
	{
		String s1=log.tx1.getText();
		String s2=log.t2.getText();
		try{
		Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from Regis where uname='"+s1+"' and upass='"+s2+"'");

			if(rs.next())
	{					opt.l.setFont(new Font("Times New Roman",Font.BOLD, 20));
		opt.l.setText("WELCOME USER : "+" "+" "+s1);
		card.show(cn,"op");	
	}		
	else{
		JOptionPane.showMessageDialog(null,"Invalid user_name and password","wrong detail",JOptionPane.INFORMATION_MESSAGE);
		con.close();
	}
	
		}	
		
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		 log.tx1.setText("");
		log.t2.setText("");
		
	}
	  if(e.getSource()==home.b1){
	  card.show(cn,"lg");
	  }
	  
	  	  if(e.getSource()==res.b2){
	  card.show(cn,"hm");
	  }
	  
	  if(e.getSource()==log.b2){
	  card.show(cn,"hm");
	  }
	  
	   if(e.getSource()==home.b2){
	  card.show(cn,"rs");
	  }
	  
	  if(e.getSource()==res.b2){
	  card.show(cn,"hm");
	  }
	  	  if(e.getSource()==vwt.b1){
	  card.show(cn,"dl");
	  }
	  	  if(e.getSource()==vwt.b2){
	  card.show(cn,"op");
	  }
	  
	  if(e.getSource()==opt.b1){
		  card.show(cn,"bt");
	  }
	  
	  	  if(e.getSource()==opt.b2){
		  card.show(cn,"ca");
	  }
	  if(e.getSource()==bkt.b2){
		   String s1=bkt.t1.getText();
		   		   String s2=bkt.t2.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select name,number from train where tostation='"+s1+"' AND fromstation='"+s2+"'");
			if(rs.next())
			{
				bkt.t3.setFont(new Font("Times New Roman",Font.BOLD, 20));
				bkt.t3.setText(rs.getString(1)+"("+rs.getString(2)+")");
			}
			else
			{bkt.t3.setText("");			
			
			JOptionPane.showMessageDialog(null,"Train Not Available");
			con.close();
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
}
if(e.getSource()==bkt.b4)
{
	    String s1=bkt.t1.getText();
	    String s2=bkt.t2.getText();
	    String s3=bkt.t3.getText();
	  
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("insert into train2 values ('"+s1+"','"+s2+"','"+s3+"')");
		
					JOptionPane.showMessageDialog(null,"Data saved");
		
		con.close();

           		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
}

	  
	  
	  
	   if(e.getSource()==opt.b3){
		  card.show(cn,"hm");
	  }
	  if(e.getSource()==bkt.b3){
		  card.show(cn,"dl");
		 
	  }
	   if(e.getSource()==bkt.b1){
		  card.show(cn,"op");
	  }
	  if(e.getSource()==del.b1){
		  card.show(cn,"bt");
	  }
	 //long number;
	  if(e.getSource()==del.b3){
		    String s1=del.t10.getText();
		   		   String s2=del.t5.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select available from train2 where tostation='"+s1+"' AND fromstation='"+s2+"'");
			if(rs.next())
			{
				del.t11.setFont(new Font("Times New Roman",Font.BOLD, 20));
				del.t11.setText(rs.getString(1));
				
					  long number=(long) Math.floor(Math.random()*9000000000L)+1000000000L;
		String s=Long.toString(number);
		del.t12.setFont(new Font("Times New Roman",Font.BOLD, 20));
		del.t12.setText(""+s);
		
		
			}
			else
			{del.t11.setText("");
             del.t12.setText("");		
			
			JOptionPane.showMessageDialog(null,"Train Not Available");
			con.close();
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		  
		 

	  }
	  
	 
	  
	  if(e.getSource()==del.b2)
{
	    String s1=del.t1.getText();
	    String s2=del.t2.getText();
	    String s3=del.t3.getText();
	    String s4=del.t4.getText();
	    String s5=del.t5.getText();
	    String s6=del.t6.getText();
	    String s7=del.t7.getText();
	    String s8=del.t8.getText();
	    String s9=del.t9.getText();
			    String s10=del.t10.getText();
					    String s11=del.t11.getText();
							    String s12=del.t12.getText();
	   
		
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("insert into details2 values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"')");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
				System.out.println(s10);
					System.out.println(s11);
							System.out.println(s12);
	
			JOptionPane.showMessageDialog(null,"Information saved successfully");
			con.close();
          
           
           		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
}

if(e.getSource()==del.b4){
card.show(cn,"vt");
	{

	  
	  String s13=del.t12.getText();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from details2 where PNR='"+s13+"' ");
			if(rs.next())
			{
				vwt.l1.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l1.setText("FULL NAME   "+" "+rs.getString(1));
				vwt.l2.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l2.setText("PNR NO.   "+" "+rs.getString(12));
				vwt.l3.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l3.setText("FROM   "+" "+rs.getString(5));
				
				vwt.l4.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l4.setText("TO   "+" "+rs.getString(10));
				
				vwt.l5.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l5.setText("CLASS   "+" "+rs.getString(9));
				
				vwt.l6.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l6.setText("BOARDING POINT   "+" "+rs.getString(5));
				
				vwt.l7.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l7.setText("AGE   "+" "+rs.getString(2));
				
				vwt.l8.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l8.setText("contact  "+" "+rs.getString(6));
				
				vwt.l9.setFont(new Font("Times New Roman",Font.BOLD, 20));
				vwt.l9.setText("GENDER "+" "+rs.getString(3));
								
				
			}
			else
			{
			
			con.close();
			}
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
	  }
	  {
	  LocalDate date=LocalDate.now();
	 vwt.l10. setFont(new Font("Times New Roman",Font.BOLD, 20));
	  								vwt.l10.setText("DATE"+"  " +date);
	  }
	  
	  
	  
	  {
	  int random=(int)(Math.random()*50+1);
	  String sr1=Integer.toString(random);
	  vwt.l11.setFont(new Font("Times New Roman",Font.BOLD, 20));
	  				vwt.l11.setText("SEAT/BERTH"+"   "+sr1+"/SL");
	 				//vwt. l12.setText(sr1+"/SL");
	  
	  }
	  {
	 int random1=(int)(Math.random()*11+1);
	 String sr2=Integer.toString(random1);
	 vwt.l12.setFont(new Font("Times New Roman",Font.BOLD, 20));
	 				vwt. l12.setText("COACH"+"  "+"s"+sr2);
	 				//vwt. l14.setText("s"+sr2);
	  }
	  vwt.l13.setFont(new Font("Times New Roman",Font.BOLD, 20));
	  				vwt.l13.setText("STATUS     confirm");
	  				//vwt.l24.setText("Confirm");
}


if(e.getSource()==cln.b1){

	{

	  
	  String s13=cln.t1.getText();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from details2 where PNR='"+s13+"' ");
			if(rs.next())
			{
				cln.l1.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l1.setText("FULL NAME   "+" "+rs.getString(1));
								
												cln.l2.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l2.setText("PNR NO.   "+" "+rs.getString(12));
								
												cln.l3.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l3.setText("FROM   "+" "+rs.getString(5));
								
												cln.l4.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l4.setText("TO   "+" "+rs.getString(10));
								
												cln.l5.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l5.setText("CLASS   "+" "+rs.getString(9));
								
												cln.l6.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l6.setText("BOARDING POINT   "+" "+rs.getString(5));
								
												cln.l7.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l7.setText("AGE   "+" "+rs.getString(2));
								
												cln.l8.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l8.setText("contact  "+" "+rs.getString(6));
								
												cln.l9.setFont(new Font("Times New Roman",Font.BOLD, 20));
								cln.l9.setText("GENDER "+" "+rs.getString(3));
								
				
			}
			else
			{
			
			con.close();
			}
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
	  }
	  {
	  LocalDate date=LocalDate.now();
	  				cln.l10.setFont(new Font("Times New Roman",Font.BOLD, 20));
	  								cln.l10.setText("DATE"+"  " +date);
	  }
	  
	  
	  
	  {
	  int random=(int)(Math.random()*50+1);
	  String sr3=Integer.toString(random);
	 cln.l11 .setFont(new Font("Times New Roman",Font.BOLD, 20));
	  				cln.l11.setText("SEAT/BERTH"+"   "+sr3+"/SL");
	 				//vwt. l12.setText(sr1+"/SL");
	  
	  }
	  {
	 int random1=(int)(Math.random()*11+1);
	 String sr4=Integer.toString(random1);
	 cln.l12.setFont(new Font("Times New Roman",Font.BOLD, 20));
	 				cln. l12.setText("COACH"+"  "+"s"+sr4);
	 				//vwt. l14.setText("s"+sr2);
	  }
	  
	  cln.l13.setFont(new Font("Times New Roman",Font.BOLD, 20));
	  				cln.l13.setText("STATUS  confirm");
	  				//vwt.l24.setText("Confirm");
}

if(e.getSource()==cln.b2){
	
	String s14=cln.t1.getText();
		try{
		Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///oasis","root","root");
			Statement st=con.createStatement();
			 st.executeUpdate("Delete from  details2 where PNR='"+s14+"'");	
			con.close();
			JOptionPane.showMessageDialog(null,"YOUR TICKET CANCELLED");
           
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
}

if(e.getSource()==cln.b3){
	card.show(cn,"op");
}

if(e.getSource()==opt.b3){
	card.show(cn,"hm");
}
}
}
class Demo
{
public static void main(String ar[])
{
FDemo f=new FDemo();
int p,q,r=1000,s=600;
		f.setVisible(true);
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d =t.getScreenSize();
		p=(d.width-r)/2;
		q=(d.height-s)/2;
		
		f.setBounds(p,q,r,s);	
		}
}
	  
	  