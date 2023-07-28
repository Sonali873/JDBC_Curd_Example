package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.beans.EmployeePojo;
import com.client.Conection;

public class EmployeeDao {

	public static void displyAllRecoreds(){
		Connection con=Conection.provideConnection();
		try {
			Statement s = con.createStatement();
			String query="select * from emp";
			ResultSet st=s.executeQuery(query);
			while(st.next()) {
				System.out.println(st.getInt(1)+" "+st.getString(2)+" "+st.getString(3)+" "+st.getString(4));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public static boolean insertRecord(EmployeePojo emp) {
		return false;
		
		
	}
	
}
