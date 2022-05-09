package com.spring.transaction.dao;
import java.util.List;
import com.spring.transaction.model.TransactionDate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BoardDao {
	public List<TransactionDate> getTransactionMasterDateList();
	/*
		1. @Transactional 어노테이션을 interface에서 정의한 이유는 오버라이딩 가능한 public 메소드에서 동작하기 때문이다.
		2. InnoDB 엔진에서만 @Transactional 어노테이션을 사용할 수 있다. (MySQL 5.5 이상 버전은 기본적으로 InnoDB를 사용)
	 */
	@Transactional(readOnly = true) public List<TransactionDate> getTransactionDateList();
}
