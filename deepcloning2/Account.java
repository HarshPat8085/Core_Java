package in.com.deepcloning2;

public class Account implements Cloneable{
     int balance;
     
     
     @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
}
