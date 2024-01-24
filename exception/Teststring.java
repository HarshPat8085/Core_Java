package in.com.exception;

public class Teststring {
public static void main(String[] args) {
	String name = "patel";
	
	System.out.println(name.length());
	try {
		System.out.println(name.charAt(6));
	} catch (Exception e) {
		System.out.println(e);// TODO: handle exception
	}
}
}
