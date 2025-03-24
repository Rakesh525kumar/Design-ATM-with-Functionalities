package ATM;

import java.util.Arrays;

public  abstract class ATM {
	
private  static BankCustomer[] BankCustomer = new BankCustomer[100];
private static Transactions[] tra = new Transactions[100];

public static Transactions[] getTra() {
	return tra;
}

public static void setTra(Transactions tra,int j) {
	ATM.tra[j] = tra;
}

public static void setBankCustomer(BankCustomer[] bankCustomer) {
	BankCustomer = bankCustomer;
}

public BankCustomer[] getBankCustomer() {
	return BankCustomer;
}

public void setBankCustomer(BankCustomer bankCustomer, int i) {
	BankCustomer[i] = bankCustomer;
}

@Override
public String toString() {
	return "ATM [BankCustomer=" + Arrays.toString(BankCustomer) + "]";
}




	

}
