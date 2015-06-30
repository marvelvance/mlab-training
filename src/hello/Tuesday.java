package hello;

public class Tuesday {

	public static void mainrt(String[] args) {
		
		printSomething("Hello World!");
		computeSum(4, 7);
	}
	
	public static void printSomething(String text){
		System.out.println("Hello, World!");

	}
	
	public static void computeSum(int num1, int num2){
		int sum = num1 + num2;
		
		System.out.println("The Sum is: " + sum);
	}

}
