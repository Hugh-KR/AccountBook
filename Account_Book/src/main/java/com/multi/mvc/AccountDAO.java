package com.multi.mvc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(AccountVO vo) {
		my.insert("accountMapper.create", vo);
	}
	
	public List<AccountVO> all() {
		return my.selectList("accountMapper.all");
	}
	
	public List<AccountVO> all_income(){
		return my.selectList("accountMapper.all_income");
	}

	public List<AccountVO> all_expense(){
		return my.selectList("accountMapper.all_expense");
	}
}