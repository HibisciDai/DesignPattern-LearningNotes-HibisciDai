package pattern01.principle.demo2.caranddriver.after;

public class Driver implements IDriver {
	@Override
	public void driver(ICar car) {
		car.run();
	}
}