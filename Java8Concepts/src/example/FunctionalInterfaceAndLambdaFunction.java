package example;

@FunctionalInterface
interface A{
	void show();
}

public class FunctionalInterfaceAndLambdaFunction {

	public static void main(String[] args) {
		A obj = ()-> System.out.println("Hi, inside print!"); //-> is the lambda function
		obj.show();

	}

}
