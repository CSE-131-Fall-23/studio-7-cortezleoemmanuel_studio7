package studio7;

public class die {
	
	private int n;
	
	public die(int number) {
		n = number;
	}
	
	public int row() {
		return (int)(Math.random() * n) + 1;
	}
	
	public static void main(String args[]) {
		die d1 = new die(6);
		System.out.println(d1.row());
	}

}
