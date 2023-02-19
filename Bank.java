package JdbcSqlConnection.JdbcSqlConnection;

public class Bank 
{
	
	private int id;
	private int acno;
	private String acname;
	private double balance;
	private int acpin;
	private String actype;
	
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public int getAcpin() {
		return acpin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAcpin(int acpin) {
		this.acpin = acpin;
	}
	public String getActype() {
		return actype;
	}
	public void setActype(String actype) {
		this.actype = actype;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", acno=" + acno + ", acname=" + acname + ", balance=" + balance + ", acpin=" + acpin
				+ ", actype=" + actype + "]";
	}
	
		
	}
	
	
