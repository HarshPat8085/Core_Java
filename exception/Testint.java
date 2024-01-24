package in.com.exception;

public class Testint {
public static void main(String[] args) {
	int a = 500;
	int b = 00;
	
	
	try {
		int c = a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
