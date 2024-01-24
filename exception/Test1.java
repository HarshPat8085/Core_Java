package in.com.exception;

public class Test1 {
public static void main(String[] args) {
	String name = "harsh";
	System.out.println(name.length());
	
	try {
		System.out.println(name.charAt(12));
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
