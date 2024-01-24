package in.com.deepcloning2;

public class Custmer implements Cloneable {
  private static final String Custmer = null;

String name = null;
  
  Account a = new Account();
  
  public Custmer(String name,int balance) {
	  this.name = name;
	  this.a.balance = balance;
	
	  
	  
}
  @Override
	protected Object clone() throws CloneNotSupportedException {
		Custmer c = (Custmer) super.clone();
		c.a= (Account) a.clone();
		return c;
	}
	}
	

