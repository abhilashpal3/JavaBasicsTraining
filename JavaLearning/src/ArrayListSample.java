import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ArrayListSample {
	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		int size = cars.size();

		
		System.out.println(size);
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
	}

}
