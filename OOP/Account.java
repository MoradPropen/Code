package Lab;

public class Account {
	int acc_no;
	String name;
	double amount;
	void insert(int a,String n,double amnt) {
		acc_no=a;
		name=n;
		amount=amnt;
	}
	void deposit(double amnt) {
		amount=amount+amnt;
		System.out.println(amnt+" Deposited");
	}
	
	void cheak_balance() {
		System.out.println("Balance is: "+amount);
	}
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
	
}
