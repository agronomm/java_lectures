public class Les_910 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOleg = new int[14];
		for (int i = 30, j = 0; i > 4; i = i - 2, j++) {
			arrayOleg[j] = i;
		}
		for (int i = 0; i < 14; i++) {
			System.out.println(arrayOleg[i]);
		}
	}

}
