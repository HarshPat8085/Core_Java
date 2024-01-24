package in.com.exception;


public class Testloginexcption {
public static void main(String[] args) {
	String name = "harsh";
	if (name.equals("harsh")) {
		System.out.println("yes valid user!!!!");
	}
	
	else {
		Loginexception e = new Loginexception();
		
		try {
			throw e;
		} catch (Loginexception e2) {
			System.out.println(e2);
		}
}
	
}
}
