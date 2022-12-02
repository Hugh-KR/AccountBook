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
	
	// 수입/지출 추가
	@RequestMapping("insert_account.multi")
	public String insert(AccountVO vo) {
		dao.insert(vo);
		return "redirect:account.jsp";
	}
	
	// 전체 출력
	@RequestMapping("all.multi")
	public void all(Model model) {
		List<AccountVO> list = dao.all();
		model.addAttribute("list", list);
	}
	
	// 수입 목록 전체 출력
	@RequestMapping("all_income.multi")
	public void all_income(Model model) {
		List<AccountVO> list = dao.all_income();
		model.addAttribute("list", list);
	}
	
	// 지출 목록 전체 출력
	@RequestMapping("all_expense.multi")
	public void all_expense(Model model) {
		List<AccountVO> list = dao.all_expense();
		model.addAttribute("list", list);
	}
}