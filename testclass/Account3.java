package in.com.testclass;

public class Account3 implements Cloneable {
     int balance;
     public Account3(int balance) {
    	 		this.balance = balance;
	}
     
     @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
}
