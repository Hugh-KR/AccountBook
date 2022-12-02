package com.multi.mvc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PurposeDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	
	public int confirm(int month) {
		int mon =my.insert("purpose.confirm", month);
		return mon;
	}
	public void insert(PurposeVO vo) {
		my.insert("purpose.create", vo);
	}
	public void update(PurposeVO vo) {
		my.update("purpose.update", vo);
	}
	public void delete(PurposeVO vo) {
		my.delete("purpose.delete", vo);
	}
	public PurposeVO search(int month) {
		PurposeVO bag = my.selectOne("purpose.search", month);
		return bag;
	}
}
