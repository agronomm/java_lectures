package roman.lesson12;

public class Euvro extends Money {
	private int value;

	public Euvro() {
		super(10, "EUR");
	}

	public Euvro(int rate) {
		super(rate, "EUR");
	}

	@Override
	public void setValue(int value) {
		if (value == 1 || value == 2 || value == 5 || value == 10
				|| value == 20 || value == 50 || value == 100) {
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
