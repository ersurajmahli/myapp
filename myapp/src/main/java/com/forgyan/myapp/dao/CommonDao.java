package com.forgyan.myapp.dao;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.forgyan.myapp.entity.TransactionEntity;

@Repository
public class CommonDao {
	
	public static List<TransactionEntity> transList = Arrays.asList(
			new TransactionEntity(1, new Date(), 25000, "Reliance Fresh", "Credit Card"),
			new TransactionEntity(2, new Date(), 10000, "Tanishque Jewells", "Debit Card"),
			new TransactionEntity(3, new Date(), 6000, "V Mart", "Cash")
		);
	
	public List<TransactionEntity> getAll(){
		return transList;
	}

	public TransactionEntity getById(@PathVariable("id") int id){
		TransactionEntity trans = transList.stream()
				.filter(n -> n.getTransactionId()==id)
				.collect(Collectors.toList())
				.get(0);
		return trans;
	}
}
