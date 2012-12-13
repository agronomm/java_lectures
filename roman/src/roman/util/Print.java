package roman.util;

public class Print {

	public static void printarray(int[] masiv) {
		for (int i = 0; i < masiv.length; i++) {
			System.out.println(masiv[i]);
		}
	}

	public static void print(String name, int var) {
		System.out.println(name + " = " + var);
	}

	public static void print(String var) {
		System.out.println(var);
	}

	public static void print(int var) {
		System.out.println(var);
	}
}
