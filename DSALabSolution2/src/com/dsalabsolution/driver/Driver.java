package com.dsalabsolution.driver;

import java.util.ArrayList;

import com.dsalabsolution.model.Node;
import com.dsalabsolution.service.Findlongestpath;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(100);
		root.left=new Node(20);
		root.right=new Node(130);
		root.left.left=new Node(10);
		root.left.right=new Node(50);
		root.right.left=new Node(110);
		root.right.right=new Node(140);
		root.left.left.left=new Node(5);
		
		Findlongestpath result=new Findlongestpath();
		
		ArrayList<Integer> output=result.findLongestPath(root);
		int size=output.size();
		for(int i=size-1;i >= 0;i--)
		{
			System.out.print(output.get(i));
			if(i!=0)
				System.out.print("->");
		}
	}

}
