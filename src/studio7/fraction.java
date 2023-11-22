package studio7;

public class fraction {
	private int num;
	private int den;
	
	public fraction(int n, int d) {
		num = n;
		den = d;
	}
	public static String add(fraction f1, fraction f2) {
		if (f1.den == f2.den) {
			return f1.num + f2.num + "/" + f1.den;
		}
		int commonden = f1.den * f2.den;
		return (f1.num * f2.den + f1.den * f2.num) + "/" + commonden;
	}
	public String mult(fraction f2) {
	
		return (this.num * f2.num)  + "/" + (this.den * f2.den);
	}
	
	public String getFrac() {
		return (num + "/" + den);
	}
	public String rec() {
		return den + "/" + num;
	}
	

public static void main(String args[]) {
		fraction f1 = new fraction(7, 3);
		fraction f2 = new fraction(3, 7);
		System.out.print(f1.mult(f2));	
	}
}