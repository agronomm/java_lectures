package agronomm.lesson11.ht;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 29.11.12
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 */
public class Human {

    public static void main(String[] args) {
        Koshelek koshelek = new Koshelek(10);

        Money dolar = new Dolar();
        dolar.setValue(5);
        koshelek.put(dolar); dolar = new Dolar();
        dolar.setValue(30);
        koshelek.put(dolar); dolar = new Dolar();
        dolar.setValue(20);
        koshelek.put(dolar); dolar = new Dolar();
        dolar.setValue(10);
        koshelek.put(dolar);

        Money hrivna = new Hrivna();
        hrivna.setValue(50);
        koshelek.put(hrivna); hrivna = new Hrivna();
        hrivna.setValue(100);
        koshelek.put(hrivna); hrivna = new Hrivna();
        hrivna.setValue(5);
        koshelek.put(hrivna);

        System.out.println(koshelek.toString());
        System.out.println("Сумарно: " + koshelek.howMuch() + "UAH");





    }


    public void goTo(String place) {
        System.out.println("Ok. I go to " + place);
    }
}
