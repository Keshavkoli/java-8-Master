package lambda.expression.examplewith.or.with.out.returnkeyword;

public class LambdaExpressionExample6 {
	public static void main(String[] args) {
		// Lambda expression without return keyword.
		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));
		System.out.println("--------div--------");
		// Lambda expression with return keyword.
		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));
	}
}
