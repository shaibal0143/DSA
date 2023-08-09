package javaProgram.DSA;
import java.util.*;

public class binaryTree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree {
        static int idx=-1;
        public static Node buildtree(int nodes[]){
             idx++;
             if(nodes[idx]==-1){
                return null;
             }
             Node newNode=new Node(nodes[idx]);
             newNode.left=buildtree(nodes);
             newNode.right=buildtree(nodes);
             return newNode;
        }
    } 
    //Traversel in binary tree using Preorder method
    //Time complexity-O(n)
    public static void preorder(Node root){
       if(root==null){
        return;
       } 
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree Tree=new BinaryTree();
        Node Root=Tree.buildtree(nodes);
        System.out.println(Root.data);
        preorder(Root);
        inorder(Root);
    }

}
