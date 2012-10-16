
public class DefClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] massiv = new int[10];
		for (int i = 0, j = 1; i < 10; i++, j++) {
			massiv[i] = j;
		}
		int sum = calculateArraySumm(massiv);
		System.out.println("sum = " + sum);
		
		printIntArray(massiv);
	}

	public static int calculateArraySumm(int [] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (i != 7) {
				result += array[i];
			}
		}
		return result; 
	}
	
	public static void printIntArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("element[" + i + "] = " + array[i]);
		}
	}
	
	public static void printStringArray(String [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("element[" + i + "] = " + array[i]);
		}
	}

}
