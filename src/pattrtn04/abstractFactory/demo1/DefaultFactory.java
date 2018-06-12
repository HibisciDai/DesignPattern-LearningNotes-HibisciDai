package pattrtn04.abstractFactory.demo1;

public class DefaultFactory implements AbstractFactory {
	@Override
	public IVehicle createVehicle() {
		return new Moto();
	}

	@Override
	public IWeapon createWeapon() {
		return new AK47();
	}
}