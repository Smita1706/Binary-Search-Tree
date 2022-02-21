package com.bridgelabz.bst;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key){
		this.root = this.addRecursively(root,key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if(current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0)
			return current;
		if (compareResult < 0){
			current.left = addRecursively(current.left, key);

		}else{
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize(){
		return this.getSizeRecursively(root);
	}
	private int getSizeRecursively(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
	}
	public void print() {
		printRec(root);
	}
	void printRec(MyBinaryNode<K> root) {
		if(root != null) {
			printRec(root.left);
			System.out.println(root.key);
			printRec(root.right);
		}
	}
	public void searchKey(K key) {
		MyBinaryNode<K> tempNode = root;
		this.searchRecursively(tempNode, key);

	}
	private MyBinaryNode<K> searchRecursively(MyBinaryNode<K> current, K key) {
		if(current == null)
			System.out.println("Element " + key + " is not present in binary tree");
		else if(current.key.compareTo(key) == 0) {
			System.out.println("Element " + key + " is present in binary tree");
			return current;
		}
		else if(current.key.compareTo(key) > 0)
			return searchRecursively(current.left, key);
		else
			return searchRecursively(current.right, key);
		return current;
   
	}

}
