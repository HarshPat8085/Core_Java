package in.com.interface1;

public class Buisnessman implements Richman, Socialworker {

	@Override
	public void helpToother() {
		System.out.println("i am hepler for each peole");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("every person earn money");
		
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}

	@Override
	public void party() {
		System.out.println("this is party");
		
	}

}
