package com.rewards.calculator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rewards.calculator.db.MockDB;
import com.rewards.calculator.model.TransactionModel;
import com.rewards.calculator.model.UserTransactions;

@Service
public class TransactionService {
	
	@Autowired
	private MockDB db;
	
	public List<UserTransactions> getTransactions() {
		return db.getInstance().getTransactions();
	}
	
	public void addTransactions(UserTransactions transaction) {
		db.getInstance().addTransaction(transaction);
	}

	public List<UserTransactions> getOneTransactions() {
		TransactionModel model = new TransactionModel();
		model.setAmount("115");
		model.setDate("2021-10-12");
		List<TransactionModel> list = new ArrayList<TransactionModel>();
		list.add(model);
		UserTransactions transactions = new UserTransactions();
		transactions.setName("temp");
		transactions.setTransactions(list);
		db.getInstance().addTransaction(transactions);
		return getTransactions();
	}

}
