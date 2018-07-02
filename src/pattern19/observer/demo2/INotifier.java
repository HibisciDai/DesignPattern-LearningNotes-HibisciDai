package pattern19.observer.demo2;

public interface INotifier {
	void notifyed();

	void add(INoStudier ns);

	void remove(INoStudier ns);
}