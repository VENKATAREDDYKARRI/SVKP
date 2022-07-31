package com.tnsif.lambdaexpressions;
@FunctionalInterface
 interface operator{
	public int operate (int num1,int num2);
	}

public class operatorDemo {

	public static void main(String[] args) {
		operator op = (num1,num2)->num1+num2;
		int sum = op.operate(10,20);
		System.out.println("sum:"+sum);

	}

}
