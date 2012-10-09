public class IfOlegSenjor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] massiv = new int[10];
		for (int i = 0, j = 1; i < 10; i++, j++) {
			massiv[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < massiv.length; i++) {
			if (i != 7) {
				sum += massiv[i];
			}
		}
		System.out.println("sum=" + sum);
	}
}