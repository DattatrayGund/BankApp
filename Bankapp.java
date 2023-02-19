package JdbcSqlConnection.JdbcSqlConnection;
import java.util.*;

public class Bankapp 
{
	
	 public static void main(String args[])
	 //TUDO Auto-generted method bank
	 {
		 Bank b=new Bank();
	       b.setId(2);
	       b.setAcno(1230);
	       b.setBalance(45000);
	       b.setAcname("anand");
	       b.setAcpin(45145);
	       b.setActype("saving");
	       Bankcurd sc=new Bankcurd();
		 
		 if(sc.insertBank(b)>0)
		 {
			 System.out.println(" record inserted successfully");
			 
		 }
		 //delete bank
		 
		 if(sc.deleteBank(3)>0)
		 {
			 System.out.println(" record deledted successfully");
			 
		 }
		 
		 
		 
		 //to update
		 
		/* if(sc.updateBank(2)>0)
		 {
			 System.out.println(" update successfully");
		 }*/
		 
		
		 
		 
		 
	 }

		
	}
    		  
    		  
    		  
      
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	


