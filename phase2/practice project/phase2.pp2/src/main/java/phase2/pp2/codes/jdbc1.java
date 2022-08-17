package phase2.pp2.codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {
	private static final String url = "jdbc:mysql://localhost:3306/db_world";
    private static final String user = "root";
    private static final String password = "root";
	public static void main(String args[])
	{
		
	    
		 Connection can = null;
	     Statement stmt = null;
	     ResultSet rs = null;
	    
String query1= "select  empname, salary from emp";
    	
    	try {     	
        	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}  	
            
            can = DriverManager.getConnection(url, user, password);
            stmt = can.createStatement();
            rs = stmt.executeQuery(query1); 
    	
    	while (rs.next()) 
    	{ 
    	   //int id = rs.getInt(1); 
    	   String name = rs.getString(1); 
    	   String salary = rs.getString(2); 
    	   System.out.printf(" empname: %s, salary : %s %n",  name, salary); 
    	}
       }
    	catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            
            
            try { stmt.close();
            	   can.close();} catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
	}
}
