package in.com.abs;

public class Testabs {
public static void main(String[] args) {
	Rectangle r = new Rectangle() {
		
		@Override
		public void areacheck() {
			System.out.println("this is areacheck abs ");
			
		}
	};
	r.area();
	r.hello();
	r.areacheck();
	
	
	Circle c = new Circle() {
		
		@Override
		public void area() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void radius() {
			// TODO Auto-generated method stub
			
		}
	};
}
	
}

