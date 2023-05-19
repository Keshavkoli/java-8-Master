package reference.to.staticmethod;

//You can refer to static method defined in the class. 
//Following is the syntax and example which describe the process of referring static method in Java
public class MethodReference {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		// syntax ContainingClass::staticMethodName
		Sayable sayable = MethodReference::saySomething;
		// Calling interface method
		sayable.say();
	}
}
