package com.spring.transaction.service;
import java.util.List;
import com.spring.transaction.model.TransactionDate;

public interface ScheduleInfoService {
	public List<TransactionDate> getTransactionMasterDateList();
	public List<TransactionDate> getTransactionDateList();
}