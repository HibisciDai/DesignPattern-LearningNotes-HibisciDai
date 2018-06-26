package pattern15.command.demo1;

public class Main {
	public static void main(String[] args) {
		Waiter w = new Waiter();

		Command m1 = new MeatCommand();
		Command m2 = new MeatCommand();
		Command m3 = new MeatCommand();
		Command c1 = new CakeCommand();

		w.addCommand(m1);
		w.addCommand(m2);
		w.addCommand(m3);
		w.addCommand(c1);

		w.delete(m3);

		w.notifyed();
	}
}