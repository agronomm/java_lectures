package roman.lesson11;

import com.sun.corba.se.spi.orb.Operation;

public class OperList {
	private Operation[] opers = new Operation[20];
private int i = 0;
	public void add(Operation operation) {
		for (int i = 0; i < opers.length; i++) {
			opers[i] = operation;
		}

	}
}
