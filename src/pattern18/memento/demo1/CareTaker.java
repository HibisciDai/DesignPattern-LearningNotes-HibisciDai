package pattern18.memento.demo1;

public class CareTaker {
	Memento memento;

	public CareTaker(Memento memento) {
		super();
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}