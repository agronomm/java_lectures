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
		hrivna.setValue(100);
		koshelek.put(hrivna);
		
		

		System.out.print("������� ���� EUR=" + "1:" + euvro.getRate() + " ");
		System.out.print("USD=" + "1:" + dolar.getRate() + " ");
		System.out.println("UAH=" + "1:" + hrivna.getRate());
		System.out.println(koshelek.toString());
		System.out.println("����� � ������������ ������ " + koshelek.howMuch()
				+ " " + "UAH");

		System.out.println("������ ������� ������ � ������� = " + euvro);
		System.out.println("� ��� � �������� " + koshelek.howMuch() + " "
				+ "UAH");

		Money takenMoney = koshelek.get();
		System.out.println("������ ������ ��������� " + " " + takenMoney);
		System.out.println("�������� � �������� " + koshelek.howMuch() + " "
				+ "UAH");

		System.out.println("������������� ������" + " " + koshelek.look(2));
	}
}
