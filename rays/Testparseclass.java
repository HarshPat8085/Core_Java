package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testparseclass {
public static void main(String[] args) throws Exception {
	String s ="25/09/2004";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(s);
	System.out.println(d);
}
}
