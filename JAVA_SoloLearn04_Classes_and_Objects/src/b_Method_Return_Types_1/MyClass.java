package b_Method_Return_Types_1;

public class MyClass {
	
	static int sum (int val1, int val2) {
		return val1 + val2;
	}
	

	public static void main(String[] args) {
		
		int x = sum(2, 5);
		System.out.println(x);
		// Outputs "7"
	
	}

}
