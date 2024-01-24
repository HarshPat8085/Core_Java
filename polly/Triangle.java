package in.com.polly;

public class Triangle extends Shape {
private int hight ;
private int base;

public int getHight() {
	return hight;
}
public void setHight(int hight) {
	this.hight = hight;
}
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public void area() {
	int Tarea = (getBase() * getHight()) / 2;
	System.out.println("Triangle Area " + Tarea);
}

}
