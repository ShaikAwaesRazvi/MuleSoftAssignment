package favouritemovies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectRecordByActorName {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
			Connection conn=DataBaseConnection.getConnection();
			String s="select * from movie where lead_actor=?";
			System.out.println("enter name of actor whose movies you want to be displayed");
			String actorname=sc.next();
			PreparedStatement pstmt=conn.prepareStatement(s);
			pstmt.setString(1, actorname);
			ResultSet rs = pstmt.executeQuery();
			int i=1;
			while(rs.next())
			{
				System.out.println("record :"+i);
				String mn=rs.getString(1);
				System.out.println("movie name :"+mn);
				String actor=rs.getString(2);
				System.out.println("actor name :"+actor);
				String actress=rs.getString(3);
				System.out.println("actress name :"+actress);
				String yor=rs.getString(4);
				System.out.println("year of release :"+yor);
				String dn=rs.getString(5);
				System.out.println("director name :"+dn);
				i=i+1;
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

}
