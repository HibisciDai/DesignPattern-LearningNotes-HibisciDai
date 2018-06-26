package pattern15.command.demo2;

import java.util.ArrayList;

public class DBCommands {
	ArrayList<Command> cmds = new ArrayList<Command>();

	void addCommand(Command c) {
		cmds.add(c);
	}

	void delete(Command c) {
		cmds.remove(c);
	}

	void notifyed() {
		for (Command c : cmds) {
			c.execute();
		}
	}
}