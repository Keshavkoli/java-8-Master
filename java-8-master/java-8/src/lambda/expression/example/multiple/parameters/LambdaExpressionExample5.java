package lambda.expression.example.multiple.parameters;

public class LambdaExpressionExample5 {
	public static void main(String[] args) {
		// Multiple parameters in lambda expression
		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));
		System.out.println("--------div--------");
		// Multiple parameters with data type in lambda expression
		Addable ad2 = (int a, int b) -> (a + b);
		System.out.println(ad2.add(100, 200));
	}
}
