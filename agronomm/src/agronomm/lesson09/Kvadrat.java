package agronomm.lesson09;
import java.lang.Math;

public class Kvadrat extends Chislo {

	public void setChislo(int a) {
		if (a > 10) {
			System.out.println("����� ������� �������");
			return;
		}
		chislo = a*a;
	}
}
