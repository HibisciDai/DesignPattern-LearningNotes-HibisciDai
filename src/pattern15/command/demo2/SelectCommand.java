package pattern15.command.demo2;

public class SelectCommand extends Command {
	@Override
	void execute() {
		System.out.println("查询");
	}
}