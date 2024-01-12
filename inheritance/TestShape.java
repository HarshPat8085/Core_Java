package in.com.inheritance;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderWidth(12);
	s.setColor("red");
	System.out.println(s.getBorderWidth());
	System.out.println(s.getColor());
	s.area();
	
	
	Rectangle r = new Rectangle();
	r.setLength(100);
	r.setWidth(12);
	r.area();
	
	Circle c = new Circle();
	c.setRadius(9);
	c.area();
	
	Triangle t = new Triangle();
	t.setHight(25);
	t.setBase(30);
	System.out.println(t.getHight());
	System.out.println(t.getBase());
	t.area();
	
	

	
	
	
}
}
