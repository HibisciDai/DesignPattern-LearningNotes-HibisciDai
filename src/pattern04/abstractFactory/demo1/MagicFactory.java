package pattern04.abstractFactory.demo1;

public class MagicFactory implements AbstractFactory {
	@Override
	public IVehicle createVehicle() {
		return new Broom();
	}

	@Override
	public IWeapon createWeapon() {
		return new MagicStick();
	}
}