import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class DoWhileCycle {
	public static void main(String[] args) throws IOException {
		double inputVar;
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String inputString;
		do {
			System.out.print("Input number (0= end program): ");
			inputString = t.readLine();
			inputVar = Integer.parseInt(inputString);
			System.out.println("Square" + inputVar + "is" + (inputVar * inputVar));
		} while (inputVar != 0);

	}

}