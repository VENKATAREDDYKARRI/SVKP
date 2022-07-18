package com.tnsif.svkpdemo;

import java.util.Scanner;

public class Positiveornegitive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input number: ");
		int input = in.nextInt();
		if(input>0)
		{
			System.out.println("number is positive");
		}
		else if(input<0)
		{
			System.out.println("number is negitive");
		}
		else
		{
			System.out.println("number is zero");
		}
	
	}

}
