package in.com.deepcloning;

public class Custmer2 implements Cloneable {
	
	String name = null;
	
	
	Account2 a = new Account2();
	
 public Custmer2 (String name,int balance) {

      this.name = name;
      this.a.balance = balance ;
}     
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	Custmer2 c = (Custmer2) super.clone();
    	c.a = (Account2)a.clone();
    	return c;
    }
    }

