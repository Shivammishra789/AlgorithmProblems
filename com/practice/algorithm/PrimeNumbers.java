package com.practice.algorithm;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.print("Prime Number between 0-1000 are : ");
		for (int num = 0; num <= 1000; num++) {
			if (isPrime(num)) {
				System.out.println(num + " ");
			}			
		}
	}

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
