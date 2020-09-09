package com.forgyan.myapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.forgyan.myapp.dao.CommonDao;
import com.forgyan.myapp.entity.TransactionEntity;

@Service
@Transactional
public class TransactionService {
	
	@Autowired
	private CommonDao dao;
	
	public List<TransactionEntity> getAll(){
		return CommonDao.transList;
	}
	
	public TransactionEntity getById(int id){
		return dao.getById(id);
	}

}
