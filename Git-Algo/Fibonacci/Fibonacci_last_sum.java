/******************************************************************************
Problem Introduction
The goal in this problem is to find the last digit of a sum of the first 𝑛 Fibonacci numbers.
Problem Description
Task. Given an integer 𝑛, find the last digit of the sum 𝐹0 + 𝐹1 + · · · + 𝐹𝑛.
Input Format. The input consists of a single integer 𝑛.
Constraints. 0 ≤ 𝑛 ≤ 1014.
Output Format. Output the last digit of 𝐹0 + 𝐹1 + · · · + 𝐹𝑛.

*******************************************************************************/

import java.util.*;
public class Fibonacci_last_sum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n1=sc.nextLong();
		int n= (int)(n1%(long)60);
		if(n>0){
		int max=1;
		int min=1;
		{for(int i=1;i<n;i++){
		    int temp=max%10;
		    max=(min+max)%10;
		    min=(temp+1)%10;
		}
		System.out.println(max%10);}}
		else{
		    System.out.println(0);
		}
		
		
	}
}