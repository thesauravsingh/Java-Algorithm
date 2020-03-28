/******************************************************************************
Problem Description
Task. Compute the last digit of 𝐹2
0 + 𝐹2
1 + · · · + 𝐹2
𝑛.
Input Format. Integer 𝑛.
Constraints. 0 ≤ 𝑛 ≤ 1014.
Output Format. The last digit of 𝐹2


*******************************************************************************/

import java.util.*;
import java.lang.Math;
public class sum_sq_fbnci{
    public static int last_digit(long n1) {
	
		int n=(int)(n1%(long)60);
		if(n>0){int[] arr=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		if(n>1){
		for(int i=2;i<=n;i++){
		    arr[i]=arr[i-1]+arr[i-2];
		    if(arr[i]>9){
		        arr[i]=arr[i]%10;
		    }
		}}
		return arr[n];}
		else return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int n1=last_digit(n);
		if(n>0){
		    int n2=last_digit(n-1);
		    System.out.println((n1*(n1+n2))%10);
		}
		else System.out.println("0");
		
		
	}
}
