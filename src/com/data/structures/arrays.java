package com.data.structures;

public class arrays {
	static int size = 5;
	static int[] array = new int[size];

	public static void insert(int element, int position) {
		if (position > array.length - 1) {
			System.out.println("Index out of bounds");
			return;
		}
		array[position] = element;
		return;
	}

	public static void delete(int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				array[i] = -9999;
			}
		}
	}

	public static void display() {
		System.out.print("[");
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+",");
//		}
		for (int elem : array) {
			System.out.print(elem + ",");
		}
		System.out.print("]");
	}
}
