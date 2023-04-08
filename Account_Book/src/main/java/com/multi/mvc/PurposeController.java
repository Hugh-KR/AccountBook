package com.multi.mvc;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PurposeController {
	@Autowired
	PurposeDAO dao;

	@Autowired
	AccountDAO aDao;

	@Autowired
	SqlSessionTemplate my;

	@RequestMapping("pps.do")
	public String insert(PurposeVO vo, Model model, Model mModel, Model acModel) {
		dao.insert(vo); // 1.입력을 먼저 수행
		int month = vo.getMonth();
		PurposeVO result = dao.search(month); // 2.입력한 값의 달을 다시 받아옴
		System.out.println("수정한 달" + month);
		System.out.println("수정한 결과" + month);
		model.addAttribute("vo", result); // 목표치 테이블을 넘기는 모델
		mModel.addAttribute("mm", month); // 몇월인지 입력받은 값을 넘기는 모델

		List<AccountVO> list = aDao.all(); // account table에 접근하여 데이터를 list로 받아온다
		acModel.addAttribute("acc", list); // 위에서 받아온 account 데이터를 넘기는 모델

		return "pps"; // 입력은 데이터가 무조건 존재하므로 if문을 쓰지 않는다.
	}

	@RequestMapping("update")
	public String update(PurposeVO vo, Model model, Model mModel, Model acModel) {
		dao.update(vo); // 1.업데이트(수정)을 먼저 진행
		int month = vo.getMonth();
		PurposeVO result = dao.search(month); // 2.수정한 값의 달을 다시 받아옴
		System.out.println("수정한 달" + month);
		System.out.println("수정한 결과" + month);
		model.addAttribute("vo", result); // 목표치 테이블을 넘기는 모델
		mModel.addAttribute("mm", month); // 몇월인지 입력받은 값을 넘기는 모델

		List<AccountVO> list = aDao.all(); // account table에 접근하여 데이터를 list로 받아온다
		acModel.addAttribute("acc", list); // 위에서 받아온 account 데이터를 넘기는 모델

		return "pps"; // 수정은 데이터가 무조건 존재하므로 if문을 쓰지 않는다.
	}

	@RequestMapping("delete.do")
	public void delete(PurposeVO vo) {
		dao.delete(vo);
	}

	@RequestMapping("search")
	public String search(PurposeVO vo, AccountVO avo, Model model, Model acModel, Model mModel, int month) {
		PurposeVO result = dao.search(month);
		model.addAttribute("vo", result); // 목표치 테이블
		mModel.addAttribute("mm", month);

		int month2 = vo.getMonth();
		// System.out.println(result);
		if (result != null) { // 해당 달의 데이터가 존재하는 경우 (이번달이 11월일 경우 11월 데이터를 검색- 11월에 해당하는 자료가 있을 경우

			List<AccountVO> list = aDao.all(); // account table에 접근하여 데이터를 list로 받아온다
			acModel.addAttribute("acc", list);
			// System.out.println(list);

			return "pps";
		} else {
			return "uTurn";
		}
	}

//	@RequestMapping("search")
//	public void acSearch(AccountVO vo, Model acModel) {
//		List<AccountVO> list = aDao.all();
//		acModel.addAttribute("list", list);
//	}
}
