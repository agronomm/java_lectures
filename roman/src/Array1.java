public class Array1 {
	public static void main(String[] args) {
		int[] array = new int[10];
		;
		for (int i = 0, j = 1; i < 10; i++, j++) {
			array[i] = j;
		}
		int summ = 0;
		for (int i = 0; i < array.length; i++) {
			if (i != 5) {
				summ += array[i];
			}
		}
		System.out.println("summ" + summ);
	}

}
