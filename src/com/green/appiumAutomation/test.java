package com.green.appiumAutomation;

import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		ArrayList<Integer> empid=new ArrayList<>();
		empid.add(90);
		empid.add(45);
		empid.add(70);
		empid.add(0, 200);
		empid.set(1, 34);
		System.out.println(empid);
		Collections.swap(empid, 0, 3);
		System.out.println(empid);
		
}
}
