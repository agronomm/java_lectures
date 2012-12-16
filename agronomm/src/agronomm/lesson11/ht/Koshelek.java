package agronomm.lesson11.ht;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 29.11.12
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
public class Koshelek {
    // ����� ����� - ������ �� �������������� ������
    Money[] moneys;
    // ������� ����� ��� ������� �����
    int current;

    /**
     * �����������, ������� ����� �������
     * @param capacity - ������ ��������
     */
    public Koshelek(int capacity) {
        // ������� ����� ��� ������� ����� � �������(������ � 0)
        current = 0;
        // ������ ����� ����������� ����� ������ - ������ �� ����� � ���������� capacity ����
        moneys = new Money[capacity];
    }

    public void bay() {
        moneys[current--] = null;
    }

    /**
     * ������ ������ � �������
     * @param money - ���������� ������(������ ��� ����) ���� ������ � �� ������
     */
    public void put(Money money) {
        // �������� ������ �� ����� ����� current, � ���� current ����� ����� ��������� �� 1
        moneys[current++] = money;
    }

    /**
     * ������� ����� ����� � ��������
     * @return ���������� �����, � ������, � �������� � ������ ����� �������
     */
    public int howMuch() {
        int resultSumm = 0;
        // ���� � ��� ���� ������ � ������� �� ����������, ���������� ��� �� ������
        // ���� ������ - �������� � ����������, ���� ������ - �������� �� ���� � ���
        // ����� �������� � ����������
        for (int i = 0; i < current && i < moneys.length; i++) {
            Money m = moneys[i];
            if (m.getCurrency().equals("UAH")) {
                resultSumm += m.getValue();
            } else if (m.getCurrency().equals("USD")) {
                resultSumm += ((Dolar) m).getByRate();
            }
        }
        double resSumInDouble = (double) resultSumm;
        resultSumm = (int) resSumInDouble;
        //������������
        // ���� � ��� ���� ������ � ������� �� ����������
        // � ����� ���������� �������� ������ ���������� �� ����

        for (int i = 0; i < current && i < moneys.length; i++) {
            Money m = moneys[i];
            resultSumm += m.getValue() * m.getRate();
        }

        return resultSumm;
    }

    // ���������� ��� �������� ���� - ��� ����� � ��������
    // ��� ������� ����� �� ������ "��� � ���� ���?"
    //
    public String toString() {
        int sumUAH = 0;
        int sumUSD = 0;
        for (int i = 0; i < current; i++) {
            Money m = moneys[i];
            if (m.getCurrency().equals("UAH")) {
                sumUAH += m.getValue();
            } else {
                sumUSD += m.getValue();
            }
        }

        return "� �������� ����� " + sumUAH + " ������ � " + sumUSD + "��������";
    }
}
