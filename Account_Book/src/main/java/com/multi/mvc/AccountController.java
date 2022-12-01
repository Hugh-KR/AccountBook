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
	
	@RequestMapping("all")
	public void all(Model model) {
		List<AccountVO> list = dao.readAll();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
}
