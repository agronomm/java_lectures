public class leson4 {
	public static void main(String[] args) {
		int[] namber;
		namber = new int[10];
		for (int counter = 0; counter < 10; counter++) {
			namber[counter] = counter;
		}
		int summ = 0;
		for (int counter = 0; counter < namber.length; counter++) {
			summ = summ + namber[counter];
		}
		System.out.println("summ = " + summ);
	}
}
