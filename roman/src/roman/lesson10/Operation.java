package roman.lesson10;

public abstract class Operation {
	protected double a;
	protected double b;

	public abstract double doOperation();

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;

	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
}