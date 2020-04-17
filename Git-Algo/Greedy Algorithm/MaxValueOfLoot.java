/******************************************************************************
2 Maximum Value of the Loot
Problem Introduction
A thief finds much more loot than his bag can fit. Help him to find the most valuable combination
of items assuming that any fraction of a loot item can be put into his bag.
Problem Description
Task. The goal of this code problem is to implement an algorithm for the fractional knapsack problem.
Input Format. The first line of the input contains the number 𝑛 of items and the capacity 𝑊 of a knapsack.
The next 𝑛 lines define the values and weights of the items. The 𝑖-th line contains integers 𝑣𝑖 and 𝑤𝑖—the
value and the weight of 𝑖-th item, respectively.
Constraints. 1 ≤ 𝑛 ≤ 103, 0 ≤ 𝑊 ≤ 2 · 106; 0 ≤ 𝑣𝑖 ≤ 2 · 106, 0 < 𝑤𝑖 ≤ 2 · 106 for all 1 ≤ 𝑖 ≤ 𝑛. All the
numbers are integers.
Output Format. Output the maximal value of fractions of items that fit into the knapsack. The absolute
value of the difference between the answer of your program and the optimal value should be at most
10−3. To ensure this, output your answer with at least four digits after the decimal point (otherwise
your answer, while being computed correctly, can turn out to be wrong because of rounding issues).
*******************************************************************************/
import java.util.*;
import java.util.Arrays; 
public class MaxValueOfLoot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxw = sc.nextInt();
		double[][] data = new double[n][3];
		for(int i=0;i<n;i++){
		    data[i][1] = sc.nextFloat();
		    data[i][2] = sc.nextFloat();
		    data[i][0] = data[i][1]/data[i][2];
		}
		Arrays.sort(data, Comparator.comparingDouble(o -> o[0]));
		double curw = 0;
		int ind = n-1;
		double tval = 0;
		while(curw<maxw&&ind>=0){
		    double q=maxw-curw;
		    if(q>0){
		       if(q<data[ind][2]){
		           tval = tval + q*data[ind][0] ; 
		           curw = curw + q;}
		           else{
		             tval = tval + data[ind][1] ; 
		             curw = curw + data[ind][2] ;
		           }
		           
		           ind--;
		}
		}
		System.out.println(tval);
	
	}
}

