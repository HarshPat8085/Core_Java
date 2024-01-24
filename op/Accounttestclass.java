package in.com.op;

public class Accounttestclass {
public static void main(String[] args) {
	Account a = new Account();
	a.setAccount("saving");
	a.setBalance(78888.00);
	a.setNumber("999999999999");
	System.out.println(a.getAccount());
	System.out.println(a.getBalance());
	System.out.println(a.getNumber());
}
}
