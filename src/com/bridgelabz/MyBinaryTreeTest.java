package com.bridgelabz;

public class MyBinaryTreeTest {
	public static void main(String[] args) {
		MyBinaryTree mbt = new MyBinaryTree();  
        mbt.insert(56);  
        mbt.insert(30);  
        mbt.insert(70); 
        mbt.insert(22);  
        mbt.insert(40); 
        mbt.insert(11);  
        mbt.insert(3); 
        mbt.insert(16);  
        mbt.insert(60);
        mbt.insert(95);  
        mbt.insert(65);
        mbt.insert(63);  
        mbt.insert(67); 
        mbt.inorder(mbt.root);
	}

}
