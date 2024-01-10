package in.com.rays;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformatclass {
public static void main(String[] args) {
	Date d = new Date();
	System.out.println(d);
	SimpleDateFormat sdf = new SimpleDateFormte("");
	String s = sdf.format(d);
	System.out.println(s);
}
}

