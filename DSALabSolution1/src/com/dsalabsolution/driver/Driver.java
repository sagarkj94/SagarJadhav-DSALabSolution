package com.dsalabsolution.driver;

import java.util.Scanner;

import com.dsalabsolution.service.Balancingbracket;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String bracketExpression="([[{}]])";
		Boolean result;
		Balancingbracket br=new Balancingbracket();
		if(!bracketExpression.isEmpty())
			result=br.checkingBracketBalanced(bracketExpression);
		else
			result=false;
		if(result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}
}
