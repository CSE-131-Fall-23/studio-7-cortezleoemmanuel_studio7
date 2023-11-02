package studio7;

public class Task {
	
	public static class rectangle{
		private double length;
		private double width;
		
		public rectangle(double l, double w) {
			length = l;
			width = w;
		}
		
		public double getLength() {
			return length;
		}
		
		public double getWidth() {
			return width;
		}
		
		public double area() {
			return width * length;
		}
		
		public boolean square() {
			return length == width;
		}
		
	}
	
	public static String compare(rectangle r1, rectangle r2) {
		if(r1.area() == r2.area()) {
			return "Same area";
		}else if(r1.area() > r2.area()) {
			return "R1";
		}else {
			return "R2";
		}	
	}
	
	public static void main(String args[]) {
		rectangle r1 = new rectangle(3,3);
		rectangle r2 = new rectangle(3,3);
		
		System.out.println(r1.area());
		System.out.println(r1.square());
		System.out.println(compare(r1, r2));
	}

}
