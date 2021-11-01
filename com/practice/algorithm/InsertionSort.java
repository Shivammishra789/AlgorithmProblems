package com.practice.algorithm;

import java.util.Scanner;

public class InsertionSort {


	public static void main(String[] args) {

		InsertionSort sort = new InsertionSort();

		Scanner sc = new Scanner(System.in);

		String[] array = new String[5];

		System.out.println("enter words to sort");
		for(int i=0;i<array.length;i++) {
			array[i] = sc.next();	
		}

		System.out.println("Array before sorting");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();

		// calling insertionSort sort method
		sort.insertionSort( array);
		System.out.println("Array after sorting");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

	//sorting  method to sort the given array
	public void insertionSort(String[] arr) {
		int length = arr.length ;
		for(int i = 1 ; i < length ; i++ ) {
			for(int j = i-1 ; j >= 0 ; j--) {
				if (arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
