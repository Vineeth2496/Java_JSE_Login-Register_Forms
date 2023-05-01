package com.InstaLoginforms;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.properties.jdbcCon;

public class InstaImages extends JFrame implements ActionListener
{
	private JButton jb1, jb2;
	private JLabel jl1,jl2, jl3, jl4;
	private JPanel imgA, imgB, imgC;
	private CardLayout local, cl2;
	Container loadcard;
	File fm, fm1, fm2;
	
	ImageIcon i1;
	Font f1;
	
	public InstaImages()
	{
		i1=new ImageIcon("C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\Insta logo.png");
		f1=new Font("Calibri (Body)",180, 16);
		jb1=new JButton("Instagram Post");
		jb1.setFont(f1);
		jb1.setBackground(Color.blue);
		jb1.setForeground(Color.white);
		jb2=new JButton("Instagram View");
		jb2.setFont(f1);
		jb2.setBackground(Color.blue);
		jb2.setForeground(Color.white);
		jl1=new JLabel(i1);
		jl2=new JLabel();
		jl3=new JLabel();
		jl4=new JLabel();
		
		setLayout(null);
		
		jb1.setBounds(700, 60, 160, 25);
		jb2.setBounds(900, 60, 160, 25);
		jl1.setBounds(180, 50, 180, 40);
		jl2.setBounds(120, 120, 300, 300);
		jl3.setBounds(450, 120, 300, 300);
		jl4.setBounds(780, 120, 300, 300);		

		add(jb1);
		add(jb2);
		add(jl1);
		add(jl2);
		add(jl3);
		add(jl4);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(jb1))
		{
			//	Taking image from local system and those file keeping into DB
			
			//	Taking file from local system
			JFileChooser jf=new JFileChooser();
			
			//	open dailouge box with empty selection
			jf.showOpenDialog(null);
			
			//	from jf selecting file
			File ff =jf.getSelectedFile();
			
			//	Taking exact path from ff
			String imagep=ff.getAbsolutePath();
			//	connect to oracle
			
			try
			{
			
			/*	Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
				
			*/
				jdbcCon c=new jdbcCon();
				Connection con=c.con();
				System.out.println(con);
				
				PreparedStatement ps =con.prepareStatement("insert into insta values(?)");
				
				//	taking inputstream to read image path
				FileInputStream fi=new FileInputStream(imagep);
				
				ps.setBinaryStream(1, fi); 
				
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this, "Uploaded");
							
			}
			catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
				JOptionPane.showMessageDialog(this, "Upload Failed");
			}
		}
		if(e.getSource().equals(jb2))
		{
			//	Fetching Image from DB to Java
			try
			{
			/*	Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
			*/
				jdbcCon c=new jdbcCon();
				Connection con=c.con();
				System.out.println(con);
				
				PreparedStatement ps=con.prepareStatement("select * from insta");
				ResultSet rs=ps.executeQuery();
				
				
				File fm1=new File("margot_robbie.jpg");
				
				FileOutputStream fo1=new FileOutputStream(fm1);
				for(;rs.next();)
				{	
				InputStream ii1=rs.getBinaryStream(1);
					for(int ir1;(ir1=ii1.read())!=-1; ir1++)
					{
					fo1.write(ir1);
					}
					ImageIcon ic1 =new ImageIcon(fm1.getAbsolutePath());
					jl2.setIcon(ic1);
					jl3.setIcon(ic1);
					//	jl4.setIcon(ic1);
				}

		/*	//	Vector v1=new Vector();
			//	v1.add("kajol.jpg");
				
			//	Iterator ir=v1.iterator();
			//	v1.add("katherine-langford.jpg");
			//	v1.add("margot_robbie.jpg");
			
				
				fm=new File("kajol.jpg") ;
			//	fm1=new File("kajol.jpg");
			//	fm2=new File("margot_robbie.jpg");
								
				FileOutputStream fo=new FileOutputStream(fm);
			//	FileOutputStream fo1=new FileOutputStream(fm1);
			//	FileOutputStream fo2=new FileOutputStream(fm2);
				for(;ir.hasNext();)
				{	
					
				InputStream ii=rs.getBinaryStream(1);
					for(int i;(i=ii.read())!=-1; i++)
					{
					fo.write(i);
				//	fo1.write(ir);
				//	fo2.write(ir);
					}
					ImageIcon ic =new ImageIcon(fm.getAbsolutePath());
				//	ImageIcon ic1 =new ImageIcon(fm1.getAbsolutePath());
				//	ImageIcon ic2 =new ImageIcon(fm2.getAbsolutePath());
					jl2.setIcon(ic);
				//	jl3.setIcon(ic1);
				//	jl4.setIcon(ic2);
				
					System.out.println(ir.next());
				}	
			*/
				
				
			/*	String imageLocation = "C:\\Users\\vinee\\OneDrive\\Pictures\\Saved Pictures\\";

				String[] imageNames = {"kajol", "katherine-langford", "margot_robbie"};
				String imgExt = ".jpg";
				int count = 1;
				
				for (String imageName : imageNames) 
				{
				     String imagePath = imageLocation + imageName + imgExt;
				     BufferedImage img = ImageIO.read(new File(imagePath));
				     ImageIcon icon = new ImageIcon(img);
				     JLabel label = new JLabel(icon);
				     loadcard.add(label, String.valueOf(count));
				     count++;
				  }
			*/
			
			
			/*	File fm1=new File("margot_robbie.jpg");
				
				FileOutputStream fo1=new FileOutputStream(fm1);
				for(;rs.next();)
				{	
				InputStream ii1=rs.getBinaryStream(1);
					for(int ir1;(ir1=ii1.read())!=-1; ir1++)
					{
					fo.write(ir1);
					}
					ImageIcon ic1 =new ImageIcon(fm1.getAbsolutePath());
				//	jl2.setIcon(ic);
					jl3.setIcon(ic1);
				//	jl4.setIcon(ic);
				}
				File fm2=new File("kajol.jpg");
				
				FileOutputStream fo2=new FileOutputStream(fm2);
				for(;rs.next();)
				{	
				InputStream ii2=rs.getBinaryStream(1);
					for(int ir2;(ir2=ii2.read())!=-1; ir2++)
					{
					fo.write(ir2);
					}
					ImageIcon ic2 =new ImageIcon(fm2.getAbsolutePath());
				//	jl2.setIcon(ic);
				//	jl3.setIcon(ic);
					jl4.setIcon(ic2);
				}
			*/
			}
			catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
}
