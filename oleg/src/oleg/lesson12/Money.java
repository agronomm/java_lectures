package oleg.lesson12;

public abstract class Money {
	public String currensy;
	public int rate;

	public void setValue(int value) {
		value = 0;
	}

	public int getValue() {
		return 0;
	}

	public Money(int rate, String currensy) {
		this.rate = rate;
		this.currensy = currensy;
	}

	public String getCurrensy() {
		return currensy;
	}

	public int getRate() {
		return rate;
	}
}
