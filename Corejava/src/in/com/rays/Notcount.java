package in.com.rays;

public class Notcount {
public static void main(String[] args) {
	int number = 3456;
	int count =0;
	int [] notes = {500,200,100,50,20,10,5,2,1};
	for (int i = 0; i < notes.length; i++) {
		count = number/notes[i];
		number = number % notes[i];
		if (count>0) {
			System.out.println(notes[i] + "=" + count);
		}
	}
}
}
