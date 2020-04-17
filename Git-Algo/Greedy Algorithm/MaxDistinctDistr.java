/******************************************************************************
6 Maximum Number of Prizes
Problem Introduction
You are organizing a funny competition for children. As a prize fund you have 𝑛
candies. You would like to use these candies for top 𝑘 places in a competition
with a natural restriction that a higher place gets a larger number of candies.
To make as many children happy as possible, you are going to find the largest
value of 𝑘 for which it is possible.
Problem Description
Task. The goal of this problem is to represent a given positive integer 𝑛 as a sum of as many pairwise
distinct positive integers as possible. That is, to find the maximum 𝑘 such that 𝑛 can be written as
𝑎1 + 𝑎2 + · · · + 𝑎𝑘 where 𝑎1, . . . , 𝑎𝑘 are positive integers and 𝑎𝑖 ̸= 𝑎𝑗 for all 1 ≤ 𝑖 < 𝑗 ≤ 𝑘.
Input Format. The input consists of a single integer 𝑛.
Constraints. 1 ≤ 𝑛 ≤ 109.
Output Format. In the first line, output the maximum number 𝑘 such that 𝑛 can be represented as a sum
of 𝑘 pairwise distinct positive integers. In the second line, output 𝑘 pairwise distinct positive integers
that sum up to 𝑛 (if there are many such representations, output any of them).
*******************************************************************************/
import java.util.*;
public class MaxDistinctDistr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> prizes = new ArrayList<Integer>();
		int i=1;
		int sum=1;
		while(sum<=n){
		   prizes.add(i);
		   i++;
		   sum=sum+i;
		}
		sum=sum-i;
		int bonus=n-sum;
		int k = prizes.size();
		System.out.println(k);
	    for(int j=0;j<k-1;j++){
	        System.out.print(prizes.get(j)+" ");
	    }
	    System.out.print(prizes.get(k-1)+bonus);
	}
}
