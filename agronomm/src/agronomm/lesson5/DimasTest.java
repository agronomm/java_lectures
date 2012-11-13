package agronomm.lesson5;
public class DimasTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0, j = 1; i < 10; i++, j++) {
			array[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			if (i != 9) {
				sum += array[i];
			}
		System.out.println("sum = " + sum);
	}
}
