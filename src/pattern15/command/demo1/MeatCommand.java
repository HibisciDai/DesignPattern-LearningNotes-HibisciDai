package pattern15.command.demo1;

public class MeatCommand extends Command {
	@Override
	void makeFood() {
		System.out.println("吱吱吱-肉");
	}
}