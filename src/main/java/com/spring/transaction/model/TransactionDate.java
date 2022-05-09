package com.spring.transaction.model;

import java.util.Date;

public class TransactionDate {
	private int timeSeq;
	private Date openDate;

	public TransactionDate(){	}
	
	public TransactionDate(int timeSeq, Date openDate){
		this.timeSeq = timeSeq;
		this.openDate = openDate;
	}
	
	public int getTimeSeq() {
		return this.timeSeq;
	}

	public void setTimeSeq(int timeSeq) {
		this.timeSeq = timeSeq;
	}

	public Date getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

}