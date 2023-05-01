package com.InstaLoginforms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.TreeMap;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login_create_page extends JFrame implements ActionListener, ItemListener
{
	private JLabel  jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, jl10, jl11, jl12, jl13, jl14, jl15;
	private JButton jb, jb1, jb2, jb3;
	private JTextField jt, jt1, jt2, jt3, jt4;
	private JPasswordField jp;
	private ImageIcon i1, i2;
	private Font f1, f2, f3, f4;
	private JRadioButton jr1, jr2, jr3;
	private JComboBox jcb1, jcb2;
	private JCheckBox jc1, jc2, jc3, jc4;
	
	String StdCode;
	String Gender;
	String Language;
	String Country;
	
	public Login_create_page()
	{
		i1=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\Insta logo.png");
		i2=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\social media.jpg");
		f1=new Font("Forte",180, 25);
		f2=new Font("Calibri (Body)",150, 16);
		f3=new Font("Forte",180, 30);
		f4=new Font("Bookman Old Style",100, 18);
		//	jl=new JLabel("INSTAGRAM");
		//	jl.setFont(new Font("TimesRoman", Font.ITALIC, 20));
		jl1=new JLabel("Sign up to see photos and videos from your friends.");
		jl1.setFont(f1);
		jl1.setForeground(Color.green);
		//	jl1.setFont(new Font("Bookmanold",Font.ITALIC , 16));
		jb=new JButton("Log in with Facebook");
		jb.setFont(f2);
		jb.setBackground(Color.blue);
		jb.setForeground(Color.white);
		jl2=new JLabel("------------------	or	------------------");
		jl2.setFont(f3);
		jl2.setForeground(Color.green);
		jl2.setFont(new Font("Bookmanold", Font.BOLD,16));
		jl7=new JLabel("First Name:");
		jl7.setFont(f4);
		jl7.setForeground(Color.BLACK);
		jt=new JTextField("First Name");
		
		jl8=new JLabel("Last Name:	");
		jl8.setFont(f4);
		jl8.setForeground(Color.BLACK);
		jt3= new JTextField("Last Name");
		
		jl9=new JLabel("Phone No:	");
		jl9.setFont(f4);
		jl9.setForeground(Color.BLACK);
		
		Vector v=new Vector();
		v.add("+61");
		v.add("+55");
		v.add("+1");
		v.add("+86");
		v.add("+358");
		v.add("+33");
		v.add("+57");
		v.add("+220");
		v.add("+49");
		v.add("+299");
		v.add("+91");
		v.add("+81");
		v.add("+41");
		v.add("+92");
		v.add("+51");
		v.add("+7");
		v.add("+65");
		v.add("+82");
		
		jcb1=new JComboBox(v);
		jt1=new JTextField("Phone number");
		
		jl10=new JLabel("Email:	");
		jl10.setFont(f4);
		jl10.setForeground(Color.BLACK);
		jt2=new JTextField("Email Id");
		
		jl11=new JLabel("Username:	");
		jl11.setFont(f4);
		jl11.setForeground(Color.BLACK);
		jt4=new JTextField("Username");
		
		jl12=new JLabel("Password:	");
		jl12.setFont(f4);
		jl12.setForeground(Color.BLACK);
		jp=new JPasswordField("Password");
		
		jl13=new JLabel("Gender");
		jl13.setFont(f4);
		jl13.setForeground(Color.BLACK);		
		jr1=new JRadioButton("Male");
		jr2=new JRadioButton("Female");
		jr3=new JRadioButton("Others");
		
		jl14=new JLabel("Country");
		jl14.setFont(f4);
		jl14.setForeground(Color.BLACK);		
		Vector v1=new Vector();
		v1.add("Australia");
		v1.add("Brazil");
		v1.add("Canada");
		v1.add("China");
		v1.add("Finland");
		v1.add("France");
		v1.add("Colombia");
		v1.add("Gambia");
		v1.add("Germany");
		v1.add("Greenland");
		v1.add("India");
		v1.add("Japan");
		v1.add("Switzeland");
		v1.add("Pakistan");
		v1.add("Peru");
		v1.add("Russia");
		v1.add("Singapore");
		v1.add("South Korea");
		
		jcb2=new JComboBox(v1);
		
		jl15=new JLabel("Language:");
		jl15.setFont(f4);
		jl15.setForeground(Color.BLACK);
		jc1=new JCheckBox("Telugu");
		jc2=new JCheckBox("Hindi");
		jc3=new JCheckBox("English");
		jc4=new JCheckBox("French");
		
		jl3=new JLabel("People who use our service may have uploaded your contact information to Instagram.");
		jl3.setFont(f4);
		jl3.setForeground(Color.green);
		jb1=new JButton("Sing up");
		jb1.setFont(f2);
		jb1.setBackground(Color.blue);
		jb1.setForeground(Color.white);
		
		jb3=new JButton("Clear");
		jb3.setFont(f2);
		jb3.setBackground(Color.blue);
		jb3.setForeground(Color.white);		
	
		jl4=new JLabel("Have an account?");
		jl4.setFont(f4);
		jl4.setForeground(Color.black);
		jb2=new JButton("Log in");
		jb2.setFont(f2);
		jb2.setBackground(Color.blue);
		jb2.setForeground(Color.white);
		
		jl5=new JLabel(i1);
		jl6=new JLabel(i2);
		
		//	calling container with empty space
		setLayout(null);
		
		//	After calling, then  arrange components into frame particular position
		//	jl.setBounds(600, 35, 180, 90);
		jl1.setBounds(420, 45, 550, 150);
		jb.setBounds(535, 150, 230, 30);
		jl2.setBounds(550, 160, 220, 80);
		
		jl7.setBounds(490, 225, 120, 40);
		jt.setBounds(620, 230, 230, 30);
	
		jl8.setBounds(490, 260, 120, 40);
		jt3.setBounds(620, 265, 230, 30);
		
		jl9.setBounds(490, 295, 120, 40);
		jcb1.setBounds(620, 300, 60, 30);
		jt1.setBounds(685, 300, 165, 30);
		
		jl10.setBounds(490, 330, 120, 40);
		jt2.setBounds(620, 335, 230, 30);

		jl11.setBounds(490, 365, 120, 40);
		jt4.setBounds(620, 370, 230, 30);
		
		jl12.setBounds(490, 400, 120, 40);
		jp.setBounds(620, 405, 230, 30);

		jl13.setBounds(490, 435, 120, 40);
		jr1.setBounds(620, 440, 80, 40);
		jr2.setBounds(700, 440, 80, 40);
		jr3.setBounds(780, 440, 90, 40);
		
		jl14.setBounds(490, 475, 120, 40);
		jcb2.setBounds(620, 485, 230, 30);
		
		jl15.setBounds(490, 510, 120, 40);
		jc1.setBounds(620, 515, 80, 40);
		jc2.setBounds(705, 515, 80, 40);
		jc3.setBounds(790, 515, 80, 40);
		jc4.setBounds(875, 515, 80, 40);
		
		jl3.setBounds(330, 550, 770, 20);
		
		jb1.setBounds(670, 575, 100, 30);
		jb3.setBounds(570, 575, 80, 30);
	
		jl4.setBounds(520, 610, 200, 30);

		jb2.setBounds(700, 614, 80, 25);
			
		jl5.setBounds(600, 35, 180, 45);
		jl6.setBounds(0, 0, 1366, 786);
		
		
		//	the above value add in conatiner
		
		//	add(jl);
		add(jl1);
		add(jb);
		add(jl2);
		add(jl7);
		add(jt);
		
		add(jl8);
		add(jt3);
		
		add(jl9);
		add(jcb1);
		add(jt1);
		
		add(jl10);
		add(jt2);
		
		add(jl11);
		add(jt4);
		
		add(jl12);
		add(jp);
		
		add(jl13);
		add(jr1);
		add(jr2);
		add(jr3);
		
		add(jl14);
		add(jcb2);
		
		add(jl15);
		add(jc1);
		add(jc2);
		add(jc3);
		add(jc4);
		
		add(jl3);
		
		add(jb1);
		add(jb3);
		add(jl4);
		add(jb2);
		add(jl5);
		add(jl6);
		jb1.addActionListener(this);
		jr1.addActionListener(this);
		jr2.addActionListener(this);
		jr3.addActionListener(this);
		jc1.addActionListener(this);
		jc2.addActionListener(this);
		jc3.addActionListener(this);
		jc4.addActionListener(this);
		jb3.addActionListener(this);
		jb2.addActionListener(this);
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);

	}
	public void itemStateChanged(ItemEvent a)
	{
		if(a.getSource().equals(jcb1))
		{
			StdCode=(String) jcb1.getSelectedItem();
		}
		if(a.getSource().equals(jcb2))
		{
			Country=(String) jcb2.getSelectedItem();
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(jr1))
		{
			Gender="Male";
			jr2.setSelected(false);
			jr3.setSelected(false);
		}
		if(e.getSource().equals(jr2))
		{
			Gender="Female";
			jr1.setSelected(false);
			jr3.setSelected(false);
		}
		if(e.getSource().equals(jr3))
		{
			Gender="Others";
			jr2.setSelected(false);
			jr1.setSelected(false);
		}
		if(e.getSource().equals(jc1))
		{
			Language="Telugu";
		//	jc2.setSelected(true);
		//	jc3.setSelected(true);
		//	jc4.setSelected(true);
		}
		if(e.getSource().equals(jc2))
		{
			Language+=" Hindi";
		//	jc1.setSelected(true);
		//	jc3.setSelected(true);
		//	jc4.setSelected(true);
		}
		if(e.getSource().equals(jc3))
		{
			Language+=" English";
		//	jc2.setSelected(true);
		//	jc1.setSelected(true);
		//	jc4.setSelected(true);
		}
		if(e.getSource().equals(jc4))
		{
			Language+=" French";
		//	jc2.setSelected(true);
		//	jc1.setSelected(true);
		//	jc3.setSelected(true);
		}
		if(e.getSource().equals(jb1))
		{
			try
			{
				//	storing data in bytes format
				
			String FirstName=jt.getText();
			String LastName= jt3.getText();
			String PhoneNo=jt1.getText();
			String Email=jt2.getText();
			String Username=jt4.getText();
			String Password=jp.getText();
	
	/*		System.out.println(FirstName+" "+LastName+"\n "+ StdCode+" "+PhoneNo+"\n "+Email+"\n "+Username+"\n "+Password+"\n"+Gender+"\n"+Country+"\n"+Language);

			TreeMap tm=new TreeMap();
			tm.put(1, FirstName);
			tm.put(2, LastName);
			tm.put(3, StdCode);
			tm.put(4, PhoneNo);
			tm.put(5, Email);
			tm.put(6, Username);
			tm.put(7, Password);
			tm.put(8, Gender);
			tm.put(9, Country);
			tm.put(10, Language);
			
			//	above tm data  converting into byte format using ByteArrayOutputStream()
	
			ByteArrayOutputStream bao=new ByteArrayOutputStream();
			
			ObjectOutputStream oo=new ObjectOutputStream(bao);
			
			oo.writeObject(tm);
			// then those byte data sending and updating ro Orcale DB
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement("insert into Insta values(?)");
			
			// taking Byte data from bao public byte[] toByteArray()
			byte data[]=bao.toByteArray();
			
			//	above data adding to ps
			ps.setObject(1, data);
			
			int i=ps.executeUpdate();
			
			System.out.println("Updated object with byte code format:"+i);
			
			JOptionPane.showMessageDialog(this, "Instagram Account is Created"+"\n"+"Username: "+Username+"\n"+"Password "+Password);
	*/		
			
				
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement("insert into Instagram values(?,?,?,?,?,?,?,?,?,?)");
		//	PreparedStatement ps=con.prepareStatement("insert into Instagram values(?)");
			
			ps.setString(1, FirstName);
			ps.setString(2, LastName);
			ps.setString(3, StdCode);
			ps.setString(4, PhoneNo);
			ps.setString(5, Email);
			ps.setString(6, Username);
			ps.setString(7, Password);
			ps.setString(8, Gender);
			ps.setString(9, Country);
			ps.setString(10, Language);
		
			int i=ps.executeUpdate();
			
			System.out.println("Update: "+i);
			
			JOptionPane.showMessageDialog(this, "Instagram Account is Created"+"\n"+"Username: "+Username+"\n"+"Password "+Password);
	
			}
			catch (Exception e1) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this, "Instagram Account is NOT Created");
				e1.printStackTrace();
			}
		}
		if(e.getSource().equals(jb2))
		{
			Login l=new Login();
			l.setTitle("Instagram Login");
			l.setSize(1366, 786);
			l.setVisible(true);
		}
		
		if(e.getSource().equals(jb3))
		{
			this.jt.setText("");
			this.jt1.setText("");
			this.jt2.setText("");
			this.jt3.setText("");
			this.jt4.setText("");
			this.jp.setText("");
		}
	}
	
}

