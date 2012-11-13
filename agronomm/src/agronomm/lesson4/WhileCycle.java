package agronomm.lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileCycle {
	public static void main(String[] args) throws IOException {
		double inputVar = 1;
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String inputString;
		while (inputVar != 0) {
			System.out.print("Input number (0= end program): ");
			inputString = t.readLine();
			inputVar = Integer.parseInt(inputString);
			System.out.println("Square" + inputVar + "is" + (inputVar * inputVar));
		}

	}

}