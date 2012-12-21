package roman.lesson12;

public class Human2 {
	public static void main(String[] args) {
		Koshelek koshelek = new Koshelek(15);

		Money euvro = new Euvro();
		euvro.setValue(100);
		koshelek.put(euvro);
		euvro = new Euvro();
		euvro.setValue(50);
		koshelek.put(euvro);

		Money dolar = new Dolar();
		dolar.setValue(20);
		koshelek.put(dolar);
		dolar = new Dolar();
		dolar.setValue(50);
		koshelek.put(dolar);

		Money hrivna = new Hrivna();
		hrivna.setValue(200);
		koshelek.put(hrivna);
		hrivna = new Hrivna();
		hrivna.setValue(50);
		koshelek.put(hrivna);
		
		System.out.println(koshelek.toString());
		System.out.println("Итого " + koshelek.howMuch() + " " + "UAH");
		euvro = new Euvro();
		euvro.setValue(50);
		koshelek.put(euvro);
		System.out.println("Деньга которую кладем в кошелек = " + euvro);
		System.out.println("У вас в кошельке " + koshelek.howMuch() + " "
				+ "UAH");
		Money takenMoney = koshelek.get();
		System.out.println("Взятая деньга = " + takenMoney);
		System.out.println("У вас в кошельке " + koshelek.howMuch() + " "
				+ "UAH");

	}
}
