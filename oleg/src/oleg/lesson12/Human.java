package oleg.lesson12;

public class Human {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Koshelek koshelek = new Koshelek (50);
		
		Money dolar = new Dolar ();
		dolar.setValue(5);
		koshelek.put(dolar);
		
		dolar = new Dolar ();
		dolar.setValue(30);
		koshelek.put(dolar); 
		dolar = new Dolar ();
		dolar.setValue(20);
		koshelek.put(dolar); 
		dolar = new Dolar ();
		dolar.setValue(10);
		koshelek.put(dolar); 
	
		Money hrivna = new Hrivna ();
		hrivna.setValue(10);
		koshelek.put(hrivna);
		hrivna = new Hrivna ();
		hrivna.setValue(100);
		koshelek.put(hrivna);
		hrivna = new Hrivna ();
		hrivna.setValue(50);
		koshelek.put(hrivna);
		hrivna = new Hrivna ();
		hrivna.setValue(500);
		koshelek.put(hrivna);
	
		Money euro = new Euro ();
		euro.setValue(50);
		koshelek.put(euro);
		euro = new Euro ();
		euro.setValue(100);
		koshelek.put(euro);	
		
		System.out.println(koshelek.toString());
		System.out.println("Итого сумма составляет" + koshelek.howMach() + "гривень");
	}

}
