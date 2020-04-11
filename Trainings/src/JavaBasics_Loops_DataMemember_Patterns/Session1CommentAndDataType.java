package JavaBasics_Loops_DataMemember_Patterns;

public class Session1CommentAndDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Single Line comment");

		/* System.out.println("Multiple Line comment"); */

		/**
		 * Documentation comment-
		 * @author Abhilash Pal This is documentation comment
		 */

		int x = 10;

		System.out.println(x++);// 10 (11)
		System.out.println(x++);// 10 (11)
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10

		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21

		boolean c = true;
		boolean d = false;
		System.out.println(~a);// -11 (minus of total positive value which starts from 0)
		System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true

	}

}
