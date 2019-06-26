package a_Methods;

public class MyClass {
	
	static void sayhello() {
		System.out.println("Hello World!");
	}
	
	static void sayhello(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		
		sayhello();
		sayhello();
		sayhello();
		// Outputs "Hello World!"
		// Outputs "Hello World!"
		// Outputs "Hello World!"
		
		
		sayhello("David");
		sayhello("Amy");
		// Outputs "Hello David"
		// Outputs "Hello Amy"
	}

}
