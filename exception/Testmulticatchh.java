package in.com.exception;


public class Testmulticatchh {
public static void main(String[] args) {
	String name = null;
	
	try {
		System.out.println("Length of names is" + name.length());
		System.out.println("Charter at 7th position is" + name.charAt(6));
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	
	catch (NullPointerException e) {
		System.out.println("Sundar sa nam nahi he");
	}
	finally {
		System.out.println("okk");
	}
	
}

}
