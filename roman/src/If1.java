import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class If1 {
public static void main(String[] args) throws IOException {
	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your age pleaze");
	String age = buff.readLine();
	int intAge  = Integer.parseInt(age);
	if (intAge < 18 || intAge > 60) {
	System.out.println("Go to bad");
	} else {
		System.out.println("Welcome");
	}
	
	}
}
