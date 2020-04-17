/******************************************************************************
Problem Description
Task. The goal in this problem is to find the minimum number of coins needed to change the input value
(an integer) into coins with denominations 1, 5, and 10.
Input Format. The input consists of a single integer 𝑚.
Constraints. 1 ≤ 𝑚 ≤ 103.
Output Format. Output the minimum number of coins with denominations 1, 5, 10 that changes 𝑚.

*******************************************************************************/
import java.util.*;
public class CurrencyCount
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int[] curr={10,5,1};
		int i=0;
		while(n>0&&i<3){
		   count=count+n/curr[i];
		   n=n%curr[i];
		   i++;
		}
		System.out.println(count);
	}
}
