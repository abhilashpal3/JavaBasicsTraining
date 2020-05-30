
public class ServiceProviderForInterif implements InterfSample {

	@Override
	public void m1() {
		System.out.println("Implementation used ");
	}

	@Override
	public void m2() {
		System.out.println("Implementation for m2");
	}

	public static void main(String[] args) {
		ServiceProviderForInterif sf = new ServiceProviderForInterif();
		sf.m1();
		sf.m2();

		System.out.println(sf.getClass().getName());
	}

}
