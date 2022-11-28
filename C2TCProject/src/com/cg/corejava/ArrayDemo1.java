package com.cg.corejava;

import java.util.Scanner;

public class ArrayDemo1 {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size] ;
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println(arr.length);
		
	}

}
