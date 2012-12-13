package roman.lesson7;

import roman.util.Print;

public class Testprint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[15];
		for (int i = 0, j = 1; i < array.length; i++, j++) {
			array[i] = j;
		}
		Print.printarray(array);
		
	}

}
