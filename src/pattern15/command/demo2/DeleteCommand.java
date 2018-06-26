package pattern15.command.demo2;

public class DeleteCommand extends Command {
	@Override
	void execute() {
		System.out.println("删除");
	}
}