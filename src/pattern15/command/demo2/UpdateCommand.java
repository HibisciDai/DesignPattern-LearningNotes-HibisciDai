package pattern15.command.demo2;

public class UpdateCommand extends Command {
	@Override
	void execute() {
		System.out.println("更新");
	}
}