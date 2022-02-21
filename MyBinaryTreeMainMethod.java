package com.bridgelabz.bst;

public class MyBinaryTreeMainMethod {
	public static void main(String[] arg) {
		 MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
	        myBinaryTree.add(56);
	        myBinaryTree.add(30);
	        myBinaryTree.add(70);
	        int size = myBinaryTree.getSize();
	        System.out.println("Size of binary tree is: " + size);
	        myBinaryTree.print();
	        myBinaryTree.searchKey(30);
	}
}
