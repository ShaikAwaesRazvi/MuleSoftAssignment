package favouritemovies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
public class InsertRecords {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Connection conn=DataBaseConnection.getConnection();
			System.out.println("please how many records you want to enter?");
			int rec=sc.nextInt();
			while(rec>0)
			{
				String s="insert into movie values(?,?,?,?,?)";
				PreparedStatement pstmt=conn.prepareStatement(s);
				System.out.println("enter movie name");
				String mn=sc.next();
				pstmt.setString(1, mn);
				System.out.println("enter actor name");
				String actor=sc.next();
				pstmt.setString(2, actor);
				System.out.println("enter actress name");
				String actress=sc.next();
				pstmt.setString(3, actress);
				System.out.println("enter year of release");
				String yor=sc.next();
				pstmt.setString(4, yor);
				System.out.println("enter director name");
				String dn=sc.next();
				pstmt.setString(5, dn);
				int n=pstmt.executeUpdate();
				if(n>0)
					System.out.println("movie name "+mn+" has been recorded successfully");
				rec=rec-1;
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

}
