package com.spring.transaction.dao.impl;
import java.util.List;

import com.spring.transaction.model.TransactionDate;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.transaction.dao.BoardDao;

@Component
public class BoardDaoImpl implements BoardDao {

		private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

		@Autowired
		private SqlSession sqlSession;

		public void setSqlSession(SqlSession sqlSession){ this.sqlSession = sqlSession; }

		@Override
		public List<TransactionDate> getTransactionMasterDateList() {
			return this.sqlSession.selectList("getTransactionDateList");
		}

		@Override
		public List<TransactionDate> getTransactionDateList() {
			return this.sqlSession.selectList("getTransactionDateList");
		}
}