package com.spring.transaction.dao;

import com.spring.transaction.model.TransactionDate;

import java.util.List;

public interface BoardAopDao {
	public List<TransactionDate> updateTransactionDate();
	public List<TransactionDate> selectTransactionDateList();
}
