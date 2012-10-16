import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetodInteresen {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("¬веdите два числа");
		String j = buff.readLine();
		int j1 = Integer.parseInt(j);
		String i = buff.readLine();
		int i1 = Integer.parseInt(i);
		int sum = otnimaemChisla(j1, i1);
		System.out.println("одно минус другое = " + sum);
	}

	public static int otnimaemChisla(int i1, int j1) {
		int sum = 0;
		sum = i1 - j1;
		return sum;
	}
}
