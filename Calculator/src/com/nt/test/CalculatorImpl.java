package com.nt.test;


public class CalculatorImpl implements Calculate {

	@Override
	public int add(int fno, int sno) {
		return fno+sno;
	}

	@Override
	public int sub(int fno, int sno) {
		return fno-sno;
	}

}
