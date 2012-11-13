package agronomm.lesson4;
public class ForCycle2 {
	public static void main(String[] args) {
		int square;
		for (int loop = 1; loop <= 10; ++loop) {
			if (loop == 5) {
				continue;
			}

			square = loop * loop;
			System.out.println("Square" + loop + "is" + square);
		}

	}

}