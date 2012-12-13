package agronomm.lesson13;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 13.12.12
 * Time: 23:06
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListPresenter {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add(1,"b");
        list.add("c");
        System.out.println("size = " + list.size());
        for (Object element: list) {
            System.out.println(((String) element));
        }
    }
}
