package agronomm.lesson08;

import agronomm.lesson08.subpackage.Stul;


public class TestOOP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mebel shkaf = new Mebel("shkaf", 2, 7);
		System.out.println(shkaf.opisanie());
		Stul stul = new Stul("shkaf", 2, 7);
		System.out.println(stul.opisanie());

	}
	


}
