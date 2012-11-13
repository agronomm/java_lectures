package agronomm.lesson08;

public class Mebel {
	
	
	
	public Mebel() {
		tip = "unknown";
		width = 0;
		heigt = 0;
		System.out.println("Mebel was created");
	}
	
	public Mebel(String type) {
		this();
		this.tip = type;
	}
	
	public Mebel(String type, int w, int h) {
		this(type);
		width = w * 100;
		heigt = h * 100;
	}
	
	
	
	public String opisanie() {
		return "eto prosto mebel tipa - " + tip;
	}
	
	protected String tip;
	protected int width;
	protected int heigt;

}
