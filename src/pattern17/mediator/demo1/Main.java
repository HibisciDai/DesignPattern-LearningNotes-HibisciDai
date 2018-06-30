package pattern17.mediator.demo1;

public class Main {
	public static void main(String[] args) {
		Sky s = new Sky();
		s.sunny();
		Sea h = new Sea();
		h.flood();
		LifeForm l = new LifeForm();
		l.dieOut();
	}
}