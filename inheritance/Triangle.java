package in.com.inheritance;

public class Triangle extends Shape {
private int base =0;
private int hight=0;
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHight() {
	return hight;
}
public void setHight(int hight) {
	this.hight = hight;
}
  public double area() {
	  int tArea = (getHight() * getBase())/2;
	  System.out.println("Triangle Area =" + tArea);
	  return tArea;
	  
  }
}
