package com.shuangwhywhy.it.test;

import com.shuangwhywhy.it.basic.Sex;
import com.shuangwhywhy.it.basic.WeekDay;

public class TestEnum {
	public static void main(String[] args) {
//		Sex sex = ;
//		System.out.println(Sex.Man.getType());
		System.out.println(WeekDay.MONDAY);
		System.out.println(WeekDay.MONDAY.getCode());
		System.out.println(WeekDay.MONDAY.getName());
	}
}
