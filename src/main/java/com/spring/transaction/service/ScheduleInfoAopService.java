package com.spring.transaction.service;

import com.spring.transaction.model.TransactionDate;

import java.util.List;

public interface ScheduleInfoAopService {
	public List<TransactionDate> setTransactionDate();
	public List<TransactionDate> getTransactionDateList();
}