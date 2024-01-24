package in.com.testclass;

public class Testaccount {
public static void main(String[] args) throws Exception {
	Account a = new Account (1000);
	Account a2 = (Account) a.clone();
	a2.balance = 101;
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
	
	
}
}