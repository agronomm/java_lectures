package agronomm.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(buff.readLine());
		String operation = buff.readLine();
		int b = Integer.parseInt(buff.readLine());
		
		Operation oper = null;
		if (operation.equals("+")) {
			oper = new Pluss();
		} else if (operation.equals("-")) {
			oper = new Minus();
		}
			
		
		
		oper.setA(a);
		oper.setB(b);
		
		System.out.println("Operation result = " + oper.doOperation());

	}

}
