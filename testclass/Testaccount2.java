package in.com.testclass;

public class Testaccount2 {
public static void main(String[] args) throws Exception {
	Account2 a = new Account2(3000);
	Account2 a2 = (Account2) a.clone();
	a2.balance = 303;
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
	
	
}
}
