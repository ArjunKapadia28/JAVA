package com.montran.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		// TODO Auto-generated constructor stub
	}


	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		this.initialOverdraftBalance = overdraftBalance;
	}



	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if(amount >0) {
			if(amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			if(amount > getBalance()) {
				amount = amount - getBalance();
				setBalance(getBalance()-getBalance());
				overdraftBalance = overdraftBalance - amount;
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if(amount > 0) {
	
			if(overdraftBalance!=initialOverdraftBalance) {
				double newOverdraftBalance = initialOverdraftBalance- overdraftBalance;
				if(newOverdraftBalance < amount) {
					overdraftBalance = overdraftBalance + newOverdraftBalance;
					amount = amount - newOverdraftBalance;
					setBalance(amount + getBalance());
					return true;
				}
				if(newOverdraftBalance >= amount) {
					overdraftBalance = overdraftBalance + amount;
					return true;
				}
			}
			else {
				setBalance(amount + getBalance());
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", getAccountNumber()=" + getAccountNumber()
				+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
	}

}

