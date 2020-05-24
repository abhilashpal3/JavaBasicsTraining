package Oops;

public class WrapperClassSamples {

	public static void main(String[] args) {
		String x = "3";
		int a = Integer.parseInt(x); // To convert into string from String
		double b = Double.parseDouble(x); // To convert into double from String
		System.out.println("Integer val=" + a + "/ Double val=" + b);

		// To convert String into Boolean

		String v = "true";

		boolean d = Boolean.parseBoolean(v);
		System.out.println("boolean result = " + d);

		// To convert integer to string

		int i = 7;

		String i1 = String.valueOf(i);
		System.out.println("String converted value" + i1);
	}
}
