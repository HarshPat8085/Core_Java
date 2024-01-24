package in.com.op;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setColor("Orange");
	s.setBorderWidth(100);
	System.out.println(s.getColor());
	System.out.println(s.getBorderWidth());
}
}
