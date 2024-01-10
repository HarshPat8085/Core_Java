package in.com.rays;

public class Stringclass {
public static void main(String[] args) {
	int a=100;
	int b=20;
	int c=a*b;
	String value="-";
	
	switch (value) {
	case "+":
		System.out.println("This is add condition body="+ c);
		
		break;
	case"-":
		System.out.println("This is Sub condition body="+ c);
		break;
	case "*":
		System.out.println("This is mult condition body="+ c);
		break;
	case"%":
		System.out.println("This is Modulous body="+ c);
		break;
	default:
		System.out.println("This is default value");
		break;
	}
}
}
