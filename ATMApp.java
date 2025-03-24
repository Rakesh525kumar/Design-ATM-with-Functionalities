package ATM;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;



public class ATMApp extends ATM implements Operations {
	
	static String Address = "Hyderabd";
	static int midx;
	static int bidx;
	 boolean s;
	static {
		
		BankCustomer b1 = new BankCustomer();
		b1.setAccno("123456");
		b1.setActive(true);
		b1.setAddress(Address);
		b1.setBalance(1800000);
		b1.setPhno("7894561230");
		b1.setName("Rakesh");
		
		BankCustomer b2 = new BankCustomer();
		b2.setAccno("789456");
		b2.setActive(true);
		b2.setAddress(Address);
		b2.setBalance(0);
		b2.setPhno("8008502793");
		b2.setName("Jeremiah");
	

		BankCustomer b3 = new BankCustomer();
		b3.setAccno("2587964");
		b3.setActive(true);
		b3.setAddress(Address);
		b3.setBalance(25000000);
		b3.setPhno("7207829525");
		b3.setName("Pavani Akka");
	

		BankCustomer b4 = new BankCustomer();
		b4.setAccno("666666");
		b4.setActive(true);
		b4.setAddress(Address);
		b4.setBalance(15000);
		b4.setPhno("9989287856");
		b4.setName("Philip");
	

		BankCustomer b5 = new BankCustomer();
		b5.setAccno("555555");
		b5.setActive(true);
		b5.setAddress(Address);
		b5.setBalance(398000);
		b5.setPhno("7894561230");
		b5.setName("Matthew");
	

		BankCustomer b6 = new BankCustomer();
		b6.setAccno("444444");
		b6.setActive(true);
		b6.setAddress(Address);
		b6.setBalance(15000);
		b6.setPhno("147896523");
		b6.setName("Rakesh");
	

		BankCustomer b7 = new BankCustomer();
		b7.setAccno("333333");
		b7.setActive(true);
		b7.setAddress(Address);
		b7.setBalance(15000);
		b7.setPhno("258741963");
		b7.setName("Mahima");
	

		BankCustomer b8 = new BankCustomer();
		b8.setAccno("222222");
		b8.setActive(true);
		b8.setAddress(Address);
		b8.setBalance(15000);
		b8.setPhno("987654321");
		b8.setName("keerthan");
		
		BankCustomer b9 = new BankCustomer();
		b9.setAccno("111111");
		b9.setActive(true);
		b9.setAddress(Address);
		b9.setBalance(15000);
		b9.setPhno("123456789");
		b9.setName("Rakesh");


		BankCustomer b10 = new BankCustomer();
		b10.setAccno("123456");
		b10.setActive(true);
		b10.setAddress(Address);
		b10.setBalance(15000);
		b10.setPhno("693582147");
		b10.setName("DevenRaj");
	

		BankCustomer b11 = new BankCustomer();
		b11.setAccno("123456");
		b11.setActive(true);
		b11.setAddress(Address);
		b11.setBalance(15000);
		b11.setPhno("021456320");
		b11.setName("Divya");
	

		BankCustomer b12 = new BankCustomer();
		b12.setAccno("789456");
		b12.setActive(true);
		b12.setAddress(Address);
		b12.setBalance(15000);
		b12.setPhno("789456985");
		b12.setName("Jenny");
	
		BankCustomer b13 = new BankCustomer();
		b13.setAccno("000000");
		b13.setActive(true);
		b13.setAddress(Address);
		b13.setBalance(15000);
		b13.setPhno("749625841");
		b13.setName("Deepu");
		
		
		ATM a = new ATMApp();
		a.setBankCustomer(b1, midx++);
		a.setBankCustomer(b2, midx++);
		a.setBankCustomer(b3, midx++);
		a.setBankCustomer(b4, midx++);
		a.setBankCustomer(b5, midx++);
		a.setBankCustomer(b6, midx++);
		a.setBankCustomer(b7, midx++);
		a.setBankCustomer(b8, midx++);
		a.setBankCustomer(b9, midx++);
		a.setBankCustomer(b10, midx++);
		a.setBankCustomer(b11, midx++);
		a.setBankCustomer(b12, midx++);
		a.setBankCustomer(b13, midx++);
	
		System.out.println(a);
	}

	@Override
	public void Balance(String Accno) {
		ATM D = new ATMApp();
	   BankCustomer[] bankCustomer = D.getBankCustomer();
		//System.out.println(Arrays.toString(bankCustomer));
		for(int i=0;i<=midx;i++)
		{
			if(bankCustomer[i].getAccno().equals(Accno))
			{
			System.out.println("Your Balance ::" +	bankCustomer[i].getBalance());
			break;
			}
			else {
				System.out.println("not proper account Details....");
				break;
			}
		
		}
		
	}

	@Override
	public void Deposit(String Accno, float Amount) {
		
		
	
		
		
		ATMApp o = new ATMApp();
	    BankCustomer[] bank = o.getBankCustomer();
	   // System.out.println(new ATMApp().isEmpty(Accno,Amount));
	    //System.out.println(Arrays.toString(bank));
	    
	   // System.out.println(o.isEmpty(Accno,Amount));
     if(o.isEmpty(Accno,Amount))
     {
    	 for(int i=0;i<=midx;i++)
    	 {
    		 
    		 if(bank[i].getAccno().equals(Accno))
    		 {
    			float bal = bank[i].getBalance()- Amount;
    			 bank[i].setBalance(bal);
    			 System.out.println("withdraw Successfull.....");
    			 System.out.println("Your balsance is " + " "+ bal);
    			 
    			 Transactions t = new Transactions();
    				t.setAccno(Accno);
    				t.setAmount(Amount);
    				t.setDay(new Date());
    				o.setTra(t,++bidx);
    			 break;
    		 }
    		 else {
    			 System.out.println("invalid balance....");
    			 System.out.println(bank[i].getBalance());
    			 break;
    		 }
    		 
    	 }
		
	
     }
     }

	@Override
	public void WithDraw(String Accno, float Amount) {
	ATMApp o = new ATMApp();
	    BankCustomer[] bank = o.getBankCustomer();
	   // System.out.println(new ATMApp().isEmpty(Accno,Amount));
	    //System.out.println(Arrays.toString(bank));
	    
	   // System.out.println(o.isEmpty(Accno,Amount));
     if(o.isEmpty(Accno,Amount))
     {
    	 for(int i=0;i<=midx;i++)
    	 {
    		 
    		 if(bank[i].getAccno().equals(Accno))
    		 {
    			float bal = bank[i].getBalance()+ Amount;
    			 bank[i].setBalance(bal);
    			 System.out.println("Deposit Successfull.....");
    			 System.out.println("Your balance is " + " "+ bal);
    			 
    			 Transactions t = new Transactions();
 				t.setAccno(Accno);
 				t.setAmount(Amount);
 				t.setDay(new Date());
 				o.setTra(t,++bidx);
    			 break;
    		 }
    		 else {
    			 System.out.println("invalid balance....");
    			 System.out.println(bank[i].getBalance());
    			 break;
    		 }
    		 
    	 }
     }
		
	}

	@Override
	public void ApplyforLoan(String accno) {
		ATM a = new ATMApp();
		BankCustomer[] bc = a.getBankCustomer();
		for(int i=0;i<=midx;i++)
		{
			  if(bc[i].getAccno().equals(accno))
			  {
				  if(bc[i].getBalance()>50000)
				  {
			System.out.println("Your eliblel for loan 100000");
				  }
				  else if(bc[i].getBalance()>30000)
				  {
			System.out.println("Your eliblel for loan 80000");
				  }
				  else
				  {
			System.out.println("Your eliblel for loan 200000");
				  }
				  break;
			  }
		}
		
		
	}

	

	
	
	public static void main(String[] args) {
		
		System.out.println("press 1: For UserAuthentication");
		System.out.println("press 2: know the balance");
		System.out.println("press 3: for withdraw amount");
		System.out.println("press 4: for deposit amount");
		System.out.println("press 0: Exit");
		System.out.println("Press 5: Last Few Transation..");
		System.out.println("Press 6: Apply for Loan..");
		
		System.out.println("Welcome to ATM");
		
		ATMApp b = new ATMApp();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the code");
			int i =sc.nextInt();
			
			switch(i) {
			case 1:
			{
				System.out.println("Enter the Accno");
				String acc = sc.next();
				System.out.println("Enter the Account Holder name");
				String kame = sc.next();

				b.UserAuthanticate(acc,kame);
				break;
			}
			case 2:
			{
				System.out.println("Enter accno number");
				String acc = sc.next();
				b.Balance(acc);
				break;
			}
			case 3:
			{
				System.out.println("Enter the accno");
				String accno  = sc.next();
				System.out.println("Enter the amount");
				float f = sc.nextFloat();
				b.WithDraw(accno,f);
				break;
			}
			case 4:{
				System.out.println("Enter the accno");
				String accno  = sc.next();
				System.out.println("Enter the amount");
				float f = sc.nextFloat();
				b.Deposit(accno, f);
				break;
			
			}
			case 5:{
				System.out.println("Enter your Accno");
				
				b.ApplyforLoan(sc.next());
				break;
			}
			case 6:
			{
				System.out.println("Last 5 transactions");
				System.out.println("Enter the accno");
				String accno = sc.next();
				b.Last5Transaction(accno);
				
				
				break;
			}
			case 0:{
				System.exit(0);
				break;
			}
			
			default: {
				System.out.println("Invalid output...");
			}
			}
		}
		
		
		
	}
	
	@Override
	public void UserAuthanticate(String Accno, String name) {
				
		ATM  d = new ATMApp();
		BankCustomer[] bankCustomer =d.getBankCustomer();
		System.out.println(Arrays.toString(bankCustomer));
		for(int i=0; i<=midx;i++)
		{
			if(bankCustomer[i].getAccno().equals(Accno)&&(bankCustomer[i].getName().equals(name)))

{
	System.out.println("User Exist");
	Date n = new Date();
	 int hours = n.getHours();
	 if(hours>0&&hours<=12)
	 {
		 System.out.println("Hello " + bankCustomer[i].getName() + "Good Morning welcome to ATM"); 
	 }
	 else if(hours>12&&hours<6)
	 {
		 System.out.println("Hello " + bankCustomer[i].getName() + "Good AfterNoon welcome to ATM");
	 }
	 else {
		 System.out.println("Hello " + bankCustomer[i].getName() + " Good Evening ");
	 }
	
	break;
}
else {
	System.out.println("User details not avaiable");
	break;
}	
}
}
	
	private  boolean isEmpty(String Accno,float Amount)
	{
		System.out.println(Accno + "    " + Amount);
	   ATM h = new ATMApp();
	   BankCustomer[] Customer = h.getBankCustomer();
	   System.out.println(Arrays.toString(Customer));
	   for(int i=0;i<=midx;i++)
	   {
		 //  System.out.println(Customer[i].getAccno().equals(Accno));
		   if(Customer[i].getAccno().equals(Accno))
		   {
			  if(Customer[i].getBalance()>Amount)
			  {
				  s =  true;
				  break;
			  }
			  else {
				  s=false;
				  break;
			  }
		   }
	   }
	return s;
	  
		
	}

	@Override
	public void Last5Transaction(String accno) {
		
		ATMApp N = new ATMApp();
		Transactions[] tra = N.getTra();
		//System.out.println(Arrays.toString(tra));
		
		for(int i=0;i<=4;i++)
		{
			Optional<Transactions> a = Optional.ofNullable(tra[i]);
			if(a.isEmpty())
			{
			System.out.println(" no Transacations on"+ accno);
			break;
			}
			else {
				System.out.println(a.get());
				System.out.println("Transactions are "+ tra[i].getAccno() );
				break;
			      }
		}
		
	}
	
	

}
