package com.multi.mvc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<AccountVO> all2() { // 달력 날짜별 입출금 
		return my.selectList("account.statistics");
	}
	// 수입/지출 추가
		public void insert(AccountVO vo) {
			my.insert("account.create", vo);
		}
		// 수입/지출 전체 조회 (날짜순)
		public List<AccountVO> all() {
			return my.selectList("account.all");
		}
		// 수입만 날짜순으로 조회
		public List<AccountVO> all_income(){
			return my.selectList("account.all_income");
		}
		// 지출만 날짜순으로 조회
		public List<AccountVO> all_expense(){
			return my.selectList("account.all_expense");
		}
		// 수입/지출 수정
		public void update(AccountVO vo) {
			my.update("account.up", vo);
		}
		// 수입/지출 삭제
		public void delete(AccountVO vo) {
			my.delete("account.del", vo);
		}
	
	/*
	 * public List<AccountVO> dayall(AccountVO vo){ return
	 * my.selectList("account.daylist",vo); } public List<AccountVO> dayall2(){
	 * return my.selectList("account.yeah"); }
	 */
	
	
}
