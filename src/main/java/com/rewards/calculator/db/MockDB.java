package com.rewards.calculator.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rewards.calculator.model.UserTransactions;

@Component
public class MockDB {
	private static MockDB mockDb = new MockDB();
	private static List<UserTransactions> transactions = new ArrayList<UserTransactions>();
	private void MockDB() {}
	
	public static MockDB getInstance() {
		if(mockDb==null) {
			mockDb = new MockDB();
		} 
		return mockDb;
	}
	
	public List<UserTransactions> getTransactions() {
		return transactions;
	}
	
	public void addTransaction(UserTransactions transaction) {
		boolean isNotUserExists = true;
		for(UserTransactions userTransactions : transactions) {
			if(userTransactions.getName().equalsIgnoreCase(transaction.getName())) {
				userTransactions.getTransactions().addAll(transaction.getTransactions());
				if(userTransactions.getTransactions().size()>3) {
					userTransactions.getTransactions().remove(0);
				}
				isNotUserExists = false;
			}
		}
		if(isNotUserExists) {
			transactions.add(transaction);
		}
	}
	
}
