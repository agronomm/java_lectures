
public class DefClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] massiv = new int[10];
		//for (int i = 0, j = 1; i < 10; i++, j++) {
		//	massiv[i] = j;
		//}
		//int sum = calculateArraySumm(massiv);dfadfasfd
		//System.out.println("sum = " + sum);
		System.out.println(calculate(1, 2));
		System.out.println(calculate(2, 2));
		System.out.println(calculate(3, 2));
		System.out.println(calculate(3, 3));
		System.out.println(calculate(1, 1));
		System.out.println(calculate(1, 5));
		System.out.println(calculate(7, 2));
		System.out.println(calculate(2, 2));
		//printIntArray(massiv);
	}

	
	public static int calculate(int a, int b) {
		int result;
		if (a != b) {
			result = a + b;
		} else {
			result = a * b;
		}
		return result;
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
