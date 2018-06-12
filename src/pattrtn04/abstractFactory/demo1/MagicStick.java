package pattrtn04.abstractFactory.demo1;

public class MagicStick implements IWeapon {
	@Override
	public void attack() {
		System.out.println("MagicStick-attack");
	}
}