package favouritemovies;
import java.sql.*;
public class CreateTable 
{
	public static void main(String args[]) {
		try {
		Connection conn=DataBaseConnection.getConnection();
		Statement stmt=conn.createStatement();
		String str="CREATE TABLE movie(\n"
				+ "	movie_name TEXT NOT NULL,\n"
				+ "	lead_actor TEXT NOT NULL,\n"
				+ "	lead_actress TEXT NOT NULL,\n"
				+ "	year_of_release TEXT NOT NULL UNIQUE,\n"
				+ "	director_name TEXT NOT NULL UNIQUE\n"
				+ ");";
		int temp=stmt.executeUpdate(str);
		if(temp>0)
			System.out.println("table created successfully");
		else
			System.out.println("there is an error in table creation");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
