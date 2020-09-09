package com.forgyan.myapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_transaction")
public class TransactionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trans_id")
	private int transactionId;

	@Column(name = "trans_date")
	private Date transactionDate;

	@Column(name = "trans_amount")
	private float transactionAmount;

	@Column(name = "trans_receiver")
	private String transactionReceiver;

	@Column(name = "trans_mode")
	private String transactionMode;

	public TransactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionEntity(Date transactionDate, float transactionAmount, String transactionReceiver,
			String transactionMode) {
		super();
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.transactionReceiver = transactionReceiver;
		this.transactionMode = transactionMode;
	}
	
	public TransactionEntity(int transactionId, Date transactionDate, float transactionAmount,
			String transactionReceiver, String transactionMode) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.transactionReceiver = transactionReceiver;
		this.transactionMode = transactionMode;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionReceiver() {
		return transactionReceiver;
	}

	public void setTransactionReceiver(String transactionReceiver) {
		this.transactionReceiver = transactionReceiver;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	@Override
	public String toString() {
		return "TransactionEntity [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", transactionAmount=" + transactionAmount + ", transactionReceiver=" + transactionReceiver
				+ ", transactionMode=" + transactionMode + "]";
	}
	
	

}
