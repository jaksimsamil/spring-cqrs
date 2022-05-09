package com.spring.transaction.service.impl;

import com.spring.transaction.dao.BoardAopDao;
import com.spring.transaction.dao.BoardDao;
import com.spring.transaction.model.TransactionDate;
import com.spring.transaction.service.ScheduleInfoAopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScheduleInfoAopServiceImpl implements ScheduleInfoAopService {

	@Autowired
	private BoardAopDao boardAopDao;

	@Override
	public List<TransactionDate> setTransactionDate() {
		return this.boardAopDao.updateTransactionDate();
	}

	@Override
	public List<TransactionDate> getTransactionDateList() { return this.boardAopDao.selectTransactionDateList();	}

}


