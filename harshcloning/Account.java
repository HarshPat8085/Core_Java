package in.com.harshcloning;

public class Account implements Cloneable {
    int balance ;
    
    
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	
    	return super.clone();
    }
}
