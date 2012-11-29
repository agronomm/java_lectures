package agronomm.lesson11;

import agronomm.lesson10.Operation;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 29.11.12
 * Time: 22:21
 * To change this template use File | Settings | File Templates.
 */
public class OperList {
    private Operation [] opers;
    private int i;
    private int j;

    public OperList() {
        opers = new Operation[20];
        i = 0;
    }

    public OperList(int pazmer) {
        opers = new Operation[pazmer];
        i = 0;
    }

    public void add(Operation operation) {
        opers[i++] = operation;
    }

    public Operation getNext() {

        return opers[j++];
    }

    public Operation getFirst() {
        j = 1;
        return opers[0];
    }

    public boolean hasMore() {
        return j < i;
    }



}
