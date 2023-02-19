package JdbcSqlConnection.JdbcSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class Bankcurd 
{
	 private int id;

	int  insertBank(Bank b)
	 { 
		 int check =0;
		 try 
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			 
			 String s="insert into bank1(acno,acname,balance,pin,actype) values(?,?,?,?,?,?)";
			 PreparedStatement pst=con.prepareStatement(s);
			 pst.setInt(1,b.getId());
			 pst.setInt(2,b.getAcno());
			 pst.setString(3,b.getAcname());
			 pst.setDouble(4,b.getBalance());
			 pst.setInt(5,b.getAcpin());
			 pst.setString(6,b.getActype());
			 
			 
			 check=pst.executeUpdate(); 
			 
		 }
		 
		 
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
			return check;
	 }
  		 
	 public int deleteBank(int id)
	 {
		 int check =0;
		 try 
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			 
			 String s="delete from bank1 where id=?";
			 PreparedStatement pst=con.prepareStatement(s);
			 
			 pst.setInt(1, id);
			 
		      check=pst.executeUpdate(); 
			 
		 }
		 
		 
		 catch(Exception e)
		 
		 {
			 System.out.println(e);
		 }
			return check;
	 }
	 public int updateBank (Bank b)
	 {
		 int check =0;
		 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			  
			 String sql="Update from bank1 where id=?";
			 PreparedStatement pst=con.prepareStatement(sql);
			 pst.setInt(1,b.getId());
			 pst.setInt(2,b.getAcno());
			 pst.setString(3,b.getAcname());
			 pst.setDouble(4,b.getBalance());
			 pst.setInt(5,b.getAcpin());
			 pst.setString(6,b.getActype());
			 
		     check=pst.executeUpdate();
		 }
		 catch (Exception e)
		 {
			 System.out.println(e);
			 
		 }
		 return check;
	 }
	 

         public Bank displayBank(int id )
         {
        	 Bank b=null;
        	 try 
        	 {
        		 Class.forName("com.msql.cj.jdbc.Driver");
        		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
        		 
        		 String sql="select * from bank1 where id=?";
        		 PreparedStatement pst= con.prepareStatement(sql);
        		 
        		 pst.setInt(1, id);
        		 ResultSet rs= pst.executeQuery();
        		 while (rs.next());
        		 
        		 {
        			 b=new Bank();
        			 b.setId(rs.getInt(1));
        			 b.setAcno(rs.getInt(2));
        			 b.setAcname(rs.getString(3));
        			 
        		 }
        			 
        	 }
        	  catch(Exception e)
        	 {
        		  System.out.println(e);
        	 }
        	 return b;
        	 
        	 }
        		 
        		 
         public List<Bank>displayAllBank()
         {
        	 List <Bank>list =new ArrayList<Bank>();
        	 try
        	 {
        		  Class.forName("com.mysql.cj.jdbc.Driver");
        		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
        		  
        		  String sql="select * from bank1";
        		  PreparedStatement pst=con.prepareCall(sql);
        		  
        		  ResultSet rs= pst.executeQuery();
        		  while(rs.next());
        		  {
        			    Bank b=new Bank();
        			     pst.setInt(1,b.getId());
        				 pst.setInt(2,b.getAcno());
        				 pst.setString(3,b.getAcname());
        				 pst.setDouble(4,b.getBalance());
        				 pst.setInt(5,b.getAcpin());
        				 pst.setString(6,b.getActype());
        				
        				 
        				 list.add(b);
        		  }
        	 }
                catch(Exception e)
        	 {
                	System.out.println(e);
        	 }
        	  return list;
        	 }

			public double checkbalance(int accountno )
			{
				double balance =0.0;
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
					String sql="select acbalance from bank1 where acnumber=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setInt(1, accountno);
					ResultSet rs=ps.executeQuery();
					while (rs.next());
					balance=rs.getDouble(1);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
				}
			  return balance;
			}
          
             public double depositeamount(double amount, int accountno)
             {
            	 double amount1=checkbalance(accountno)+amount;
            	 try
            	 {
            		 Class.forName("com.mysql.cj.jdbc.Driver");
            		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
            		 String sql=" update bank1 set balance=?where acnumber=?";
            		 PreparedStatement ps=con.prepareStatement(sql);
            		 
            		 ps.setInt(1, accountno);
            		 ps.setDouble(2, amount);
            		 //ps.setInt (1,acpin);
            		 ps.executeUpdate();
            	 }
            	 catch(Exception e)
            	 {
            		 System.out.println(e);
            	 }
            	 return amount1;
            		 
            	 }
            	 
            	 
             }
  
     
        			  
        
        			  
        		  
        	 
 


	
		
	
	 

