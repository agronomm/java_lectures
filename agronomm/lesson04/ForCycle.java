import java.io.IOException;

public class ForCycle {
	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 10; i++) {
			System.out.print("Input number (0= end program): ");
			System.out.println("Square" + i + "is" + (i * i));
		}

	}

}