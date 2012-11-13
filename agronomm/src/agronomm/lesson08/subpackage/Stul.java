package agronomm.lesson08.subpackage;

import agronomm.lesson08.Mebel;


public class Stul extends Mebel {
	public int age;

	public Stul(String type) {
		tip = "stul";
	}
	
	public Stul(String type, int w, int h) {
		super(type, w, h);
	}
	
	public int size() {
		return width * heigt;
	}

}
