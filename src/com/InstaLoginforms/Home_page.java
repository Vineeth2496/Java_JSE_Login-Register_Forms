package com.InstaLoginforms;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Menu;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Home_page extends JFrame implements ActionListener
{

	private JLabel jl1, jl2, jl3, jl4, jl5;	//	jl
	private JTextField tf;
	private JButton jb, jb1, jb2, jb3, jb4, jb5, jb6, jb7;	//, jb8;
	private ImageIcon i1, i2, i3, i4, i5;
	private Font f1, f2;
		
	public Home_page()
	{

		i1=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\katherine-langford.jpg");
		i2=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\insta Status.jpg");
		i3=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\insta background.jpg");
		i4=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\Insta logo.png");
		i5=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\Insta Notification.jpg");
		f1=new Font("Calibri (Body)",150, 12);
		f2=new Font("Calibri (Body)",180, 16);
		//	jl=new JLabel("INSTAGRAM");
		//	jl.setFont(new Font("TimesRoman", Font.ITALIC, 20));
		
		tf=new JTextField("Search");
		jb=new JButton("Home");
		jb.setFont(f1);
		jb.setBackground(Color.green);
		jb.setForeground(Color.black);
		jb1=new JButton("Messages");
		jb1.setFont(f1);
		jb1.setBackground(Color.green);
		jb1.setForeground(Color.black);
		jb2=new JButton("Post");
		jb2.setFont(f1);
		jb2.setBackground(Color.green);
		jb2.setForeground(Color.black);
		jb3=new JButton("Following");
		jb3.setFont(f1);
		jb3.setBackground(Color.green);
		jb3.setForeground(Color.black);
		jb4=new JButton("Request");
		jb4.setFont(f1);
		jb4.setBackground(Color.green);
		jb4.setForeground(Color.black);
		jb5=new JButton("Profile");
		jb5.setFont(f1);
		jb5.setBackground(Color.green);
		jb5.setForeground(Color.black);
	
		
		//	jb6.setFont(new Font("TimesRoman", Font.ITALIC, 30));
		//	jb7=new JButton("FOLLOWER'S ACTIVITIES");
		//	jb7.setFont(new Font("TimesRoman", Font.ITALIC, 30));
		//	jb8=new JButton("Insta Noification");
		//	jb8.setFont(new Font("TimesRoman", Font.ITALIC, 30));
		jl1=new JLabel(i1);
		jl2=new JLabel(i2);
		jl3=new JLabel(i3);
		jl4=new JLabel(i4);
		jl5=new JLabel(i5);
	
			
		jb6=new JButton("Get User Data");
		jb6.setFont(f2);
		jb6.setBackground(Color.BLUE);
		jb6.setForeground(Color.WHITE);
	
	//	jtb=new JTable("Instagram Followers");
		
		setLayout(null);
		
		
		//	jl.setBounds(120,30, 180, 90);
		tf.setBounds(420, 65, 200, 25);
		jb.setBounds(750, 67, 70, 20);
		
		jb1.setBounds(830, 67, 95, 20);		
		
		jb2.setBounds(935, 67, 60, 20);
		jb3.setBounds(1005, 67, 88, 20);
		jb4.setBounds(1103, 67, 85, 20);
		jb5.setBounds(1198, 67, 80, 20);
				
		//	jb6.setBounds(170, 120, 650, 100);
		//	jb7.setBounds(250, 240, 450, 450);
		//	jb8.setBounds(840, 120, 350, 450);		
		jl1.setBounds(250, 200, 450, 450);
		jl2.setBounds(170, 120, 650, 100);
		jl3.setBounds(0, 0, 1366, 786);
		jl4.setBounds(120, 30, 180, 90);
		jl5.setBounds(840, 120, 350, 450);
		jb6.setBounds(370, 650, 200, 25);
		
		
		//	add(jl);
		add(tf);
		add(jb);
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(jb6);
		//	add(jb7);
		//	add(jb8);
		add(jl1);
		add(jl2);
		add(jl4);
		add(jl5);
		add(jl3);
	
		jb2.addActionListener(this);
		jb6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(jb2))
		{
			InstaImages i=new InstaImages();
			i.setTitle("Instagram Post");
			i.setSize(1366, 786);
			i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			i.setVisible(true);
		}
		
		if(e.getSource().equals(jb6))
			{
			
			JFrame f=new InstaJtabledata();
			f.setTitle("Insta Followers");
			f.setSize(1366, 786);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
	}
}
