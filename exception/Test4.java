package in.com.exception;

public class Test4 {
public static void main(String[] args) {
	String name = null;
	
	try {
		System.out.println(name.length());
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
