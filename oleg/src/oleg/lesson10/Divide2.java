package oleg.lesson10;

public class Divide2 extends Operation {

	@Override
	public double doOperation() {
		return (a - (a % b)) / b ;
	}

}
