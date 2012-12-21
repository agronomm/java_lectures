package lesson12;

public class Dolar extends Money {
	private int value;

	public Dolar() {
		super(8, "USD");
	}

	public Dolar(int rate) {
		super(rate, "USD");
	}

	@Override
	public void setValue(int value) {
		if (value == 1 || value == 2 || value == 5 || value == 10
				|| value == 20 || value == 50 || value == 100) {
			this.value = value;
		} else {
			System.out.println("Купюра отсутствует номеналом" +" " + value
					+ "  " + "выберите новую или нажмите выход");
		}
	}

	@Override
	public int getValue() {
		return value;
	}
}
