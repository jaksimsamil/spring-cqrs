package com.spring.transaction.service.impl;

import java.util.List;

import com.spring.transaction.model.TransactionDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.transaction.dao.BoardDao;
import com.spring.transaction.service.ScheduleInfoService;

@Component
public class ScheduleInfoServiceImpl implements ScheduleInfoService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public List<TransactionDate> getTransactionMasterDateList() {
		return this.boardDao.getTransactionMasterDateList();
	}

	@Override
	public List<TransactionDate> getTransactionDateList() { return this.boardDao.getTransactionDateList();	}

}


