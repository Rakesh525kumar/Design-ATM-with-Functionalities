package ATM;

import java.util.Scanner;

public interface Operations {
	
	
		
		
	
	
	 void UserAuthanticate(String Accno,String name); 
	
	void Balance(String Accno);
	void Deposit(String Accno,float Amount);
	void WithDraw(String Accno,float Amount);
	void ApplyforLoan(String accno);
	void Last5Transaction(String accno);
	
	

}
