package Lab;

public class Account_test {
public static void main(String [] args) {
	Withdraw my=new Withdraw();
	my.insert(170144,"Morad",50000);
	my.display();
	my.cheak_balance();
	my.deposit(20000);
	my.cheak_balance();
	my.withdraw(10000);
	my.cheak_balance();
}
}
