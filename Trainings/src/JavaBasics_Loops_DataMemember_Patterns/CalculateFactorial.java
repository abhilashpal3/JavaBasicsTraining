
package JavaBasics_Loops_DataMemember_Patterns;

public class CalculateFactorial {
	public static void main(String[] args) {

		int fact = 1;
		int n = 7;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println(fact);
	}
}
