package ch.proebel;

public class ClazzOne {

	public static void main(String[] args) {
		// Provoke a conflict -> solved
		int a = 5;
		int b = 10;
		System.out.println("Hello");
	}
	
	private void gurke() {
		int a = 0;
		double d = 0.0;
	}
	private void ooops() {
		int m = -1;
	}
	
	public int kkk() {
		return 3;
	}
}
