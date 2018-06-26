package pattern15.command.demo2;

public class InsertCommand extends Command {
	@Override
	void execute() {
		System.out.println("插入");
	}
}