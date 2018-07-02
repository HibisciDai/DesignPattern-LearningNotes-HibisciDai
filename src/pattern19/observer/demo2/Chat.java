package pattern19.observer.demo2;

public class Chat implements INoStudier {
	String name;
	String state;

	public Chat(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		state = "good good study, day day up!";
		System.out.println(name + " : " + state);
	}
}