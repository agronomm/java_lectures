import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvergeNumber {
	public static void main(String[] args) throws IOException {

		double[] array;
		array = new double[10];

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		String inputStr;
		int counter = 0;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
		counter++;
		System.out.print("Введите " + counter + " элемент массива");
		inputStr = bReader.readLine();
		array[counter] = Integer.parseInt(inputStr);
	}
}