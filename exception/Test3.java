package in.com.exception;

public class Test3 {
	public static void main(String[] args) {
  String name = "harsh";
  System.out.println(name.length());
  
 try {
	 System.out.println(name.charAt(15));
} catch (Exception e) {
	System.out.println(e);
}
  
  
	}
}
 