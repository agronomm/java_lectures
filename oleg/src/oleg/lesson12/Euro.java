package oleg.lesson12;

public class Euro extends Money {

	private int value;

	public Euro() {
		super(10, "EUR");
	}

	public Euro(int rate) {
		super(rate, "EUR");
	}

	public void setValue(int value) {
		if (value == 5 || value == 10 || value == 20 || value == 50 
				|| value == 100 || value == 200 || value == 500) {
			this.value = value;
		} else {
			System.out.println("Achtung!!!!!! - " + value + " - SCHEISSE");
		}

	}

	public int getValue() {
		return value;
	}

}

