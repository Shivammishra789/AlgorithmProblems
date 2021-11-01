package com.practice.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first word ");
		String word1 = sc.next();
		System.out.println("enter second word ");
		String word2 = sc.next();

		char[] charArray1 = word1.toCharArray();
		char[] charArray2 = word2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// compares every character of array are same or not
		boolean result = Arrays.equals(charArray1,charArray2);

		if (result == true) {
			System.out.println("Entered two strings are Anagram");
		}
		else
		{
			System.out.println("Strings are NOT Anagram");
		}

	}	
}