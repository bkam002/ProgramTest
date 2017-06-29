package objectOriented;

public class SavingsAccount extends BankAccount{
public double interest;
	public SavingsAccount(double dcashDollar, double dcashCent, String dID, String dname) {
		super(dcashDollar, dcashCent, dID, dname);
		BankAccount.cashDollar=dcashDollar;
		BankAccount.cashCent=dcashCent;
		BankAccount.ID=dID;
		BankAccount.name=dname;
	}

public void addInterest(){
	BankAccount.cashDollar=BankAccount.cashDollar+BankAccount.cashDollar*interest;
	BankAccount.cashCent=BankAccount.cashCent+BankAccount.cashCent*interest;
}

}
