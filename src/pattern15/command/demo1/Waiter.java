package pattern15.command.demo1;

import java.util.ArrayList;

public class Waiter {
	ArrayList<Command> cmds = new ArrayList<Command>();

	void addCommand(Command c) {
		cmds.add(c);
	}

	void delete(Command c) {
		cmds.remove(c);
	}

	void notifyed() {
		for (Command c : cmds) {
			c.makeFood();
		}
	}
}