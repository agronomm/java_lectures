import java.util.GregorianCalendar;
import java.util.Calendar;

public class TestCal2 {
	public static void main(String[] args) {

		// Создание объекта d,представляющего текущую дату.
		GregorianCalendar d = new GregorianCalendar();
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);

		// Установка объекта d первое число месяца.
		d.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = d.get(Calendar.DAY_OF_WEEK);

		// Вывод заголовка таблицы.
		System.out.println(month);
		System.out.println("Mon Tue Wed Thu Fri Sat  Sun");

		// При отображении первой строки календаря возможен сдвиг.
		for (int i = Calendar.MONDAY; i < weekday; i++)
			System.out.print("    ");
		do {
			// Вывод дня месяца.
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			// Символом * помечается текущий день.
			if (day == today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}

			// После каждой суботы начинается новая строка.
			if (weekday == Calendar.SUNDAY)
				System.out.println();

			// Перевод d на следующий день.
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		} while (d.get(Calendar.MONTH) == month);

		// Цикл завершается, когда объект d установлен на первый день
		// след.месяца.
		// При необходимости переводится строка.
		if (weekday != Calendar.MONDAY)
			System.out.println();
	}
}