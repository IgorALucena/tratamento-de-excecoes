package model;

public class AccountEntities {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public AccountEntities() {
	}

	public AccountEntities(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdraw(Double withdraw) {
		this.withdrawLimit = withdraw;
	}
	
	public void deposit(Double amount) {
		balance += amount;
		
	}
	public void withDraw(Double amount) {
		if(getBalance() <= 0.0) {
			throw new AccountExceptions ("Not enough balance"); 
		}
		if (amount > getWithdrawLimit()) {
			throw new AccountExceptions ("The amount exceeds withdraw limit"); 
		}
		balance -= amount;
		
	}

	@Override
	public String toString() {
		return String.format("New balance: %.2f ", balance);
	}
	
	

}
