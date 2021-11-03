package favouritemovies;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection 
{
	public static Connection getConnection() {
		Connection con = null;
		try {
	  
			Class.forName("org.sqlite.JDBC");
			System.out.println("Driver Class Loaded");
			//here tha name of database is moviedetails.
			con =  DriverManager.getConnection("jdbc:sqlite:moviedetails.db");
			System.out.println("Connection Established");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  return con;
  }
	public static void main(String []args)
	{
		DataBaseConnection dbcon=new DataBaseConnection();
		dbcon.getConnection();
	}

}
