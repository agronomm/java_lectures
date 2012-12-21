package lesson12;

public class Human2 {
	public static void main(String[] args) {
		Koshelek koshelek = new Koshelek(15);
<<<<<<< HEAD
=======
        Koshelek koshelek2 = koshelek;
        Koshelek koshelek3 = new Koshelek(12);


        Hrivna hrivna = new Hrivna();
        hrivna.setValue(5);

        Integer anyThing = new Integer(3);

        Hrivna hrivna2 = new Hrivna();
        hrivna.setValue(50);
        koshelek.put(hrivna2);

>>>>>>> 46560e2644aec10606ff38558e224ed0cfe46502

		Money euvro = new Euvro();
		euvro.setValue(100);
		koshelek.put(euvro);
<<<<<<< HEAD
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
		System.out.println("Итого " + koshelek.howMuch() + " "
				+ "UAH");
=======
        euvro = new Euvro();
		euvro.setValue(50);
		koshelek.put(euvro);
        System.out.println("Деньга которую кладем в кошелек = " + euvro);
        System.out.println("У вас в кошельке " + koshelek.howMuch() + " " + "UAH");
        Money takenMoney = koshelek.get();
        System.out.println("Взятая деньга = " + takenMoney);
		System.out.println("У вас в кошельке " + koshelek.howMuch() + " " + "UAH");
>>>>>>> 46560e2644aec10606ff38558e224ed0cfe46502

	}
}
