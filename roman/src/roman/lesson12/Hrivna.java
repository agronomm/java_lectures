package roman.lesson12;

public class Hrivna extends Money {
	private int value;

	public Hrivna() {
		super(1, "UAH");
	}

	public Hrivna(int rate) {
		super(rate, "UAH");
	}

	@Override
	public void setValue(int value) {
		if (value == 20 || value == 50 || value == 100 || value == 200
				|| value == 500) {
			this.value = value;
		} else {
			System.out.println("Купюра отсутствует номеналом" + " " + value + " "
					+ "выберите новую или нажмите выход");
		}
	}

	@Override
	public int getValue() {
		return value;
	}
}
