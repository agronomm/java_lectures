import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BreakDemo{
	public static void main (String [] args) throws IOException
	{
		double inputVar = 1;
		String inputString;

		BufferedReader t = new BufferedReader (new InputStreamReader(System.in));
		while (true)
{
			System.out.print("Input number (0= end program): ");
			inputString = t.readLine();
			inputVar = Integer.parseInt(inputString);
			if (inputVar == 0) {
				break;
			}
			System.out.println("Square" + inputVar + "is" + (inputVar * inputVar));
		}

	}

}