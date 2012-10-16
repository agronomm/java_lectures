
public class ArrayAndFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String bla_bla = "a";
		String [] massiv = new String[4];
		massiv[0] = bla_bla;
		massiv[1] = "b";
		massiv[2] = "c";
		massiv[3] = "d";
		int [] massivIntov = new int[10];
		massivIntov[0] = 1;
		massivIntov[1] = 2;
		massivIntov[2] = 3;
		massivIntov[3] = 4;
		massivIntov[4] = 5;
		massivIntov[5] = 6;
		massivIntov[6] = 7;
		massivIntov[7] = 8;
		massivIntov[8] = 9;
		massivIntov[9] = 10;
		
		for (int i = 0; i < 10; i++) {
			massivIntov[i] = i + 1;
		}
		
		

	}

}
