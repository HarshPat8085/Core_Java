package in.com.inheritance;

public class Rectangle1 extends Shape1{
private int length;
private int width;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}	
	public double area() { 
		int rArea = getLength() * getWidth();
		System.out.println("Rectangle rArea =" + rArea);
		return rArea;
	}

}
