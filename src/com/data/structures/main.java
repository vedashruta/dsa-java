package com.data.structures;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrays.size; i++) {
			arrays.insert(i + 1, i);
		}
//		System.out.println("Array Operations");
//		arrays.print(array);
//		System.out.println("\nStack Operations");
//		int []stack = new int[size];
//		stacks.push(stack, 10);
//		stacks.push(stack, 20);
//		stacks.push(stack, 30);
//		stacks.push(stack, 40);
//		stacks.push(stack, 50);
//		stacks.push(stack, 60);
//		
//		stacks.print(stack);
//		System.out.println("\n"+stacks.peek(stack));
//		
//		stacks.pop(stack);
//		stacks.pop(stack);
//		stacks.pop(stack);
//		stacks.pop(stack);
//		stacks.pop(stack);
//		stacks.pop(stack);

//		int n=3;
//		recursion.towerOfHanoi(n, 'A', 'C', 'B');
//		System.out.println(recursion.factorial(3));
//		System.out.println("GCD");
//		System.out.println(recursion.gcd(15,10));
//		
//		System.out.println("Ackermann ");
//		System.out.println(recursion.ackermann(1,2));
//		
//		
//		System.out.println("\nQueue Operations");
//		int []queue = new int[size];
//		queues.enqueue(queue, 90);
//		queues.enqueue(queue, 80);
//		queues.enqueue(queue, 70);
//		queues.enqueue(queue, 60);
//		queues.enqueue(queue, 50);
//		queues.enqueue(queue, 40);
//		
//		
//		queues.print(queue);
//		System.out.println("\n"+queues.peek(queue));
//		
//		System.out.println("\n"+queues.dequeue(queue));
//		System.out.println("\n"+queues.dequeue(queue));
//		System.out.println("\n"+queues.dequeue(queue));
//		System.out.println("\n"+queues.dequeue(queue));
//		System.out.println("\n"+queues.dequeue(queue));
//		System.out.println("\n"+queues.dequeue(queue));

//		System.out.println("\nCircular Queue Operations");
//		queues.circularQueue.print();
//		queues.circularQueue.enqueue(1);
//		queues.circularQueue.enqueue(3);
//		queues.circularQueue.enqueue(5);
//		queues.circularQueue.enqueue(7);
//		queues.circularQueue.enqueue(9);
//		queues.circularQueue.enqueue(11);
//		queues.circularQueue.print();
//		queues.circularQueue.enqueue(13);
//		queues.circularQueue.enqueue(15);
//		queues.circularQueue.print();
//		
//		queues.circularQueue.dequeue();
//		queues.circularQueue.dequeue();
//		queues.circularQueue.dequeue();
//		queues.circularQueue.print();
//		queues.circularQueue.dequeue();
//		queues.circularQueue.dequeue();
//		queues.circularQueue.print();

//		System.out.println("\nLinked List Operations");
//		linkedLists.singleLinkedLists.ListNode head = new linkedLists.singleLinkedLists.ListNode();
//		head.display();
//		head.insertFront(10);
//		head.insertFront(30);
//		head.insertFront(50);
//		head.insertFront(70);
//		head.display();
//		head.insertRear(9);
//		head.insertRear(7);
//		head.insertRear(5);
//		head.display();
//		
//		head.deleteFront();
//		head.deleteFront();
//		head.display();
//		head.deleteRear();
//		head.display();
//		
//		
//		System.out.println(head.search(30));
//		System.out.println(head.getSize());
//		
//		head.deleteRear();
//		head.deleteRear();
//		System.out.println(head.getSize());
//		head.display();
//		head.insertAt(2,20);
//		head.display();
//		head.insertAt(0,98);
//		head.display();
//		System.out.println(head.getSize());
//		
//		head.insertAt(2,69);
//		head.display();
//		head.deleteAt(2);
//		head.display();

//		linkedLists.doublyLinkedLists.ListNode head = new linkedLists.doublyLinkedLists.ListNode();
//		head.display();
//		head.insertFront(10);
//		head.insertFront(30);
//		head.insertFront(50);
//		head.insertFront(70);
//		head.display();
//		head.insertRear(9);
//		head.insertRear(8);
//		head.display();
//		head.deleteFront();
//		head.deleteFront();
//		head.display();
//		head.deleteRear();
//		head.deleteRear();
//		System.out.println(head.getSize());
//		head.display();
//		head.insertAt(0, 20);
//		head.deleteFront();
//		head.display();

		System.out.println("\nTree Operations");
//		int []nodes ={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//		trees.binaryTree tree = new trees.binaryTree();
//		trees.TreeNode root = new trees.TreeNode();
//		
//		root = binaryTree.createTree(nodes);
//		System.out.println(root.data);
//		
//		System.out.println("\nInOrder  Traversal");
//		tree.inOrder(root);
//		System.out.println("\nPreOrder  Traversal");
//		tree.preOrder(root);
//		System.out.println("\nPostOrder  Traversal");
//		tree.postOrder(root);
//		System.out.println("\nLevelOrder  Traversal");
//		tree.levelOrder(root);
//		
//		trees.TreeNode newtree = tree.copy(root);
//		System.out.println("\nIs Equal " + tree.isEqual(root, newtree));
//		tree.delete(newtree);
//		
//		System.out.println("\nNode Count : " + tree.countNodes(root));
//		System.out.println("\nSum of Nodes : " + tree.sumOfNodes(root));
//		System.out.println("\nHeight of the tree : " + tree.height(root));
//		
//		System.out.println("\nSubtree : " + tree.isSubtree(root,newtree));
//		System.out.println("\nDiameter : " + tree.diameter(root));
//		System.out.println("\nDiameter : " + tree.diameter2(root).diameter);
//		
//		System.out.println("\nSum Of Node at Kth level : " + tree.sumOfNodesAtKthLevel(root, 2));
//		ArrayList<Integer>paths = new ArrayList<Integer>();
//		System.out.println("\nRoot To Leaf Paths : ");
//		tree.rootToLeafPaths(root, paths);

		int[] nodes = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
		trees.TreeNode root = new trees.TreeNode(nodes[0]);
		for (int i = 1; i < nodes.length; i++) {
			root.insert(root, nodes[i]);
		}
//		root.inOrder(root);
//		System.out.println();
//		root.deleteNode(root, 10);
//		System.out.println();
//		root.inOrder(root);
//		System.out.println();
//		System.out.println("Minumum Value: " + root.minimumValue(root));
//		System.out.println("Maximum Value: " + root.maximumValue(root));
//		root.printInRange(root, 6, 14);
		System.out.println(root.kthSmallest(root, 3));
	}
}
