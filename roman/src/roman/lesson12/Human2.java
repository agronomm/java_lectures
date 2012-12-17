package roman.lesson12;

public class Human2 {
	public static void main(String[] args) {
		Koshelek koshelek = new Koshelek(15);
        Koshelek koshelek2 = koshelek;
        Koshelek koshelek3 = new Koshelek(12);


        Hrivna hrivna = new Hrivna();
        hrivna.setValue(5);

        Integer anyThing = new Integer(3);

        Hrivna hrivna2 = new Hrivna();
        hrivna.setValue(50);
        koshelek.put(hrivna2);


		Money euvro = new Euvro();
		euvro.setValue(100);
		koshelek.put(euvro);
        euvro = new Euvro();
		euvro.setValue(50);
		koshelek.put(euvro);
        System.out.println("Деньга которую кладем в кошелек = " + euvro);
        System.out.println("У вас в кошельке " + koshelek.howMuch() + " " + "UAH");
        Money takenMoney = koshelek.get();
        System.out.println("Взятая деньга = " + takenMoney);
		System.out.println("У вас в кошельке " + koshelek.howMuch() + " " + "UAH");

	}
}
