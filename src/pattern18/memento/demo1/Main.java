package pattern18.memento.demo1;

public class Main {
	public static void main(String[] args) {
		Boy boy = new Boy(); // first boy
		boy.myState = "super!!";
		CareTaker c = new CareTaker(boy.createMemento());// make memories
		boy.myState = "terrible!!";
		boy.restoreMemento(c.getMemento());
		System.out.println(boy.myState);
	}
}