package roman.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testclass {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("gfgfgfg");
		int a = Integer.parseInt(buff.readLine());
		String operation = buff.readLine();
		int b = Integer.parseInt(buff.readLine());

		Operation oper = null;
		if (operation.equals("+")) {
			oper = new Pluss();
		} else if (operation.equals("-")) {
			oper = new Minus();
		} else if (operation.equals("*")) {
			oper = new Multi();
		} else if (operation.equals("/")) {
			oper = new Division();
		}
		
		oper.setA(a);
		oper.setB(b);

		System.out.println("Result " + oper.doOperation());

	}

}