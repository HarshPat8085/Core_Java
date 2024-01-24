package in.com.exception;

public class Testmulticatch {
public static void main(String[] args) {
	String name = "vijay";
	System.out.println(name.length());
	try {
		System.out.println("Charter at 7th position is" + name.charAt(6));
	} catch (Exception e) {
		System.out.println(e);
	}
	
	
	}
}

