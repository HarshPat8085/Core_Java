package in.com.deepcloning;

public class Testcust1 {
public static void main(String[] args) throws Exception {
	Custmer1 c = new Custmer1("patel", 1000);
	Custmer1 c1 = (Custmer1) c.clone();
	
	c1.name = "vishal";
	c1.a.balance = 200;
	
	System.out.println(c.name);
	System.out.println(c.a.balance);
	
	System.out.println(c1.name);
	System.out.println(c1.a.balance);
	
}
}
