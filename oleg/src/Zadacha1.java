import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadacha1 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int j = 0;
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("�������� ���������� ��� ��� ���(365 ��� 366 ����)");
		String god = buff.readLine();
		int god1 = Integer.parseInt(god);
		if (god1 == 365 || god1 == 366) {
			god1 = j;
		} 
		else {
			System.out.println("� ������� 366 ��� 365");
		}
		int[] massiv1 = new int[j];
		for (int i = 0; i < j; i++) {
			massiv1[i] = i + 1;
		}
		int sum = 0;
		for (int i = 1; i < j; i++) {
			if (i % 6 != 0 || i % 7 != 0) {
				sum += massiv1[i];
			}
		}
			System.out.println("����� ������� ���� ����� " + sum);
	}
}
