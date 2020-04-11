package JavaBasics_Loops_DataMemember_Patterns;
public class NestedForLoop {
	public static void main(String[] args) {
//loop of i  
		for (int i = 1; i <= 3; i++) {
//loop of j  

			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			//	break;  --To stop this loop only.
			} // end of i
		} // end of j
	}
}