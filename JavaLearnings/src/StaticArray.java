import java.util.Iterator;

public class StaticArray {

	public static void main(String[] args) {
//---------------------------------1 D Array----------------------------------------------
		// Static Array, 1Dim Array--Fixed size
		// Same types of data in array
		int a[] = new int[4];

		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;

		System.out.println(a[2] + a[3]);

//Object Array - To over come issue of same type of data.

		Object obj[] = new Object[8];

//		---------------------------------2 Array----------------------------------------------
		String x[][] = new String[3][5];

		System.out.println("Final -" + x.length); // Total no of rows

		System.out.println("Final -" + x[0].length); // Total no of columns

		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		x[1][0] = "F";
		x[1][2] = "G";
		x[1][3] = "H";
		x[1][4] = "I";

//		System.out.println(x[1][2]);

		// Print all the values of array

		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[0].length; column++) {
				System.out.println(x[row][column]);
			}
		}

	}
}