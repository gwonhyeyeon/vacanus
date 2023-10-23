package question4;

public class Main {
	
	public int factorialTail(int n, int total) {
		if (n == 1) return total;
		return factorialTail(n - 1, total*n); 
	}
	public int factorial(int n) {
		return factorialTail(n, 1);
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		int result = T.factorial(100000);
		System.out.println(result);

	}

}
