package RandomDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		List<String> randString = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			randString.add(StringGenerator.generateString(6, 15));
		}
		System.out.println("List of random String :");
		System.out.println(randString);
		System.out.println();

		DateFormat fmt = new SimpleDateFormat("dd MM yyyy");
		Date date = null;
		try {
			date = fmt.parse("05 07 1973");
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		Calendar calendar = new GregorianCalendar();
		System.out.println("The current date is : " + calendar.getTime());
		System.out.println("The current day of month is : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("The current day of year is : " + calendar.get(Calendar.DAY_OF_YEAR));
		calendar.setTime(date);
		System.out.println("Now date is settinng up to: " + calendar.getTime());
		calendar.add(1, -2); // minus 2 year
		System.out.println("2 years ago: " + calendar.getTime());
		calendar.add(Calendar.YEAR, 2); // add 2 year
		System.out.println("2 years later: " + calendar.getTime());
		calendar.add(2, 2); // add 2 month
		System.out.println("2 days later: " + calendar.getTime());
		calendar.add(Calendar.MONTH, 2); // add 2 month
		System.out.println("2 MONTHS later: " + calendar.getTime());
		calendar.add(3, 2); // add 2 weeks
		System.out.println("2 weeks later: " + calendar.getTime());
		calendar.add(Calendar.WEEK_OF_YEAR, 2); // add 2 weeks
		System.out.println("2 weeks later: " + calendar.getTime());
		calendar.add(5, 2); // add 2 days
		System.out.println("2 days later: " + calendar.getTime());
		calendar.add(Calendar.DATE, 2); // add 2 days
		System.out.println("2 days later: " + calendar.getTime());

		System.out.println("Now date is : " + calendar.getTime());
		System.out.println("This is the day of month : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("This is the day of year : " + calendar.get(Calendar.DAY_OF_YEAR));
	}
}
