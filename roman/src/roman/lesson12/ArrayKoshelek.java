package roman.lesson12;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 10.01.13
 * Time: 22:51
 * To change this template use File | Settings | File Templates.
 */
public class ArrayKoshelek {
    // ����� ����� - ������ �� �������������� ������
    private ArrayList<Money> moneys;


    public ArrayKoshelek(int capacity) {
        // ������ ����� ����������� ����� ������ - ������ �� ����� � ����������
        // capacity ����
        moneys = new ArrayList<Money>(capacity);
    }


    /**
     * ������ ������ � �������
     *
     * @param money
     *            - ���������� ������(������ ��� ����) ���� ������ � �� ������
     */
    public void put(Money money) {
        // �������� ������ �� ����� ����� current, � ���� current ����� �����
        // ��������� �� 1
        moneys.add(money);
    }


    /**
     * ������� ����� ����� � ��������
     *
     * @return ���������� �����, � ������, � �������� � ������ ����� �������
     */
    public int howMuch() {
        int resultSumm = 0;

        // ������������
        // ���� � ��� ���� ������ � ������� �� ����������
        // � ����� ���������� �������� ������ ���������� �� ����
        resultSumm = 0;
        for (Money m : moneys) {
            resultSumm += m.getValue() * m.getRate();
        }

        return resultSumm;
    }

    //��������� ����� ������� ������ �� ������� ��� �� ��� �������,
    // �� �� ������ ������� Money
    public Money get() {
        Money resultMoney = moneys.get(moneys.size() - 1);
        moneys.remove(resultMoney);
        return resultMoney;
    }
}
