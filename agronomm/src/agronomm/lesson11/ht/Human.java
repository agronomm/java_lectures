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
        Koshelek koshelek = new Koshelek(30);

        Money m1 = new Dolar();
        m1.setValue(5);
        koshelek.put(m1);

        Money m5 = new Hrivna();
        m1.setValue(50);
        koshelek.put(m1);

        System.out.println(koshelek.toString());
        System.out.println("В кошельке: " + koshelek.howMuch() + "UAH");





    }
}
