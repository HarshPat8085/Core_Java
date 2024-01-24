package in.com.testclass;

public class Account2 implements Cloneable {
    int balance;
    public Account2(int balance) {
		this.balance = balance;
	}
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
}
