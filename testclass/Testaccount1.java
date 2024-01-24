package in.com.testclass;

public class Testaccount1 {
public static void main(String[] args) throws Exception {
	Account1 a = new Account1(2000);
	Account1 a2 = (Account1) a.clone();
	a2.balance = 202;
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
	
}
}
