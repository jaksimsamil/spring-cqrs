package com.spring.transaction.dao.impl;

import com.spring.transaction.dao.BoardAopDao;
import com.spring.transaction.model.TransactionDate;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BoardAopDaoImpl implements BoardAopDao {

		private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

		@Autowired
		private SqlSession sqlSession;

		public void setSqlSession(SqlSession sqlSession){ this.sqlSession = sqlSession; }

		@Override
		public List<TransactionDate> updateTransactionDate() { return this.sqlSession.selectList("getTransactionDateList"); }

		@Override
		public List<TransactionDate> selectTransactionDateList() { return this.sqlSession.selectList("getTransactionDateList"); }
}