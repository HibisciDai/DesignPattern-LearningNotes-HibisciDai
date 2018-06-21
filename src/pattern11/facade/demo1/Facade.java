package pattern11.facade.demo1;

public class Facade {
	NingLi nl = new NingLi();
	XiaoBai xb = new XiaoBai();
	Doraemon dn = new Doraemon();
	SuperMan sm = new SuperMan();
	Other o = new Other();

	void DrawMoney() {
		nl.fetchAndCarry();
		sm.protect();
		dn.account();
		o.other();
	}

	void installSoftWare() {
		xb.install();
		dn.account();
	}
}