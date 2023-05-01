package com.InstaLoginforms;

import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InstaJtabledata extends JFrame {
	
	DefaultTableModel model=new DefaultTableModel();
	Container cnt=this.getContentPane();
	JTable jtb=new JTable(model);
	
	public InstaJtabledata()
	{
		setLayout(null);
		// jtb.setBounds(150, 80, 550, 400);
	
		// cnt.setBounds(300, 100,600, 300);
		
		cnt.setLayout(new FlowLayout(FlowLayout.CENTER));
	
		//	add(jtb);
		model.addColumn("FirstName");
		model.addColumn("LastName");
		model.addColumn("STDCode");
		model.addColumn("PhoneNo");
		model.addColumn("Email");
		model.addColumn("Username");
		model.addColumn("Password");
		model.addColumn("Gender");
		model.addColumn("Country");
		model.addColumn("Language");
	
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
		System.out.println(con);
		
		PreparedStatement ps =con.prepareStatement("select * from Instagram");
		
		ResultSet rs =ps.executeQuery();
		
		while(rs.next())
		{
			model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)} );
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		JScrollPane js=new JScrollPane(jtb);
		cnt.add(js);
		this.pack();

	}

}
