package com.dsalabsolution.service;

import java.util.Stack;

public class Balancingbracket {
	public boolean checkingBracketBalanced(String expression)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<expression.length();i++)
		{
			char character=expression.charAt(i);
			if(character=='(' || character=='[' || character=='{')
			{
				stack.push(character);
				continue;
			}
			if(stack.isEmpty())
				return false;
			
			char c;
			
			switch(character)
			{
			case '}':
				c=stack.pop();
				if(c=='(' || c=='[')
					return false;
				break;
			case ')':
				c=stack.pop();
				if(c=='{' || c=='[')
					return false;
				break;
			case ']':
				c=stack.pop();
				if(c=='{' || c=='(')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}
