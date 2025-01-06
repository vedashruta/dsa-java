package com.data.structures;

public class stacks {
	static int top = -1;
	static int size = 5;
	static int[] stack = new int[size];

	static boolean isFull() {
		return top == size - 1;
	}

	static boolean isEmpty() {
		return top == -1;
	}

	static void push(int element) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = element;
	}

	static int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -9999;
		}
		int element = stack[top];
		top--;
		return element;
	}

	static void display() {
		System.out.print("[");
		for (int i = 0; i <= top; i++) {
			System.out.print(stack[i] + ",");
		}
		System.out.print("]");
	}

	static int peek(int[] stack) {
		return stack[top];
	}
}
