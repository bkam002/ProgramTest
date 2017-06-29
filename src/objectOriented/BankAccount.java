package objectOriented;

public class BankAccount {
	public static double cashDollar;
	public static double cashCent;
	public static double carry;
	public static String ID;
	public static String name;
	public BankAccount(double dcashDollar,double dcashCent, String dID, String dname){
		cashCent = dcashCent;
		cashDollar=dcashDollar;
		ID=dID;
		name=dname;

	}
	public double getCashDollar(){
		return cashDollar;
	}
	public double getCashCent(){
		if(cashCent>=100){
			carry=(cashCent-(cashCent%100)/100);
			cashDollar = cashDollar +carry;
			cashCent=cashCent-(cashCent-(cashCent%100));
		}
		return cashCent;
	}
	public String getID(){
		return ID;
	}
	public String getName(){
		return name;
	}
	public void setName(String dName){
		name=dName;
	}
	public void setID(String dID){
		ID=dID;
	}
	public void withdraw(int dDollar,int dCent){
		cashCent=cashCent-dCent;
		cashDollar=cashDollar-dDollar;
	}
	public void deposit(int dDollar,int dCent){
		cashCent=cashCent+dCent;
		cashDollar=cashDollar+dDollar;
	}

}
