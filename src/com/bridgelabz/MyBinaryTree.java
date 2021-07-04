package com.bridgelabz;

import java.util.*;
import java.io.*;

public class MyBinaryTree 
{
 Node root;
 
 public void insert(int data) 
 {  
    
     Node newNode = new Node(data);  

       
     if(root == null)
       {  
         root = newNode;  
         return;  
       }  
     else
       {     
         Node current = root, parent = null;  

         while(true) 
         {              
             parent = current;  
             if(data < current.data) 
             {  
                 current = current.left;  
                 if(current == null) 
                 {  
                     parent.left = newNode;  
                     return;  
                 }  
             }             
             else 
             {  
                 current = current.right;  
                 if(current == null) 
                 {  
                     parent.right = newNode;  
                     return;  
                 }  
             }  
         }  
     }  
 }
 
public void inorder(Node node) 
  {  
	   
    if(root == null)
    {  
        System.out.println("The Tree is empty");  
        return;  
     }  
    else 
    {  

        if(node.left!= null)  
            inorder(node.left);  
        System.out.print(node.data + " ");  
        if(node.right!= null)  
            inorder(node.right);  

    }  
  }
}