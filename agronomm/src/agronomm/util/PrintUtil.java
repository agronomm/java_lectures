package agronomm.util;

public class PrintUtil {
	
	public static void printIntArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			print("element[" + i + "]", array[i]);
		}
	}
	
	public static void printStringArray(String [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("element[" + i + "] = " + array[i]);
		}
	}
	
	public static void print(String name, int var) {
		System.out.println(name + " = " + var);
	} 
}
