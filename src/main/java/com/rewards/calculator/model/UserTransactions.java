package com.rewards.calculator.model;

import java.util.List;

public class UserTransactions {

	private String name;
	private List<TransactionModel> transactions;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<TransactionModel> getTransactions() {
		return transactions;
	}
	
	public void setTransactions(List<TransactionModel> transactions) {
		this.transactions = transactions;
	}
	
}
