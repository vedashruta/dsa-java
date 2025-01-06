package com.data.structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class trees {

	public static class TreeInfo {
		int height;
		int diameter;

		TreeInfo() {
		}

		TreeInfo(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}
	}

	public static class TreeNode {
		int data;
		TreeNode left, right;

		TreeNode() {
		}

		TreeNode(int data) {
			this.data = data;
			this.left = this.right = null;
		}

		// Binary Tree Operations
		static int index = -1;

		public static TreeNode createTree(int[] list) {
			if (list.length == 0) {
				return null;
			}
			index++;
			if (list[index] == -1) {
				return null;
			}
			TreeNode node = new TreeNode(list[index]);
			node.left = createTree(list);
			node.right = createTree(list);
			return node;
		}

		// DFS Traversals
		// InOrder Traversal
		// L->N->R
		public void inOrder(TreeNode root) {
			if (root == null)
				return;
			inOrder(root.left);
			System.out.print(root.data + "->");
			inOrder(root.right);
		}

		// PreOrder Traversal
		// N->L->R
		public void preOrder(TreeNode root) {
			if (root == null)
				return;
			System.out.print(root.data + "->");
			preOrder(root.left);
			preOrder(root.right);
		}

		// PostOrder Traversal
		// L->R->N
		public void postOrder(TreeNode root) {
			if (root == null)
				return;
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "->");

		}

		// LevelOrder Traversal
		public void levelOrder(TreeNode root) {
			if (root == null) {
				return;
			}
			Queue<TreeNode> queue = new LinkedList<>();
			queue.add(root);
			queue.add(null);
			while (!queue.isEmpty()) {
				TreeNode temp = queue.poll();
				if (temp == null) {
					System.out.println();
					if (queue.isEmpty()) {
						break;
					} else {
						queue.add(null);
					}
				} else {
					System.out.print(temp.data + "->");

					if (temp.left != null) {
						queue.add(temp.left);
					}
					if (temp.right != null) {
						queue.add(temp.right);
					}
				}
			}
			System.out.println();
		}

		// Copying a binary tree
		// PreOrder Traversal
		public TreeNode copy(TreeNode root) {
			if (root == null)
				return null;
			TreeNode newNode = new TreeNode(root.data);
			newNode.left = copy(root.left);
			newNode.right = copy(root.right);
			return newNode;
		}

		// Deleting a binary tree
		// PostOrder traversal
		public void delete(TreeNode root) {
			if (root == null)
				return;
			delete(root.left);
			delete(root.right);
			System.out.println(root.data + "->");
			return;

			// Choice 2
			// root = null;
			// return;
		}

		// Check whether two trees are equal
		public boolean isEqual(TreeNode tree1, TreeNode tree2) {
			if (tree1 == null && tree2 == null)
				return true;
			if (tree1 == null || tree2 == null)
				return false;
			if (tree1.data != tree2.data)
				return false;
			return isEqual(tree1.left, tree2.left) && isEqual(tree1.right, tree2.right);
		}

		// Count number of nodes in a binary tree
		// PostOrder traversal
		public int countNodes(TreeNode root) {
			if (root == null)
				return 0;
			int leftCount = countNodes(root.left);
			int rightCount = countNodes(root.right);
			return leftCount + rightCount + 1;
		}

		// Count sum of nodes in a binary tree
		// PostOrder traversal
		public int sumOfNodes(TreeNode root) {
			if (root == null)
				return 0;
			int leftSum = sumOfNodes(root.left);
			int rightSum = sumOfNodes(root.right);
			return leftSum + rightSum + root.data;
		}

		// Height of the tree
		public int height(TreeNode root) {
			if (root == null)
				return 0;
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}

		// Diameter of the tree
		// O(n2) complexity
		public int diameter(TreeNode root) {
			if (root == null)
				return 0;
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);

			int leftDiam = diameter(root.left);
			int rightDiam = diameter(root.right);

			return Math.max((1 + leftHeight + rightHeight), Math.max(leftDiam, rightDiam));
		}

		// Diameter of the tree O(N) Time complexity
		public TreeInfo diameter2(TreeNode root) {
			if (root == null) {
				return new TreeInfo(0, 0);
			}
			TreeInfo left = diameter2(root.left);
			TreeInfo right = diameter2(root.right);
			int height = Math.max(left.height, right.height) + 1;
			int diameter = Math.max(Math.max(left.diameter, right.diameter), left.height + right.height + 1);
			return new TreeInfo(height, diameter);
		}

		// Check is a tree is a subtree of another tree
		public boolean isSubtree(TreeNode root, TreeNode subtree) {
			if (subtree == null) { // null is always a subset of base set
				return true;
			}
			if (root == null) { // if root is null,we need not check if its subset is null
				return false;
			}
			if (root.data == subtree.data) {
				return isIdentical(root, subtree);
			}
			return isIdentical(root.left, subtree.left) || isIdentical(root.right, subtree.right);
		}

		// Check if two trees are identical
		public boolean isIdentical(TreeNode tree1, TreeNode tree2) {
			if (tree1 == null && tree2 == null) { // case : leaf node
				return true;
			}
			if (tree1 == null || tree2 == null) { // case : on tree has leaf & other tree is non-leaf
				return false;
			}
			if (tree1.data == tree2.data) { // case : non-leaf node
				return isIdentical(tree1.left, tree2.left) && isIdentical(tree1.right, tree2.right);
			}
			return false;
		}

		// Sum of Nodes at Kth level
		// Level Order Traversal
		public int sumOfNodesAtKthLevel(TreeNode root, int k) {
			if (root == null) {
				return 0;
			}
			Queue<TreeNode> queue = new LinkedList<>();
			queue.add(root);
			int level = 0;
			boolean flag = false;
			int sum = 0;
			while (!queue.isEmpty()) {
				int size = queue.size();
				while (size-- > 0) {
					TreeNode temp = queue.poll();
					if (level == k) {
						sum += temp.data;
						flag = true;
					} else {
						if (temp.left != null) {
							queue.add(temp.left);
						}
						if (temp.right != null) {
							queue.add(temp.right);
						}
					}
				}
				level++;
				if (flag) {
					break;
				}
			}
			return sum;
		}

		// Root to leaf paths
		// PreOrder Traversal(root to leaf => root/node first) ,there can exists
		// multiple paths
		public void rootToLeafPaths(TreeNode root, ArrayList<Integer> list) {
			if (root == null)
				return;
			list.add(root.data);
			if (root.left == null && root.right == null) {
				System.out.println(list);
			} else {
				rootToLeafPaths(root.left, list);
				rootToLeafPaths(root.right, list);
			}
			list.remove(list.size() - 1);
		}

		// FLattening a binary to a linked list
		// right ptr must point to next node
		// left ptr must be null

		// Solution 1
		public void flatten(TreeNode root) {
			dfs(root);
		}

		public TreeNode dfs(TreeNode root) {
			if (root == null) {
				return root;
			}
			TreeNode left = dfs(root.left);
			TreeNode right = dfs(root.right);
			if (root.left != null) {
				left.right = root.right;
				root.right = root.left;
				root.left = null;
			}
			return right != null ? right : (left != null ? left : root);

		}

		// Solution 2
		private TreeNode prev = null;

		public void flatten2(TreeNode root) {
			if (root == null) {
				return;
			}
			flatten2(root.left);
			flatten2(root.right);
			root.right = prev;
			root.left = null;
			prev = root;
		}

		// Evaluating an boolean expression tree
		public boolean evaluate(TreeNode root) {
			if (root == null) {
				return false;
			}
			switch (root.data) {
			case 0:
				return false;
			case 1:
				return true;
			case 2:
				return evaluate(root.left) || evaluate(root.right);
			case 3:
				return evaluate(root.left) && evaluate(root.right);
			}
			return false;
		}

		// Merging Two Binary tree
		public TreeNode merge(TreeNode root1, TreeNode root2) {
			if (root1 == null) {
				return root2;
			}
			if (root2 == null) {
				return root1;
			}
			int v1 = root1.left != null ? root1.data : 0;
			int v2 = root2.left != null ? root2.data : 0;
			TreeNode res = new TreeNode(v1 + v2);
			res.left = merge(root1.left, root2.left);
			res.right = merge(root1.right, root2.right);
			return res;

		}

		// BST
		// Operations

		// Insert into Binary Search Tree - Recursive way
		public TreeNode insert(TreeNode root, int val) {
			if (root == null) {
				return new TreeNode(val);
			}
			if (val == root.data) {
				return root;
			}
			if (val < root.data) {
				root.left = insert(root.left, val);
			} else {
				root.right = insert(root.right, val);
			}
			return root;
		}

		// Insert into Binary Search Tree - Iterative way
		public TreeNode insertIterative(TreeNode root, int val) {
			TreeNode temp = new TreeNode(val);
			if (root == null) {
				return temp;
			}
			TreeNode parent = null;
			TreeNode cur = root;
			while (cur != null) {
				parent = cur;
				if (val < cur.data) {
					cur = cur.left;
				} else if (val > cur.data) {
					cur = cur.right;
				} else {
					// cur.data == val case
					return root;
				}
			}
			if (val < parent.data) {
				parent.left = temp;
			} else {
				parent.right = temp;
			}
			return root;
		}

		// Insert into Binary Search Tree - Iterative way
		public TreeNode deleteNode(TreeNode root, int val) {
			if (root == null) {
				return root;
			}
			if (val < root.data) {
				root.left = deleteNode(root.left, val);
			} else if (val > root.data) {
				root.right = deleteNode(root.right, val);
			} else {
				// case 1: Deleting a leaf node
				if (root.left == null && root.right == null) {
					return null;
				}
				// case 2: Deleting a node with one child
				// may have left child or a right child
				if (root.left == null) {
					return root.right;
				}
				if (root.right == null) {
					return root.left;
				}
				// case 3: Deleting a node with two children
				TreeNode successor = getInOrderSuccessor(root.right);
				root.data = successor.data;
				root.right = deleteNode(root.right, successor.data);
			}
			return root;
		}

		public TreeNode getInOrderSuccessor(TreeNode root) {
			while (root.left != null) {
				root = root.left;
			}
			return root;
		}

		// Minimum Value in a BST
		public int minimumValue(TreeNode root) {
			if (root == null) {
				return Integer.MAX_VALUE;
			}
			return Math.min(root.data, Math.min(minimumValue(root.left), minimumValue(root.right)));
		}

		// Maximum Value in a BST
		public int maximumValue(TreeNode root) {
			if (root == null) {
				return Integer.MIN_VALUE;
			}
			return Math.max(root.data, Math.max(maximumValue(root.left), maximumValue(root.right)));
		}

		// Maximum Value in a BST
		// Kind of InOrder Traversal
		public void printInRange(TreeNode root, int x, int y) {
			if (root == null) {
				return;
			}
			// case 1 : x<=data<=y
			if (x <= root.data && y >= root.data) {
				printInRange(root.left, x, y);
				System.out.println(root.data);
				printInRange(root.right, x, y);
			}
			// case 2 : x> data
			else if (x >= root.data) {
				printInRange(root.right, x, y);
			}
			// y<data
			else {
				printInRange(root.left, x, y);
			}
		}

		// Kth Smallest element in a binary search tree
		// find kth smallest element
		// k=1=>1st smallest element
		// k=2=>2nd smallest element
		public int kthSmallest(TreeNode root, int k) {
			if (root == null) {
				return -1;
			}
			int n = 0;
			TreeNode cur = root;
			Stack<TreeNode> stack = new Stack<>();
			while (cur != null || !stack.isEmpty()) {
				while (cur != null) {
					stack.push(cur);
					cur = cur.left;
				}
				cur = stack.pop();
				n++;
				if (n == k)
					return cur.data;
				cur = cur.right;
			}
			return -1;
		}
	}
}
