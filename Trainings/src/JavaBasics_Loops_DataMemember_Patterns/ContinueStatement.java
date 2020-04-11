package JavaBasics_Loops_DataMemember_Patterns;

public class ContinueStatement {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// using continue statement
				continue;// it will skip the rest statement
			}
			System.out.println(i);
		}
	}
//Output will be -5 is not printed on the console. It is because the loop is continued when it reaches to 5.

}
