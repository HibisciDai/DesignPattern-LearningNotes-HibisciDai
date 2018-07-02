package pattern19.observer.demo2;

import java.util.ArrayList;

public class BroodCast implements INotifier {
	ArrayList<INoStudier> nss = new ArrayList<INoStudier>();
	String listenState;

	BroodCast() {
		super();
		add(new Chat("flower"));
		add(new Chat("stone"));
		add(new Chat("grosss"));
	}

	public void setListenState(String listenState) {
		this.listenState = listenState;
	}

	@Override
	public void notifyed() {
		System.out.println("BroadCast : " + listenState);
		for (INoStudier c : nss) {
			c.update();
		}
	}

	@Override
	public void add(INoStudier ns) {
		nss.add(ns);
	}

	@Override
	public void remove(INoStudier ns) {
		nss.remove(ns);
	}
}