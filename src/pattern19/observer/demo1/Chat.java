package pattern19.observer.demo1;

public class Chat {
	String name;
	String state;

	public Chat(String name) {
		super();
		this.name = name;
	}

	public void update() {
		state = "good good study, day day up!";
		System.out.println(name + " : " + state);
	}
}