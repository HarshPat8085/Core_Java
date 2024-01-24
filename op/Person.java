package in.com.op;

public class Person {
private String name;
private Dob date;

public Dob getDate() {
	return date;
}
public void setDate(Dob date) {
	this.date = date;
}
private String address;
private int age;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
