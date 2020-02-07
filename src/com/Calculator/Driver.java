package com.Calculator;
import java.io.*;
import java.util.*;
public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :- ");
		int a = sc.nextInt();
		System.out.println("Enter a number :- ");
		int b = sc.nextInt();
		
		Calculate c = new Calculate(a,b);
		System.out.println("Sum is :- "+c.add());
		System.out.println("Difference is :- "+c.sub());
		System.out.println("Product is :- "+c.mult());
		System.out.println("Quotient is :- "+c.div());
		
	}

}
