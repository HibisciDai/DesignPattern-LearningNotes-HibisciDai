package pattrtn03.factory.demo2;

public class MyFactory implements Factory {

	@Override
	public Helper create(String helperType) {
		if (null == helperType) {
			return null;
		} else if (helperType.equalsIgnoreCase("SQLHelper")) {
			return new SQLHelper();
		} else if (helperType.equalsIgnoreCase("OracleHelper")) {
			return new OracleHelper();
		}
		return null;
	}
}