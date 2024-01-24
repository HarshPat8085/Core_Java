package in.com.deepcloning;

public class Account1  implements Cloneable{
     int balance;
     
     
     @Override
    protected Object clone() throws CloneNotSupportedException {
    	
    	return super.clone();
    }
}

