package com.InstaLoginforms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.management.loading.PrivateClassLoader;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class Login extends JFrame implements ActionListener
{
	private JLabel jlu, jln, jl1,jl2, jl3, jl4, jl5; //,jl;
	private JTextField jt;
	private JPasswordField jp;
	private JButton jb;
	private JButton jb1;
	private JButton jb2;
	private JButton jb3, jb4;
	private ImageIcon i1, i2, i3;
	private Font f1, f2, f3;
	
	
	
	public Login()
	{
	i1=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\Insta logo.png");
	i2=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\Insta home page.jpg");
	i3=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\facebook-logo.png");
	f1=new Font("Calibri (Body)",140, 18);
	f2=new Font("Calibri (Body)",180, 16);
	f3=new Font("Calibri (Body)", 140, 15);
	//	jl=new JLabel("INSTAGRAM");
	//	jl.setFont(new Font("TimesRoman", Font.ITALIC, 20));
		
	jlu=new JLabel("Username");
	jln=new JLabel("Password"); 
	jt=new JTextField("Phone number, Username or email");
	
	jp=new JPasswordField("Password");
	jb=new JButton("Login");
	jb.setFont(f1);
	jb.setBackground(Color.blue);
	jb.setForeground(Color.WHITE);
	jl1=new JLabel("------------------	or	------------------");
	jl1.setFont(new Font("Bookmanold", Font.BOLD,16));
	jb1=new JButton("Log in with Facebook");
	jb1.setFont(f2);
	jb1.setBackground(Color.BLUE);
	jb1.setForeground(Color.white);;
	jb2=new	JButton("Forgot password?");
	jb2.setFont(f2);
	jb2.setBackground(Color.BLUE);
	jb2.setForeground(Color.white);
	jl2=new JLabel("Don't have account?");
	jb3=new JButton("Sing up");
	jb3.setFont(f3);
	jb3.setBackground(Color.blue);
	jb3.setForeground(Color.WHITE);;
	jb4=new JButton("Clear");
	jb4.setFont(f1);
	jb4.setBackground(Color.blue);
	jb4.setForeground(Color.WHITE);
	jl3=new JLabel(i1);
	jl4=new JLabel(i2);
	jl5=new JLabel(i3);
	//	calling container with empty space
	setLayout(null);
	
	//	After calling, then  arrange components into frame particular position
	
	//	jl.setBounds(800, 35, 180, 90);
	
	jlu.setBounds(720, 240, 120, 40);
	jln.setBounds(720, 280, 120, 40);
	jt.setBounds(800, 250, 200, 20);
	//	To set data non editable
	//	jt.setEditable(false);
	jp.setBounds(800, 290, 200, 20);
	jb.setBounds(870, 330, 80, 25);
	jb4.setBounds(760, 330, 80, 25);
	jl1.setBounds(750, 340, 220, 80);
	jb1.setBounds(755, 412, 230, 25);
	jb2.setBounds(760, 480, 200, 25);
	jl2.setBounds(720, 540, 120, 40);
	jb3.setBounds(850, 550, 100, 20);
	jl3.setBounds(760, 170, 180, 45);
	jl4.setBounds(0, 0, 1366, 786);
	jl5.setBounds(720, 410, 30, 29);
	//	the above value add in conatiner
	
	//	add(jl);
	add(jlu);
	add(jln);
	add(jt);
	add(jp);
	add(jb);
	add(jb4);
	add(jl1);
	add(jb1);
	add(jb2);
	add(jl2);
	add(jb3);
	add(jl3);
	add(jl5);
	add(jl4);
	
	jb.addActionListener(this);
	jb4.addActionListener(this);
	jb3.addActionListener(this);
	jb2.addActionListener(this);
	
	}// design complete

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(jb3))
		{
			Login_create_page l1=new Login_create_page();
			l1.setTitle("Registration Form");
			l1.setSize(1366, 786);
			l1.setDefaultCloseOperation(l1.EXIT_ON_CLOSE);
			l1.setVisible(true);
		}
		if(e.getSource().equals(jb2))
		{
			Forgot_password l2=new Forgot_password();
			l2.setTitle("Forgot Password Page");
			l2.setSize(1366, 786);
			l2.setDefaultCloseOperation(l2.EXIT_ON_CLOSE);
			l2.setVisible(true);
		}
		if(e.getSource().equals(jb))
		{
			String U_Id=jt.getText();
			String Pass=jp.getText();
			
				// Taking DB data
			try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
				System.out.println(con);
				//	sending Select qurey to get data using vehicle (Prepared statement) 
				PreparedStatement ps= con.prepareStatement("select Username, Password from instagram");
				//	Getting through executeQurry
				ResultSet rs= ps.executeQuery();
				
				Vector v=new Vector();
				
				for(;rs.next();)
					{
					v.add(rs.getString("Username"));
					v.add(rs.getString("Password"));
					}
				//		v contains DB data
				if(v.contains(U_Id) && v.contains(Pass))
					{
					Home_page h=new Home_page();
					h.setTitle("Instagram Home page");
					h.setSize(1366, 786);
					h.setDefaultCloseOperation(Home_page.EXIT_ON_CLOSE);
					h.setVisible(true);

					}
				else {
					JOptionPane.showMessageDialog(this, "Invalid Username or Password");
				}
				}
			catch (Exception e1) 
			{
				// TODO: handle exception
				e1.printStackTrace();
			}
		}
				
		if(e.getSource().equals(this.jb4))
		{
			this.jt.setText("");
			this.jp.setText("");
		}
						
	}
}


