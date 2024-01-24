package in.com.deepcloning;

public class Testcustmer2 {
public static void main(String[] args) throws Exception {
	Custmer2 c = new Custmer2("harsh", 5000);
	Custmer2 c2 = (Custmer2) c.clone();
	
	c2.name = "vishal";
	c2.a.balance = 500;
	
	System.out.println(c.name);
	System.out.println(c.a.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
	
}
}
