package com.multi.mvc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<AccountVO> all() { // 입금
		return my.selectList("account.statistics");
	}
	
	public List<AccountVO> dayall(AccountVO vo){
		return my.selectList("account.daylist",vo);
	}
	
	
	
	

}
