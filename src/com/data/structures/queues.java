package com.data.structures;

public class queues {

	public class linearQueue{
		static int size = 5;
		static int front = 0;
		static int rear = -1;
		static int[]array = new int[size];
		
		public static boolean isFull() {
			return rear == size-1;
		}
		
		public static boolean isEmpty() {
			return rear == -1;
		}
		
		public static void enqueue(int element) {
			if (isFull()) {
				System.out.println("Queue Overflow");
				return;
			}
			rear++;
			array[rear]=element;
		}
		
		public static int dequeue() {
			if (isEmpty()) {
				System.out.println("Queue Underflow");
				return -99999;
			}
			int element = array[front];
			front ++;
			return element;
		}
		
		public static int peek(int []array) {
			return array[front];
		}
		
		public static void display(int []array) {
			System.out.print("[");
			for (int e : array) {
				System.out.print(e+",");
			}
			System.out.print("]");
		}
	}
	
	public class circularQueue{
		static int size = 5;
		static int rear = -1;
		static int front = -1;
		static int []array = new int[size];
		
		public static boolean isFull() {
			return (rear+1)%size == front;
		}
		
		public static boolean isEmpty() {
			return front == -1;
		}
		
		static void enqueue(int element) {
			if (isFull()) {
				System.out.println("Queue is Full");
				return;
			}
			if (isEmpty()) {
				front =0;
			}
			rear = (rear+1)%size;
			array[rear]=element;
		}
		
		static int dequeue() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -99999;
			}
			int element;
//			Single element case
			element = array[front];
			if (front == rear) {
				front = -1;
				rear =-1;
				return element;
			}
			element = array[front];
			front = (front+1)%size;
			return element;		
		}
		
		static int peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return array[rear];
		}
		
		static void display() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return;
			}
			System.out.print("[");
			for (int i = front;i<=rear;i++) {
				System.out.print(array[i]+",");
			}
			System.out.print("]");
		}
	}
}
