package Oops;

public class MethodOverloadingSample {

	void sum(int a, int b) {
		System.out.println(a + b);

		System.out.println("m1 Executed");

	}

	void sum(double a, double b) {
		System.out.println(a + b);

		System.out.println("m2 Executed");

	}

	public static void main(String[] args) {

		MethodOverloadingSample mo = new MethodOverloadingSample();

		mo.sum(9.12, 3.44);

	}
}
