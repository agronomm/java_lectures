package roman.lesson9;
import java.lang.Math;
public class Kvadrat extends Chislo {
	public String toString() {
		return "Value = " + chislo * chislo + "";
	}

	public void setChislo(int a) {
		if (a > 10) {
			System.out.println("Число слишком большое");
			return;
		}
		super.setChislo(a);
	}

	public int getChislo() {
		return chislo * chislo;
	}
}
