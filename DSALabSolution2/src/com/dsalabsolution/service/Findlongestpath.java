package com.dsalabsolution.service;

import java.util.ArrayList;

import com.dsalabsolution.model.Node;

public class Findlongestpath {

	public ArrayList<Integer> findLongestPath(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			ArrayList<Integer> output=new ArrayList<>();
			return output;
		}
		ArrayList<Integer> rightArray =findLongestPath(root.right);
		ArrayList<Integer> leftArray =findLongestPath(root.left);
		
		if(rightArray.size() < leftArray.size())
		{
			leftArray.add(root.getData());
		}else {
			rightArray.add(root.getData());
		}
		return (leftArray.size() > rightArray.size() ? leftArray : rightArray);
	}

}
