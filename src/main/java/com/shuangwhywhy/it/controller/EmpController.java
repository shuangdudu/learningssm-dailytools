package com.shuangwhywhy.it.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shuangwhywhy.it.dao.EmpDao;
import com.shuangwhywhy.it.entity.Emp;


@Controller
@RequestMapping("/emp")
public class EmpController {
	@Resource
	private EmpDao dao;
	@RequestMapping("/findEmp.do")	
	public String find(Model model){
//		List<Emp> emps = empService.searchAllEmp();
		List<Emp> list = dao.findAllEmp();
		model.addAttribute("emps",list);
		return "emp_list";
	}
	@RequestMapping("/reqParameter.do")
	public Map<String,Object>testRequestParameter(Emp emp){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		return resultMap;
	}
}
