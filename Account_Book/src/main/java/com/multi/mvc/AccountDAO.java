package com.multi.mvc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<AccountVO> all(){
		return my.selectList("account.all");
	}

}
