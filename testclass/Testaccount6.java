package in.com.testclass;

public class Testaccount6 {
public static void main(String[] args) throws Exception {
	Account6 a = new Account6();
	Account6 a2 = (Account6) a.clone();
	a2.balance = 601;
	
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
}
}
