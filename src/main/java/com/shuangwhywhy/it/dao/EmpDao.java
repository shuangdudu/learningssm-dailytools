package com.shuangwhywhy.it.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.shuangwhywhy.it.entity.Condition;
import com.shuangwhywhy.it.entity.Emp;


public interface EmpDao {
	List<Emp> findAllEmp();

	List<Emp> findByDept1(Integer deptno);

	List<Emp> findBySalary(Emp emp);

	List<Emp> findByDeptAndSalary(Condition con);

	int updateByDeptno(Emp emp);

	List<Emp> findByDeptnoAndEname(Condition con);

	List<Emp> findByIds(List<Integer> empnos);
}
