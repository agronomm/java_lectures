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
			}
			else if (m.getCurrency().equals("EUR")) {
				resultSumm += m.getValue() * m.getRate();
			}
		}
		// ������������
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
		return "� ��������";
	}
}
