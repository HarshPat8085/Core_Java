package in.com.polly;

public class Circle extends Shape {
private int radius = 0;

public static final double PI = 3.14;


public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}

public void area() {
  double Carea = PI * getRadius() * getRadius();
  System.out.println("Circle Area ="+ Carea);
}


}
