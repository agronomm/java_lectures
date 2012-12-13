package roman.lesson12;

public class Human2 {
	public static void main(String[] args) {
		Koshelek koshelek = new Koshelek(15);

		Money dolar = new Dolar();
		dolar.setValue(5);
		koshelek.put(dolar);
		dolar = new Dolar();
		dolar.setValue(50);
		koshelek.put(dolar);
		dolar = new Dolar();
		dolar.setValue(20);
		koshelek.put(dolar);
		dolar = new Dolar();
		dolar.setValue(10);
		koshelek.put(dolar);

		Money hrivna = new Hrivna();
		hrivna.setValue(50);
		koshelek.put(hrivna);
		hrivna = new Hrivna();
		hrivna.setValue(100);
		koshelek.put(hrivna);
		hrivna = new Hrivna();
		hrivna.setValue(20);
		koshelek.put(hrivna);

		Money euvro = new Euvro();
		euvro.setValue(100);
		koshelek.put(euvro);
		euvro = new Euvro();
		euvro.setValue(10);
		koshelek.put(euvro);
		euvro = new Euvro();
		euvro.setValue(20);
		koshelek.put(euvro);
		euvro = new Euvro();
		euvro.setValue(50);
		koshelek.put(euvro);

		System.out.println(koshelek.toString());
		System.out.println("У вас в кошельке " + koshelek.howMuch() + " " + "UAH");

	}
}
