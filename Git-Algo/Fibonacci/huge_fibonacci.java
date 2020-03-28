/******************************************************************************
huge_fibonacci
Problem Introduction
In this problem, your goal is to compute 𝐹𝑛 modulo 𝑚, where 𝑛 may be really huge: up to 1014. For such
values of 𝑛, an algorithm looping for 𝑛 iterations will not fit into one second for sure. Therefore we need to
avoid such a loop.
To get an idea how to solve this problem without going through all 𝐹𝑖 for 𝑖 from 0 to 𝑛, let’s see what
happens when 𝑚 is small — say, 𝑚 = 2 or 𝑚 = 3.
𝑖 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
𝐹𝑖 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
𝐹𝑖 mod 2 0 1 1 0 1 1 0 1 1 0 1 1 0 1 1 0
𝐹𝑖 mod 3 0 1 1 2 0 2 2 1 0 1 1 2 0 2 2 1
Take a detailed look at this table. Do you see? Both these sequences are periodic! For 𝑚 = 2, the period
is 011 and has length 3, while for 𝑚 = 3 the period is 01120221 and has length 8. Therefore, to compute,
say, 𝐹2015 mod 3 we just need to find the remainder of 2015 when divided by 8. Since 2015 = 251 · 8 + 7, we
conclude that 𝐹2015 mod 3 = 𝐹7 mod 3 = 1.
This is true in general: for any integer 𝑚 ≥ 2, the sequence 𝐹𝑛 mod 𝑚 is periodic. The period always
starts with 01 and is known as Pisano period.
Problem Description
Task. Given two integers 𝑛 and 𝑚, output 𝐹𝑛 mod 𝑚 (that is, the remainder of 𝐹𝑛 when divided by 𝑚).
Input Format. The input consists of two integers 𝑛 and 𝑚 given on the same line (separated by a space).
Constraints. 1 ≤ 𝑛 ≤ 1014, 2 ≤ 𝑚 ≤ 103.
Output Format. Output 𝐹𝑛 mod 𝑚.

*******************************************************************************/
import java.util.*;
public class huge_fibonacci
{
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    long m=sc.nextLong();
	    int n=sc.nextInt();
	 
	    if(n>1){
	        int period=0;
	        int prev=0;
	        int current=1;
	        while(prev!=0||current!=1||period<=2){
	            int newr=(prev+current)%n;
	            prev=current;
	            current=newr;
	            period++;
	        }
	        
	        int[] parr=new int[period];
	        parr[0]=0;
	        parr[1]=1;
	        for(int i=2;i<period;i++){
	            parr[i]=(parr[i-1]+parr[i-2])%n;
	        }
	        int rep=(int)((m)%(long)period);
	        System.out.println(parr[rep]);
	    }
        else{
            System.out.println("0");
        }
	}
}

