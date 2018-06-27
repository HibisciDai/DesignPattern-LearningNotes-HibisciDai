package pattern16.interprter.demo1;

import java.util.Hashtable;

public class NumberNotation extends NotationInterpreter {
	Hashtable<String, String> nns = new Hashtable<String, String>();

	NumberNotation() {
		nns.put("1", "do");
		nns.put("2", "re");
		nns.put("3", "mi");
		nns.put("4", "fa");
		nns.put("5", "sol");
		nns.put("6", "la");
		nns.put("7", "xi");
	}

	@Override
	void Interpreter(Context context) {
		String s = context.myNumNotation;
		for (int i = 0; i < s.length(); i++) {
			String subs = s.substring(i, i + 1);
			String r = nns.get(subs).toString();
			System.out.println(r);
			System.out.println("");
		}
	}
}