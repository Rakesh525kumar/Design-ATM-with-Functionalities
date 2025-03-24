package ATM;

public class BankCustomer {
	
	private String Name;
	private String Phno;
	private float Balance;
	private String Accno;
	private String Address;
	private boolean Active;
	
	
	
	
	
	
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhno() {
		return Phno;
	}
	public void setPhno(String phno) {
		Phno = phno;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	public String getAccno() {
		return Accno;
	}
	public void setAccno(String accno) {
		Accno = accno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "BankCustomer [Name=" + Name + ", Phno=" + Phno + ", Balance=" + Balance + ", Accno=" + Accno
				+ ", Address=" + Address + ", Active=" + Active + "]";
	}
	
	

}
