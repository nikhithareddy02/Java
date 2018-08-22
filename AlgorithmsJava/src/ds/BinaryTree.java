package ds;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings({ "rawtypes" })
class Node<E>{
	E data;
	Node left, right;

	public Node(E item){
		data = item;
		left = right = null;
	}
	/*public E getData() {
    	return this.data;
    }
    public void setData(E data) {
    	this.data = data;
    }*/
}
@SuppressWarnings("unchecked")
public class BinaryTree<E> {
	// Root of Binary Tree
	Node<E> root;

	// Constructors
	BinaryTree(E data){
		root = new Node<E>(data);
	}

	BinaryTree(){
		root = null;
	}
	public int numberOfNodes(Node<E> node) {
		int lnodes = node.left == null ? 0 : numberOfNodes(node.left);
		int rnodes = node.right == null ? 0 : numberOfNodes(node.right);
		return lnodes + rnodes + 1;
	}
	public int height(Node<E> node) {
		if(node == null) {
			return 0;
		}
		int ldepth = height(node.left);
		int rdepth = height(node.right);
		return ldepth > rdepth ? ldepth+1 : rdepth+1;
	}
	///Inserting Level Order from array
	public Node<E> buildTreeFromArray(BinaryTree<E> tree,E[] array) {
		tree = new BinaryTree<E>();
		return insertNode(array, tree.root, 0);
	}
	public Node<E> insertNode(E[] array,Node<E> root,int i) {
		if(i<array.length) {
			Node<E> temp = new Node<E>(array[i]);
			root = temp;
			//Inserting left Node
			root.left = insertNode(array, root.left, 2*i+1);
			//Inserting Right Node
			root.right = insertNode(array, root.right, 2*i+2);
		}
		return root;
	}
	/*Insert an element to Binary Tree*/
	//Non recursive
	public void insertElement(Node<E> node,E element) {
		if(node == null) {
			node = new Node(element);
		}
		else {
			Queue<Node<E>> q = new LinkedList<Node<E>>();
			Node<E> temp;
			q.add(node);
			while(!q.isEmpty()) {
				temp = q.poll();
				if(temp.left != null) {
					q.add(temp.left);
				}
				else {
					temp.left = new Node(element);
					return;
				}
				if(temp.right !=null) {
					q.add(temp.right);
				}
				else {
					temp.right = new Node(element);
					return;
				}
			}
		}
	}
	/* Given a binary tree, print its nodes in Level order*/
	void printLevelorder(Node<E> node)
	{
		if (node == null)
			return;
		int h = height(node);
		System.out.println("\nLevel Order Left to Right");
		for(int i = 1;i<=h;i++) {
			printLevelLeftToRight(node, i);
			System.out.println();
		}
		System.out.println("\nLevel Order Right to Left");
		for(int i = 1;i<=h;i++) {
			printLevelRightToLeft(node, i);
			System.out.println();
		}
		Boolean flag = true;
		System.out.println("\nLevel Order Spiral");
		for(int i = 1;i<=h;i++) {
			printLevelOrderSpiral(node,i,flag);
			flag = !flag;
			System.out.println();
		}

	}
	//Level Order Right to Left
	void printLevelLeftToRight(Node<E> node,int level) {
		if(node == null) {
			return;
		}
		if(level == 1) {
			System.out.print(node.data+"  ");
		}
		else {
			printLevelLeftToRight(node.left,level-1);
			printLevelLeftToRight(node.right,level-1);
		}
	}
	//Level Order Right to Left
	void printLevelRightToLeft(Node<E> node,int level) {
		if(node == null) {
			return;
		}
		if(level == 1) {
			System.out.print(node.data+"  ");
		}
		else {
			printLevelRightToLeft(node.right,level-1);
			printLevelRightToLeft(node.left,level-1);
		}
	}
	//Level Order Spiral
	void printLevelOrderSpiral(Node<E> node,int level,Boolean flag) {
		if(node == null) {
			return;
		}
		if(level == 1) {
			System.out.print(node.data+"  ");
		}
		else if(level > 1) { 
			if(flag) {
				printLevelOrderSpiral(node.left,level-1,flag);
				printLevelOrderSpiral(node.right,level-1,flag);
			}else {
				printLevelOrderSpiral(node.right,level-1,flag);
				printLevelOrderSpiral(node.left,level-1,flag);
			}
		}
	}
	/* Given a binary tree, print its nodes in Post order (Left, Right, Root)*/
	void printPostOrder(Node<E> node)
	{
		if (node == null)
			return;
		/* first recur on left child */
		printPostOrder(node.left); 
		/* now recur on right child */
		printPostOrder(node.right);
		/* then print the data of node */
		System.out.print(node.data + " ");
	}
	/* Given a binary tree, print its nodes in Pre order (Root, Left, Right) */
	void printPreOrder(Node<E> node)
	{
		if (node == null)
			return;
		/* then print the data of node */
		System.out.print(node.data + " ");
		/* first recur on left child */
		printPreOrder(node.left); 
		/* now recur on right child */
		printPreOrder(node.right);
	}
	/* Given a binary tree, print its nodes in In order (Left, Root, Right)*/
	void printInorder(Node<E> node)
	{
		if (node == null)
			return;
		/* first recur on left child */
		printInorder(node.left); 
		/* then print the data of node */
		System.out.print(node.data + " ");
		/* now recur on right child */
		printInorder(node.right);
	}
	/**/
	public static void main(String[] args) {
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.root = new Node<String>("1");
		tree.root.left = new Node<String>("2");
		tree.root.right = new Node<String>("3");
		tree.root.left.left = new Node<String>("4");
		tree.root.left.right = new Node<String>("5");
		tree.root.right.left = new Node<String>("6");
		tree.root.right.right = new Node<String>("7");
		tree.root.left.left.left = new Node<String>("8");
		tree.root.left.left.right = new Node<String>("9");
		tree.root.left.right.left = new Node<String>("10");
		tree.root.left.right.right = new Node<String>("11");
		//tree.printTree();
		System.out.println("Height : "+tree.height(tree.root));
		System.out.println("In Order");
		tree.printInorder(tree.root);
		System.out.println("\nPost Order");
		tree.printPostOrder(tree.root);
		System.out.println("\nPre Order");
		tree.printPreOrder(tree.root);
		System.out.println("\n******************Level Order***************");
		tree.printLevelorder(tree.root);
		
		BinaryTree<Character> t = new BinaryTree<Character>();
		Character[] array = {'a','b','c','d','e','f','g'};
		t.root = t.buildTreeFromArray(t, array);
		System.out.println("Height : "+t.height(t.root));
		System.out.println("Number of Nodes " + t.numberOfNodes(t.root));
		System.out.println("In Order");
		t.printInorder(t.root);
		System.out.println("\nPost Order");
		t.printPostOrder(t.root);
		System.out.println("\nPre Order");
		t.printPreOrder(t.root);
		System.out.println("\nLevel Order");
		t.printLevelorder(t.root);
		System.out.println("\n******************Adding an Element to Tree***************");
		t.insertElement(t.root, 'h');
		System.out.println("Number of Nodes " + t.numberOfNodes(t.root));
		System.out.println("In Order");
		t.printInorder(t.root);
		System.out.println("\nPost Order");
		t.printPostOrder(t.root);
		System.out.println("\nPre Order");
		t.printPreOrder(t.root);
		System.out.println("\nLevel Order");
		t.printLevelorder(t.root);
	}
}
