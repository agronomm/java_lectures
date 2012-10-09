public class Array1 {
	public static void main(String[] args) {
		int[] namber;
		namber = new int[45];
		for (int counter = 0; counter < 101; counter++) {
			namber[counter] = 10 + counter * 2;
		}
			for (int i = 0; i < namber.length; i++) {
				System.out.println(namber[i]);
			}
		}
	}
