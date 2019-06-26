package d_Method_Return_Types_3;

public class MyClass {

	public static void main(String[] args) {
		
		int res = max(7, 42);
		System.out.println(res); 	// 42

	}
	
	
	static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
