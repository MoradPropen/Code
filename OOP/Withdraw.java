package Lab;

public class Withdraw extends Account  {
	void withdraw(double amnt) {
		if(amount<amnt) {
			System.out.println("Insufficient Balance");
		}
		else {
		amount=amount-amnt;
		System.out.println(amnt+" tk Withdraw");
		}
	}
}
