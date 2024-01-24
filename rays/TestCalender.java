package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {
public static void main(String[] args) throws Exception {
	String s = "06/01/2024";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(s);
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, 10);
	System.out.println(cal.getTime());
}
}
