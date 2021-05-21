package com.wipro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Address {

	private String address1;
	private String address2;
	private static List<Integer> pincodes;
	
	public static void main(String[] args) {
		
		pincodes = new ArrayList<Integer>();
//		pincodes.stream().distinct().collect(Collectors.toList());
		
		pincodes.stream().findAny();
	}
	
	
}
