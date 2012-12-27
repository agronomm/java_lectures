package oleg.lesson12;

public class Dolar extends Money {

	private int value;

	public Dolar() {
		super(8, "USD");
	}

	public Dolar(int rate) {
		super(rate, "USD");
	}

	public void setValue(int value) {
		if (value == 1 || value == 5 || value == 10 || value == 20
				|| value == 100) {
			this.value = value;
		} else {
			System.out.println("Achtung!!!!!! - " + value + " - SCHEISSE");
		}

	}

	public int getValue() {
		return value;
	}

}
