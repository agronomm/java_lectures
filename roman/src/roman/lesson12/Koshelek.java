package roman.lesson12;

public class Koshelek {
	// ����� ����� - ������ �� �������������� ������
	Money[] moneys;
	// ������� ����� ��� ������� �����
	int current;

	/**
	 * �����������, ������� ����� �������
	 * 
	 * @param capacity
	 *            - ������ ��������
	 */
	public Koshelek(int capacity) {
		// ������� ����� ��� ������� ����� � �������(������ � 0)
		current = 0;
		// ������ ����� ����������� ����� ������ - ������ �� ����� � ����������
		// capacity ����
		moneys = new Money[capacity];
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
		moneys[current++] = money;
	}

	/**
	 * ������� ����� ����� � ��������
	 * 
	 * @return ���������� �����, � ������, � �������� � ������ ����� �������
	 */
	public int howMuch() {
		int resultSumm = 0;
		// ���� � ��� ���� ������ � ������� �� ����������, ���������� ��� ��
		// ������
		// ���� ������ - �������� � ����������, ���� ������ - �������� �� ���� �
		// ���
		// ����� �������� � ����������
		for (int i = 0; i < current && i < moneys.length; i++) {
			Money m = moneys[i];
			if (m.getCurrency().equals("UAH")) {
				resultSumm += m.getValue();
			} else if (m.getCurrency().equals("USD")) {
				resultSumm += m.getValue() * m.getRate();
			} else if (m.getCurrency().equals("EUR")) {
				resultSumm += m.getValue() * m.getRate();
			}
		}
		// ������������
		// ���� � ��� ���� ������ � ������� �� ����������
		// � ����� ���������� �������� ������ ���������� �� ����
		resultSumm = 0;
		for (int i = 0; i < current && i < moneys.length; i++) {
			Money m = moneys[i];
			resultSumm += m.getValue() * m.getRate();
		}

		return resultSumm;
	}

	// ���������� ��� �������� ���� - ��� ����� � ��������
	// ��� ������� ����� �� ������ "��� � ���� ���?"
	//

	

	
	public  Money get() {
		Money resultMoney = moneys[current - 1];
		moneys[current - 1] = null;
		current = current - 1;
		return resultMoney;
	}
	public  Money look( int current) {
		Money resultMoney = moneys[current];
		return resultMoney;
	}

	public String toString() {
		int resultSumm = 0;
		int resultSumm1 = 0;
		int resultSumm2 = 0;
		for (int i = 0; i < current && i < moneys.length; i++) {
			Money m = moneys[i];
			if (m.getCurrency().equals("UAH")) {
				resultSumm += m.getValue();
			} else if (m.getCurrency().equals("USD")) {
				resultSumm1 += m.getValue();
			} else if (m.getCurrency().equals("EUR")) {
				resultSumm2 += m.getValue();
			}

		}
		return "� ��������" + " " + resultSumm + "UAH" + " " + resultSumm1
				+ "USD" + " " + resultSumm2 + "EUR";

	}

}
