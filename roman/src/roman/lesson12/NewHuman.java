package roman.lesson12;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 10.01.13
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
public class NewHuman {
    public static void main(String[] args) {
        ArrayKoshelek koshelek = new ArrayKoshelek(15);


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
        System.out.println("������ ������� ������ � ������� = " + euvro);
        System.out.println("� ��� � �������� " + koshelek.howMuch() + " " + "UAH");
        Money takenMoney = koshelek.get();
        System.out.println("������ ������ = " + takenMoney);
        System.out.println("� ��� � �������� " + koshelek.howMuch() + " " + "UAH");

    }
}
