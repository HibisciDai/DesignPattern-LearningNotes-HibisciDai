package pattern04.abstractFactory.demo1;

public class Main {
	public static void main(String[] args) {
		AbstractFactory myAbstractFactory = new DefaultFactory();
		myAbstractFactory.createVehicle().run();
		myAbstractFactory.createWeapon().attack();

		AbstractFactory myAbstractFactory2 = new MagicFactory();
		myAbstractFactory2.createVehicle().run();
		myAbstractFactory2.createWeapon().attack();
	}
}