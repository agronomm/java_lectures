package oleg.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));
		int a = Integer.parseInt(buff.readLine());
		String operation = buff.readLine();
		int b = Integer.parseInt(buff.readLine());
		
		Operation oper = null;
		if (operation.equals("+")) {
			oper = new Plus();
		} else if (operation.equals("-")) {
			oper = new Minus();
		} else if (operation.equals("*")) {
			oper = new Multiply();
		} else if (operation.equals("/")) {
			oper = new Divide2();
		} else if (operation.equals("%")) {
			oper = new Ostatok();
		}
		oper.setA(a);
		oper.setB(b);
		System.out.println("Operation result = " + oper.doOperation());
	}
}
