
public class Pig_AnimalImplementation extends Animal {

	@Override
	public void animalSound() {
		System.out.println("Pig sounds");
	}

	public static void main(String[] args) {

		Pig_AnimalImplementation p = new Pig_AnimalImplementation();

		p.animalSound();

	}

}
