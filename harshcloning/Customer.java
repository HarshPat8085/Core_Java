package in.com.harshcloning;

public class Customer implements Cloneable {
   String name = null;
   
   Account a = new Account();
   
  

@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
  

