package agronomm.lesson5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IfTrain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age:");
		
		String age = buff.readLine();
		buff.readLine();
		buff.readLine();
		int intAge = Integer.parseInt(age);
		if (intAge < 18 || intAge > 60) {
			System.out.println("go to bad");
		} else {
			System.out.println("Welcome to porno tube");
		} 

	}

}
