/******************************************************************************
3.Car Fueling
Problem Introduction
You are going to travel to another city that is located 𝑑 miles away from your home city. Your car can travel
at most 𝑚 miles on a full tank and you start with a full tank. Along your way, there are gas stations at
distances stop1, stop2, . . . , stop𝑛 from your home city. What is the minimum number of refills needed?
Problem Description
Input Format. The first line contains an integer 𝑑. The second line contains an integer 𝑚. The third line
specifies an integer 𝑛. Finally, the last line contains integers stop1, stop2, . . . , stop𝑛.
Output Format. Assuming that the distance between the cities is 𝑑 miles, a car can travel at most 𝑚 miles
on a full tank, and there are gas stations at distances stop1, stop2, . . . , stop𝑛 along the way, output the
minimum number of refills needed. Assume that the car starts with a full tank. If it is not possible to
reach the destination, output −1.
Constraints. 1 ≤ 𝑑 ≤ 105. 1 ≤ 𝑚 ≤ 400. 1 ≤ 𝑛 ≤ 300. 0 < stop1 < stop2 < · · · < stop𝑛 < 𝑑.
*******************************************************************************/

import java.util.*;
public class CarFueling
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] stops = new int[n+1];
		for(int i=0;i<n;i++){
		    stops[i] = sc.nextInt();
		}
		stops[n] = d;
		int count = 0;
                int ns;
                int ps=0;
                for(ns=0;ns<=n;ns++){
                     if(ns>0&&stops[ns]-stops[ns-1]>m){
                        count=-1;
                        ns=n+1;
                    }
                    if(ns<=n&&stops[ns]-ps>m){
                        ps=stops[ns-1];
                        ns=ns-1;
                        count++;
                        
                    }
                   
                }
                System.out.println(count);
	}
}
