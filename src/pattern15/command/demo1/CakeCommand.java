package pattern15.command.demo1;

public class CakeCommand extends Command {
	@Override
	void makeFood() {
		System.out.println("香喷喷-蛋糕");
	}
}