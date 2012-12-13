import java.util.GregorianCalendar;
import java.util.Calendar;

public class TestCal { 
public static void main(String[] args) {

// �������� ������� d,��������������� ������� ����.
	GregorianCalendar d = new GregorianCalendar();	
	int today = d.get(Calendar.DAY_OF_MONTH);
	int month = d.get(Calendar.MONTH);

// ��������� ������� d  ������ ����� ������.
	d.set(Calendar.DAY_OF_MONTH, 1);
	int weekday = d.get(Calendar.DAY_OF_WEEK);

// ����� ��������� �������.
	System.out.println("Sun Mon Tue Wed Thu Fri Sat");

// ��� ����������� ������ ������ ��������� �������� �����.
	for (int i = Calendar.SUNDAY; i < weekday; i++)
	System.out.print("    ");
do
{
// ����� ��� ������. 
	int day = d.get(Calendar.DAY_OF_MONTH);
	System.out.printf("%3d", day);
	
// �������� * ���������� ������� ����.
	if (day == today)
	System.out.print("*");
	else 
	System.out.print(" ");

// ����� ������ ������ ���������� ����� ������.
	if (weekday == Calendar.SATURDAY)
	System.out.println();

// ������� d �� ��������� ����.
	d.add(Calendar.DAY_OF_MONTH, 1);
	weekday = d.get(Calendar.DAY_OF_WEEK);
}
	while (d.get(Calendar.MONTH) == month);

// ���� �����������, ����� ������ d ���������� �� ������ ���� ����.������.
// ��� ������������� ����������� ������.
	if (weekday != Calendar.SUNDAY)
	System.out.println();
}
}