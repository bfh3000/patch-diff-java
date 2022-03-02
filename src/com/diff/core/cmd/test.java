package com.diff.core.cmd;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<Stuent> a = new ArrayList<Stuent>();
		Stuent tmp1 = new Stuent();
		tmp1.setId("1");
		tmp1.setName("1번 이름");
		
		Stuent tmp2 = new Stuent();
		tmp2.setId("1");
		tmp2.setName("2번 이름");
		
		a.add(tmp1);
		a.add(tmp2);
		
		
		System.out.println(a.indexOf("1"));
		
	}
}
