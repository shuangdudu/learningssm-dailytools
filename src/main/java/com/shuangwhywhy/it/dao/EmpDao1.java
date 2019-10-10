package com.shuangwhywhy.it.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.shuangwhywhy.it.entity.Condition;
import com.shuangwhywhy.it.entity.Emp;




@Repository
public interface EmpDao1 {
	List<Emp> findAll();
	List<Emp> findByDept(Condition cond);
}
