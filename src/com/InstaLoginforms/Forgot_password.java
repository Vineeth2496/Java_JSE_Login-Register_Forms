package com.InstaLoginforms;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Forgot_password extends JFrame
{
	private JLabel  jl1, jl2, jl3,jl4, jl5, jl6;	//jl
	private JButton jb, jb1, jb2;
	private JTextField jt;
	private ImageIcon i1, i2;
	private Font f1, f2;
	public Forgot_password()
	{
		i1=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\Insta logo.png");
		i2=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\reels.jpg");
		f1=new Font("Forte",180, 15);
		//	f2=new Font("Calibri (Body)",150, 16);
		f2=new Font("Calibri (Body)",180, 16);
				
		//	jl=new JLabel("INSTAGRAM");
		//	jl.setFont(new Font("TimesRoman", Font.ITALIC, 20));
		jl1=new JLabel("Trouble Logging In..?");
		jl1.setFont(f1);
		jl1.setForeground(Color.magenta);
		//	jl1.setFont(new  Font("Bookmanold",Font.ITALIC , 16));
		jl2=new JLabel("Enter your email, phone, or username and we'll");
		//	jl2.setFont(f1);
		jl2.setForeground(Color.ORANGE);
		jl2.setFont(new Font("Bookmanold",Font.ITALIC , 13));
		jl3=new JLabel("send you a link to get back into your account.");
		jl3.setForeground(Color.ORANGE);
		jl3.setFont(new Font("Bookmanold",Font.ITALIC , 13));
		jt=new JTextField("Email, Phone or Username");
		jb=new JButton("Send Login Link");
		jb.setFont(f2);
		jb.setBackground(Color.BLUE);
		jb.setForeground(Color.WHITE);
		jl4=new JLabel("----------------------	or	----------------------");
		jl4.setForeground(Color.CYAN);
		jl4.setFont(new Font("Bookmanold", Font.BOLD,18));
		jb1=new JButton("Create New Account");
		jb1.setFont(f2);
		jb1.setBackground(Color.BLUE);
		jb1.setForeground(Color.WHITE);
		jb2=new JButton("Back to Login");
		jb2.setFont(f2);
		jb2.setBackground(Color.BLUE);
		jb2.setForeground(Color.WHITE);
		jl5=new JLabel(i1);
		jl6=new JLabel(i2);
		//	calling container with empty space
		setLayout(null);

		// After calling, then  arrange components into frame particular position

		//	jl.setBounds(600, 35, 180, 90);
		jl1.setBounds(585, 55, 400, 150);
		jl2.setBounds(530, 70, 400, 175);
		jl3.setBounds(535, 85, 400, 175);
		jt.setBounds(535, 210, 265, 40);
		jb.setBounds(535, 270, 265, 30);
		jl4.setBounds(525, 300, 300, 80);
		jb1.setBounds(535, 390, 265, 30);
		jb2.setBounds(535, 450, 265, 30);
		
		jl5.setBounds(570, 60, 180, 40);
		jl6.setBounds(0, 0, 1366, 786);
		//	the above value add in conatiner
		
		//	add(jl);
		add(jl1);
		add(jl2);
		add(jl3);
		add(jt);
		add(jb);
		add(jl4);
		add(jb1);
		add(jb2);
		add(jl5);
		add(jl6);
	}
}
