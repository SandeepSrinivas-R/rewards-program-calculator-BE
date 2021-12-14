package com.rewards.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.calculator.model.UserTransactions;
import com.rewards.calculator.service.TransactionService;

@RestController
public class CalculatorController {

	@Autowired
	TransactionService service;
	
	@GetMapping("/all")
	public List<UserTransactions> getTransactions() {
		return service.getTransactions();
	}
	
//	@GetMapping("/all")
//	public List<UserTransactions> getOneTransactions() {
//		return service.getTransactions();
//	}
	
	@PostMapping("/add")
	public void addTransaction(@RequestBody UserTransactions transaction) {
		service.addTransactions(transaction);
	}
	
}
