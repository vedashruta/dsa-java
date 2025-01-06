package com.data.structures;

public class linkedLists {

	public static class singleLinkedLists {
		static ListNode head;
		static int size = 0;

		public static class ListNode {
			int val;
			ListNode next;

			ListNode() {
			}

			ListNode(int val) {
				this.val = val;
				this.next = null;
			}

			public void insertFront(int element) {
				ListNode newNode = new ListNode(element);
				size++;
				if (head == null) {
					head = newNode;
					return;
				}
				newNode.next = head;
				head = newNode;
				return;
			}

			public void insertRear(int element) {
				ListNode newNode = new ListNode(element);
				size++;
				if (head == null) {
					head = newNode;
					return;
				}
				ListNode cur = head;
				while (cur.next != null) {
					cur = cur.next;
				}
				cur.next = newNode;
				return;
			}

			public void display() {
				if (head == null) {
					System.out.println("List is empty");
				}
				ListNode cur = head;
				while (cur != null) {
					System.out.print(cur.val);
					System.out.print("->");
					cur = cur.next;
				}
				System.out.print("null");
				System.out.println("");
			}

			public void deleteFront() {
				if (head == null) {
					System.out.println("List is empty");
					return;
				}
				size--;
				head = head.next;
				return;
			}

			public void deleteRear() {
				if (head == null) {
					System.out.println("List is empty");
					return;
				}
				size--;
				if (head.next == null) {
					head.next = null;
					return;
				}
				ListNode cur = head;
				while (cur.next.next != null) {
					cur = cur.next;
				}
				cur.next = null;
				return;
			}

			public int search(int element) {
				if (head == null) {
					System.out.println("List is empty");
					return -1;
				}
				ListNode cur = head;
				int pos = 0;
				while (cur != null) {
					pos++;
					if (cur.val == element) {
						return pos;
					}
					cur = cur.next;
				}
				return -1;
			}

			public int getSize() {
				return size;
			}

			public void insertAt(int pos, int element) {
				if (pos < 0 || pos > getSize()) {
					System.out.println("Cannot insert at the given positions");
				}
				if (pos == 0) {
					insertFront(element);
					return;
				}
				if (pos == getSize()) {
					insertRear(element);
					return;
				}
				size++;
				ListNode newNode = new ListNode(element);
				ListNode cur = head;
				for (int i = 0; i < pos - 1; i++) {
					cur = cur.next;
				}
				newNode.next = cur.next;
				cur.next = newNode;
			}

			public void deleteAt(int pos) {
				if (pos < 0 || pos > getSize() + 1) {
					System.out.println("Cannot delete at the given positions");
				}
				if (pos == 0) {
					deleteFront();
					return;
				}
				if (pos == getSize() - 1) {
					deleteRear();
					return;
				}
				size--;
				ListNode cur = head;
				for (int i = 0; i < pos - 1; i++) {
					cur = cur.next;
				}
				cur.next = cur.next.next;
				return;
			}

			public boolean exists(int element) {
				if (head == null) {
					System.out.println("List is empty");
					return false;
				}
				ListNode cur = head;
				while (cur != null) {
					if (cur.val == element) {
						return true;
					}
					cur = cur.next;
				}
				return false;
			}

		}

	}

	public static class doublyLinkedLists {
		static ListNode head;
		static int size = 0;

		public static class ListNode {
			int val;
			ListNode next;
			ListNode prev;

			ListNode() {
			}

			ListNode(int val) {
				this.val = val;
				this.next = null;
				this.prev = null;
			}

			public void insertFront(int element) {
				ListNode newNode = new ListNode(element);
				size++;
				if (head == null) {
					head = newNode;
					return;
				}
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
				return;
			}

			public void insertRear(int element) {
				ListNode newNode = new ListNode(element);
				size++;
				if (head == null) {
					head = newNode;
					return;
				}
				ListNode cur = head;
				while (cur.next != null) {
					cur = cur.next;
				}
				cur.next = newNode;
				newNode.prev = cur;
				return;
			}

			public void deleteFront() {
				if (head == null) {
					System.out.println("List is empty");
					return;
				}
				size--;
				if (head.next == null && head.prev == null) {
					head =  null;
					return;
				}
				head = head.next;
				head.prev = null;
				return;
			}

			public void deleteRear() {
				if (head == null) {
					System.out.println("List is empty");
					return;
				}
				size--;
				if (head.next == null && head.prev == null) {
					head = null;
					return;
				}
				ListNode cur = head;
				while (cur.next != null) {
					cur = cur.next;
				}
				cur.prev.next = null;
				cur.prev = null;
				return;
			}

			public void display() {
				if (head == null) {
					System.out.println("List is empty");
				}
				ListNode cur = head;
				System.out.print("null");
				while (cur != null) {
					System.out.print("<->");
					System.out.print(cur.val);
					cur = cur.next;
				}
				System.out.print("<->null");
				System.out.println("");
			}

			public int search(int element) {
				if (head == null) {
					System.out.println("List is empty");
					return -1;
				}
				ListNode cur = head;
				int pos = 0;
				while (cur != null) {
					pos++;
					if (cur.val == element) {
						return pos;
					}
					cur = cur.next;
				}
				return -1;
			}

			public int getSize() {
				return size;
			}

			public void insertAt(int pos, int element) {
				if (pos < 0 || pos > getSize() + 1) {
					System.out.println("Cannot insert at the given positions");
				}
				if (pos == 0) {
					insertFront(element);
					return;
				}
				if (pos == getSize()) {
					insertRear(element);
					return;
				}
				size++;
				ListNode newNode = new ListNode(element);
				ListNode cur = head;
				for (int i = 0; i < pos - 1; i++) {
					cur = cur.next;
				}
				newNode.next = cur.next;
				if (cur.next != null) { // Update the previous pointer of the node after the new node
					cur.next.prev = newNode;
				}
				cur.next = newNode; // Link 'cur' to the new node
				newNode.prev = cur;
			}

			public void deleteAt(int pos) {
				if (pos < 0 || pos > getSize() + 1) {
					System.out.println("Cannot delete at the given positions");
				}
				if (pos == 0) {
					deleteFront();
					return;
				}
				if (pos == getSize() - 1) {
					deleteRear();
					return;
				}
				size--;
				ListNode cur = head;
				for (int i = 0; i < pos - 1; i++) {
					cur = cur.next;
				}
				cur.next = cur.next.next;
				return;
			}

			public boolean exists(int element) {
				if (head == null) {
					System.out.println("List is empty");
					return false;
				}
				ListNode cur = head;
				while (cur != null) {
					if (cur.val == element) {
						return true;
					}
					cur = cur.next;
				}
				return false;
			}

		}

	}
}
