package com.multi.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("update_account.multi")
	public String update_account(AccountVO vo) {
		dao.update(vo);
		return "redirect:account.jsp";
	}
	
	@RequestMapping("delete_account.multi")
	public String delete_account(AccountVO vo) {
		dao.delete(vo);
		return "redirect:account.jsp";
	}
	/*
	 * @RequestMapping("view_update.multi") public void
	 * update(@RequestParam(value="paydate") String
	 * paydate, @RequestParam(value="payselect") String
	 * payselect, @RequestParam(value="category") String
	 * category, @RequestParam(value="memo") String
	 * memo, @RequestParam(value="amount") String amount, Model model) {
	 * System.out.println(paydate); System.out.println(payselect);
	 * System.out.println(category); System.out.println(memo);
	 * System.out.println(amount); String paydate2 = paydate; String payselect2 =
	 * payselect; String category2 = category; String memo2 = memo; int amount2 =
	 * Integer.parseInt(amount); List<AccountVO> list = {paydate2, payselect2,
	 * category2, memo2, amount2}; AccountVO vo = new AccountVO();
	 * vo.setPaydate(paydate); vo.setPayselect(payselect); vo.setCategory(category);
	 * vo.setMemo(memo); vo.setAmount(Integer.parseInt(amount.replace(",", ""))); //
	 * 금액에 , 붙어있으므로 공백으로 바꿔준 다음 int로 변환 model.addAttribute("list", vo);
	 * 
	 * AccountVO vo = null; vo.setPaydate(paydate); vo.setPayselect(payselect);
	 * vo.setCategory(category); vo.setMemo(memo);
	 * vo.setAmount(Integer.parseInt(amount));
	 * 
	 * List<AccountVO> list = dao.all_click(vo); model.addAttribute("list", list);
	 * 
	 * }
	 */
}