package com.multi.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
	@Autowired
	AccountDAO dao;
	
	
	@RequestMapping("statistics")	//캘린더 날짜별 통계 
	public void all2(AccountVO vo, Model model) {
		List<AccountVO> list = dao.all2();
		model.addAttribute("list",list);	
	}
	
	// 수입/지출 추가
		@RequestMapping("insert_account.multi")
		public String insert(AccountVO vo) {
			dao.insert(vo);
			return "redirect:account.jsp";
		}
		
	// 수입/지출 전체 조회 (날짜순)
		@RequestMapping("all.multi")
		public void all(Model model) {
			List<AccountVO> list = dao.all();
			model.addAttribute("list", list);
		}
		
		// 수입만 날짜순으로 조회
		@RequestMapping("all_income.multi")
		public void all_income(Model model) {
			List<AccountVO> list = dao.all_income();
			model.addAttribute("list", list);
		}
		// 지출만 날짜순으로 조회
		@RequestMapping("all_expense.multi")
		public void all_expense(Model model) {
			List<AccountVO> list = dao.all_expense();
			model.addAttribute("list", list);
		}
		
		// 수입/지출 수정
		@RequestMapping("update_account.multi")
		public String update_account(AccountVO vo) {
			dao.update(vo);
			return "redirect:account.jsp";
		}
		
		// 수입/지출 삭제
		@RequestMapping("delete_account.multi")
		public String delete_account(AccountVO vo) {
			dao.delete(vo);
			return "redirect:account.jsp";
		}

	/*
	 * @RequestMapping("daylist") public void dayall(AccountVO vo, Model model) {
	 * List<AccountVO> list2 = dao.dayall(vo); model.addAttribute("list2",list2); }
	 * 
	 * @RequestMapping("yeah") public void dayall2(AccountVO vo, Model model) {
	 * List<AccountVO> list4 = dao.dayall2(); model.addAttribute("list4",list4); }
	 */
}
