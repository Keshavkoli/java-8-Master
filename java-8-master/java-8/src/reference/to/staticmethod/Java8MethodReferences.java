package reference.to.staticmethod;

import java.util.function.Function;

public class Java8MethodReferences {
	public static void main(String[] args) {

		// converting string to integer
		Function<String, Integer> student = (String s) -> Integer.parseInt(s);
		System.out.println(student.apply("keshav"));
	}

}
