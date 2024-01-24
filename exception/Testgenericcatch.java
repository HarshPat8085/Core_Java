package in.com.exception;

public class Testgenericcatch {
public static void main(String[] args) {
	String name = "vijay";
	
	try {
		System.out.println("length of name is "+ name.length());
		System.out.println("Charter at 7th position is" + name.charAt(6));
	} catch (Exception e) {
		System.out.println("Error" + e.getMessage());
	}
	
}
}
