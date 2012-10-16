import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
	/**
	 * @param args
	 * @throws NumberFormatException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException{
		print("result", calc());
	}
	

	public static int calc() throws NumberFormatException, IOException {
		int first = readLine();
		int second = readLine();
		return first + second;
	}
	
	public static void print(String name, int something) {
		System.out.println(name + " = " + something);
	}
	
	public static int readLine() throws NumberFormatException, IOException {
		System.out.println("¬ведите число:");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int result = Integer.parseInt(buff.readLine());
		return result;
	}
}