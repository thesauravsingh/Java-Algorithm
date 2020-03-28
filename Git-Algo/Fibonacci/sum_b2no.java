/******************************************************************************
Problem Introduction
Now, we would like to find the last digit of a partial sum of Fibonacci numbers: 𝐹𝑚 + 𝐹𝑚+1 + · · · + 𝐹𝑛.
Problem Description
Task. Given two non-negative integers 𝑚 and 𝑛, where 𝑚 ≤ 𝑛, find the last digit of the sum 𝐹𝑚 + 𝐹𝑚+1 +
· · · + 𝐹𝑛.
Input Format. The input consists of two non-negative integers 𝑚 and 𝑛 separated by a space.
Constraints. 0 ≤ 𝑚 ≤ 𝑛 ≤ 1014.
Output Format. Output the last digit of 𝐹𝑚 + 𝐹𝑚+1 + · · · + 𝐹𝑛.

*******************************************************************************/

import java.util.*;
import java.lang.Math;
public class sum_b2no
{
    public static int last_digit(long n1){
        int n= (int)(n1%(long)60);
		if(n>0){
		int max=1;
		int min=1;
		{for(int i=1;i<n;i++){
		    int temp=max%10;
		    max=(min+max)%10;
		    min=(temp+1)%10;
		}
		return max%10;}}
		else{
		    return 0;
		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n1=sc.nextLong();
		long m1=sc.nextLong();
		if(n1>0){
		    n1=n1-1;
		}
		int n=last_digit(n1);
	
		int m=last_digit(m1);
	
		System.out.println((10+m-n)%10);
		
		
		
	}
}
