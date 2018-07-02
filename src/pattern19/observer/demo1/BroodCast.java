package pattern19.observer.demo1;

import java.util.ArrayList;

public class BroodCast {
	ArrayList<Chat> chats = new ArrayList<Chat>();
	String listenState;

	BroodCast() {
		super();
		add(new Chat("flower"));
		add(new Chat("stone"));
		add(new Chat("grosss"));
	}

	void add(Chat c) {
		chats.add(c);
	}

	public void setListenState(String listenState) {
		this.listenState = listenState;
	}

	void notifyed() {
		System.out.println("BroadCast : " + listenState);
		for (Chat c : chats) {
			c.update();
		}
	}
}