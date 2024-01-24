package in.com.deepcloning2;

public class Testcustmer {
public static void main(String[] args) throws Exception {
	Custmer c = new Custmer("harsh", 5000);
	Custmer c2 = (Custmer) c.clone();
	
	 c2.name = "vishal";
	 c2.a.balance = 500;
	 
	
	System.out.println(c.name);
	System.out.println(c.a.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
	
}
}