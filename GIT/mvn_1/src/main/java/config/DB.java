package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultset;
	

	    // Change these variables according to your database configuration
	     //String DB_URL = "jdbc:mysql://revphpe.djaxbidder.com:3306/reviveauto?useSSL=false&serverTimezone=UTC";
	     //String DB_USER = "reviveauto";
	    //String DB_PASSWORD = "D9EL[i8OsJtC1WH-";
	    
	 

	    public void DB_connection() {  
	    	
	    	   String DB_URL = "jdbc:mysql://revphpe.djaxbidder.com:3306/reviveauto?useSSL=false&serverTimezone=UTC";
	  	     String DB_USER = "reviveauto";
	  	    String DB_PASSWORD = "D9EL[i8OsJtC1WH-";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Connecting to DB");
				connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			// To check connection is successful or not
			
			if (connection == null) {
				System.out.println("Connection failed");
			}
			else {
				System.out.println();
				System.out.println();
				System.out.println("Connection successful");
			}
	    	
	    
	}
	    
	    public static void RetriveData() {
	    	
	    	String query = "SELECT * FROM rv_data_bkt_m";
	    	
	    	//String query1 = "SELECT * FROM rv_data_bkt_c";
	    	
	    	try {
				statement = connection.createStatement();
				resultset = statement.executeQuery(query);
				//resultset = statement.executeQuery(query1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    	try {
				while (resultset.next()) {
					int creativeID = resultset.getInt("creative_id");
					int zoneID = resultset.getInt("zone_id");
					int count = resultset.getInt("count");
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("For Creative id: " +creativeID +" the zone id is: "+zoneID +" their impression count is: "+count);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    public void Closeconnection() {
	    	if (connection !=null) {
	    		System.out.println();
	    		System.out.println();
	    		System.out.println();
	    		System.out.println("Closing the Connection");
	    		try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    }


}
