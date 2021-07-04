package com.bridgelabz;

public class MyBinaryTreeTest {
	public static void main(String[] args) {
		MyBinaryTree bt = new MyBinaryTree();  
        //Add nodes to the binary tree  
        bt.insert(56);  
        bt.insert(30);  
        bt.insert(70);   
        bt.inorder(bt.root);
	}

}
