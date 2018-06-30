package pattern18.memento.demo1;

public class Boy {
	String myState;

	Memento createMemento() {
		return new Memento(myState);
	}

	void restoreMemento(Memento memento) {
		myState = memento.myState;
	}
}