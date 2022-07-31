package com.tnsif.lambdaexpressions;

import java.time.LocalDate;
import java.util.function.Function;

public class Functionaldemo {

	public static void main(String[] args) {
		Function<LocalDate,Integer>yearRetriever=date->date.getYear();
		LocalDate today=LocalDate.now();
		System.out.println("year corresponding to"+today+"is"+yearRetriever.apply(today));

	}

}
