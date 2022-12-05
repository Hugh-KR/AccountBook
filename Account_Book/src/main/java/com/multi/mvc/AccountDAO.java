package com.multi.mvc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	@Autowired
	SqlSessionTemplate my;
	
	// 수입/지출 추가
	public void insert(AccountVO vo) {
		my.insert("accountMapper.create", vo);
	}
	// 수입/지출 전체 조회 (날짜순)
	public List<AccountVO> all() {
		return my.selectList("accountMapper.all");
	}
	// 수입만 날짜순으로 조회
	public List<AccountVO> all_income(){
		return my.selectList("accountMapper.all_income");
	}
	// 지출만 날짜순으로 조회
	public List<AccountVO> all_expense(){
		return my.selectList("accountMapper.all_expense");
	}
	// 수입/지출 수정
	public void update(AccountVO vo) {
		my.update("accountMapper.up", vo);
	}
	// 수입/지출 삭제
	public void delete(AccountVO vo) {
		my.delete("accountMapper.del", vo);
	}
	
}