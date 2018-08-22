package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeMoreFunctions {
	@SuppressWarnings("unchecked")
	/* Given a binary tree, print its nodes in In order (Left, Root, Right)*/
	public static <E> void inOrderNonRecursive(Node<E> node) {
		Stack<Node<E>> s = new Stack<Node<E>>();
		ArrayList<E> data = new ArrayList<E>();
		while(true) {
			if(node != null) {
				s.push(node);
				node = node.left;
			}
			else {
				if(s.isEmpty()) {
					break;
				}
				node = s.pop();
				data.add(node.data);
				node = node.right;
			}
		}
		System.out.println(data.toString());
	}
	/* Given a binary tree, print its nodes in Pre order (Root, Left, Right) */
	@SuppressWarnings("unchecked")
	public static <E> void preOrderNonRecursive(Node<E> node) {
		Stack<Node<E>> s = new Stack<Node<E>>();
		ArrayList<E> data = new ArrayList<E>();
		s.push(node);
		while(!s.isEmpty()) {
			node = s.pop();
			data.add(node.data);
			if(node.right != null) {
				s.push(node.right);
			}
			if(node.left!=null) {
				s.push(node.left);
			}
		}
		System.out.println(data.toString());
	}
	/* Given a binary tree, print its nodes in Post order (Left, Right, Root)*/
	//Using Two Stacks
	@SuppressWarnings("unchecked")
	public static <E> void postOrderNonRecursive(Node<E> node) {
		Stack<Node<E>> s = new Stack<Node<E>>();
		Stack<Node<E>> s2 = new Stack<Node<E>>();
		Node<E> temp;
		s.push(node);
		while(!s.isEmpty()) {
			temp = s.pop();
			s2.push(temp);
			if(temp.left != null) {
				s.push(temp.left);
			}
			if(temp.right != null){
				s.push(temp.right);
			}
		}
		while(!s2.isEmpty()) {
			System.out.print(s2.pop().data + "  ");
		}
		System.out.println();
	}
	/* Given a binary tree, print its nodes in Level Order*/
	@SuppressWarnings("unchecked")
	public static <E> void levelOrderNonRecursive(Node<E> node) {
		Node<E> temp;
		Queue<Node<E>> q = new LinkedList<Node<E>>();
		ArrayList<E> data = new ArrayList<E>();
		q.add(node);
		while(!q.isEmpty()) {
			temp = q.poll();
			data.add(temp.data);
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
		System.out.println(data.toString());
	}
	public static void main(String[] args) {
		BinaryTree<Character> t = new BinaryTree<Character>();
		Character[] array = {'a','b','c','d','e','f','g'};//,'h','i','j','k','l','m','n','o'};
		t.root = t.buildTreeFromArray(t, array);
		System.out.println(t.height(t.root));
		System.out.println("In Order");
		inOrderNonRecursive(t.root);
		System.out.println("Post Order");
		postOrderNonRecursive(t.root);
		System.out.println("Pre Order");
		preOrderNonRecursive(t.root);
		System.out.println("Level Order");
		levelOrderNonRecursive(t.root);
	}
}
//Print Array like Binary Tree
/*int power = 0;
for (int i = 0; i < data.size(); i++) {
	System.out.print(data.get(i)+"  ");
	if(Library.power(2,power) == i) {
		System.out.println();
		power += 1;
	}
}
System.out.println();*/
