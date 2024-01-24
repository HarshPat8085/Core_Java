package in.com.deepcloning;

public class Custmer1 implements Cloneable {
    String name = null;
    
    Account1 a = new Account1();
    
    
    public Custmer1( String name,int balance) {
		this.name = name;
		this.a.balance = balance;
	}
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	Custmer1 c = (Custmer1) super.clone();
    	c.a = (Account1) a.clone();
    	return c;
    }
    
}
