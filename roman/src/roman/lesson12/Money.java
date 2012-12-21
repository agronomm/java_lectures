package lesson12;

public abstract class Money {
	// ������
	protected String currency;
	// ����
	private int rate;

	public abstract void setValue(int value);

	public abstract int getValue();

	public Money(int rate, String currency) {
		this.rate = rate;
		this.currency = currency;
	}

	public String getCurrency() {
		return currency;
	}

	public int getRate() {
		return rate;
	}

}
