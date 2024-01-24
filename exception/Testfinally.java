package in.com.exception;

public class Testfinally {
public static void main(String[] args) {
	int a = 10;
	int  b = 0;
	
	
	try {
		int c = a/b;
		System.out.println(c);
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
	String name = "harsh";
	
      try {
    	  System.out.println(name.charAt(15));
	} catch (Exception e) {
		System.out.println(e);
	}
		
	finally {
		System.out.println("okk");
	}
}
}
