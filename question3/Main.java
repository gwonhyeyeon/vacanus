package question3;

public class Main {

	public int factorial(int n) {
		if(n==1) return 1;
		else return n*factorial(n-1);	
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		int result = T.factorial(4);
		System.out.println(result);

	}

}
