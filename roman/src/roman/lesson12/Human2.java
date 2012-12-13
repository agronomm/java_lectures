package roman.lesson12;

public class Human2 {
	public static void main(String[] args) {
		Koshelek koshelek = new Koshelek(15);
        Koshelek koshelek2 = koshelek;
        Koshelek koshelek3 = new Koshelek(12);




		Money euvro = new Euvro();
		euvro.setValue(100);
		koshelek.put(euvro);

		System.out.println(koshelek.toString());
		System.out.println("У вас в кошельке " + koshelek.howMuch() + " " + "UAH");

	}
}
