package JdbcSqlConnection.JdbcSqlConnection;

import java.util.List;
import java.util.Scanner;

public class BankMenu 
{
	public static void main (String args[])
	{    
		Bankcurd bd=new Bankcurd();
		Scanner sc=new Scanner(System.in);
		int chioce=0;
		do
		{
			System.out.println("***********SBI**********");
			System.out.println("1.Insert Bank");
			System.out.println("2.delete Bank");
			System.out.println("3.update Bank");
			System.out.println("4.Display Bank");
			System.out.println("5.DisplayAll Bank");
		//	System.out.println("6.Exit");
			System.out.println("..........................");
			System.out.println("Enetr the choice:");
			System.out.println("***********************");
			System.out.println("****visit once Again******");
			chioce=sc.nextInt();
			
			switch(chioce)
			{
			case 1:
			{
			
		          Bank b=new Bank();	
				  System.out.println("Enter following Details for Creating account");
				  System.out.println("Enter account id ");
				  b.setId(sc.nextInt());
				  System.out.println(" Enter account number");
				  b.setAcno(sc.nextInt());
				  System.out.println(" Enter account Holder name ");
				  b.setAcname(sc.next());
				  System.out.println("enter Intial balance ");
				  b.setBalance(sc.nextDouble());
				  System.out.println("Enter a Acpin");
				  b.setAcpin(sc.nextInt());
				  System.out.println("Enter account type");
				  b.setActype(sc.next());
				  
				  if(bd.insertBank(b)>0)
				  {
					  System.out.println("record inserted successfully...");
				  }
			
				  
				  break;
				  }
		
		
		
			case 2:
			{
				System.out.println("Enetr id ");
				Bank b= new Bank();
				if(bd.deleteBank(1)>0);
				{
					System.out.println("Bank delect successfully");
				}
				break;
				
			}
			
			case 3:
			{
				Bank b=new Bank();
				System.out.println("Enter account id ");
				  b.setId(sc.nextInt());
				  System.out.println(" Enter account number");
				  b.setAcno(chioce);
				  System.out.println(" Enter account holder name ");
				  b.setAcname(sc.toString());
				  System.out.println("enter intial balance ");
				  b.setBalance(sc.nextDouble());
				  System.out.println("Enter a Acpin");
				  b.setAcpin(sc.nextInt());
				  System.out.println("Enter account type");
				  b.setActype(sc.next());
				  
				  if(bd.updateBank(b)>0);
				  {
					  System.out.println("Product Update Successfully");
					  
				  }
				   break;
			
	}
	case 4:
	{
		 System.out.println("Enter id");
		 Bank b=new Bank();
		 b.setId(sc.nextInt());
		 
		 System.out.println(bd.displayBank(b.getId()));
	}
	   break;
	   
	
	case 5:
	{
		List<Bank>list=bd.displayAllBank();
		for(Bank Bank :list)
		{
			System.out.println("Bank");
		}
		break ;
	}
	  default :
	  {
		  System.out.println("invalid chioce");
	  
	}
	
		}
		
	}while(chioce<=5);
     
     }
     }
     
		
	
			
					  
					  
					  

			
		
	
	
	
	

		
		
	
	
		
				   
		
				   
				   
					
		
			
				  
					   
				  
				  
			
			
		


