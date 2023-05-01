/*
package com.InstaLoginforms;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class InstadataFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("oracle.jbdc.driver.OracleDriver").newInstance();
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
			System.out.println(con);
			//	sending query
			PreparedStatement ps=con.prepareStatement("select * from instagram");
			
			ResultSet rs =ps.executeQuery();
			//	from rs fetching bytes data
			byte data[]=null;
			for(;rs.next();)
			{
				data=rs.getBytes(1);
			}
			//	bytes data converting object format
			
			ByteArrayInputStream bai=new ByteArrayInputStream(data);
			ObjectInputStream oi=new ObjectInputStream(bai);
			
			TreeMap tm=(TreeMap)oi.readObject();
			
			//	from tm fetching registration data
			
			Set s=tm.entrySet();
			
			Iterator i =s.iterator();
			
			for(;i.hasNext();)
			{
				System.out.println(i.next());
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
*/