import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		array = new int[10];
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String inputStr;
		int tem;

		array [0] = tem;

		for (int elem=0; elem<10; ++elem)
		{
		System.out.print("¬ведите элементы массива");
		tem = Integer.parseInt(buf.readLine());
		array [elem] = tem;
	}
	
	}
}
