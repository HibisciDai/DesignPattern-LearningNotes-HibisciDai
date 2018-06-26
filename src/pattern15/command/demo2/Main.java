package pattern15.command.demo2;

public class Main {
	public static void main(String[] args) {
		DBCommands cmds = new DBCommands();

		InsertCommand ic = new InsertCommand();
		DeleteCommand dc = new DeleteCommand();
		UpdateCommand uc = new UpdateCommand();
		SelectCommand sc = new SelectCommand();

		cmds.addCommand(ic);
		cmds.addCommand(dc);
		cmds.addCommand(uc);
		cmds.addCommand(sc);

		cmds.notifyed();
	}
}