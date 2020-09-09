package com.forgyan.myapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.forgyan.myapp.entity.TransactionEntity;
import com.forgyan.myapp.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService service;

	@GetMapping("/trans")
	public List<TransactionEntity> getAll(){
		return service.getAll();
	}
	@GetMapping("/trans/{id}")
	public TransactionEntity getById(@PathVariable("id") int id){
		return service.getById(id);
	}
	
}
