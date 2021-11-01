package com.practice.algorithm;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		BubbleSort sort = new BubbleSort();
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		
		System.out.println("enter numbers to sort");
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();	
		}
		
		System.out.println("Array before sorting");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		// calling bubble sort method
		sort.bubbleSort( array);
		System.out.println("Array after sorting");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

	//sorting  method to sort the given array
	public void bubbleSort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}