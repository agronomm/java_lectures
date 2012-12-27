package oleg.lesson12;

public class Hrivna extends Money {
	private int value;

	public Hrivna() {
		super(1, "UAH");
	}

	public Hrivna(int rate) {
		super(rate, "UAH");
	}

	public void setValue(int value) {
		if (value == 20 || value == 50 || value == 100 || value == 200
				|| value == 500) {
			this.value = value;
		} else {
			System.out.println("Achtung!!!!!! - " + value + " - SCHEISSE");
		}

	}

	public int getValue() {
		return value;
	}

}
