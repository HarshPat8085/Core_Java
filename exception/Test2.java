package in.com.exception;

public class Test2 {
public static void main(String[] args) {
	int a = 20;
	int b = 0;
  
	try {
		  int c = a/b;
		    System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
	
}
}
