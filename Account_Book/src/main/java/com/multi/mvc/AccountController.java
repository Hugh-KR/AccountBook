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
	
	
	@RequestMapping("statistics")	
	public void all(AccountVO vo, Model model) {
		List<AccountVO> list = dao.all();
		model.addAttribute("list",list);	
	}
	
	@RequestMapping("daylist")
	public void dayall(AccountVO vo, Model model) {
		List<AccountVO> list= dao.dayall(vo);
		System.out.print(list);
		model.addAttribute("list", list);
	}
	
}
