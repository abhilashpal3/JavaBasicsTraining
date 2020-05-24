package Oops;

public class StaticvsNon_static {

	String name = "Abhilash"; // Non-Static

	String School = "KV"; // Static

	public void sum() {
		System.out.println("Sum method called - Non Static");
	}

	public static void sum1() {
		System.out.println("Sum method called - Static");
	}

	public static void main(String[] args) {

		StaticvsNon_static.sum1();

		StaticvsNon_static s1 = new StaticvsNon_static();
		s1.sum();
	}
}
