package pattrtn04.abstractFactory.demo2;

public class Main {
	public static void main(String[] args) {
		IAbstractFactory iAbstractFactory1 = new MVDFactory();
		iAbstractFactory1.createICON().show();
		iAbstractFactory1.createIProtocol().communication();

		IAbstractFactory iAbstractFactory2 = new IVDFactory();
		iAbstractFactory2.createICON().show();
		iAbstractFactory2.createIProtocol().communication();

		IAbstractFactory iAbstractFactory3 = new SVDFactory();
		iAbstractFactory3.createICON().show();
		iAbstractFactory3.createIProtocol().communication();
	}
}