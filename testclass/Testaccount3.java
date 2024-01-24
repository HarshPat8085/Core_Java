package in.com.testclass;

public class Testaccount3 {
public static void main(String[] args) throws Exception {
	Account3 a = new Account3(5000);
	Account3 a2 = (Account3) a.clone();
	a2.balance = 501; 
	
	
	System.out.println(a.balance);
	System.out.println(a2.balance);
}
}
