package in.com.inheritance;

public class Circle extends Shape {
private int radius = 0;
private double PI = 3.14;
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}

public double area() {
	double CArea = PI * getRadius ();
	System.out.println("Circle Area ="+ CArea);
	return CArea;
}


}

