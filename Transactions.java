package ATM;

import java.util.Date;

public class Transactions {
	
	private Date day;
	private String accno;
	private float amount;
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transactions [day=" + day + ", accno=" + accno + ", amount=" + amount + "]";
	}
	
	
	

}
