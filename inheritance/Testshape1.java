package in.com.inheritance;

public class Testshape1 {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderWidth(12);
	s.setColor("red");
	System.out.println(s.getBorderWidth());
	System.out.println(s.getColor());
	
	
	Rectangle r = new Rectangle();
	r.setBorderWidth(12);
	r.setLength(100);
	System.out.println(r.getBorderWidth());
	System.out.println(r.getLength());
	System.out.println(r.area());
	
	
	Circle c = new Circle();
	c.setRadius(9);
	System.out.println(c.getRadius());
	System.out.println(c.area());
	
	
	
	
	
	
}
}

