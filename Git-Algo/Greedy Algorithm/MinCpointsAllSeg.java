/******************************************************************************
5 Collecting Signatures
Problem Introduction
You are responsible for collecting signatures from all tenants of a certain building.
For each tenant, you know a period of time when he or she is at home.
You would like to collect all signatures by visiting the building as few times as
possible.
The mathematical model for this problem is the following. You are given a set
of segments on a line and your goal is to mark as few points on a line as possible
so that each segment contains at least one marked point.
Problem Description
Task. Given a set of 𝑛 segments {[𝑎0, 𝑏0], [𝑎1, 𝑏1], . . . , [𝑎𝑛−1, 𝑏𝑛−1]} with integer coordinates on a line, find
the minimum number 𝑚 of points such that each segment contains at least one point. That is, find a
set of integers 𝑋 of the minimum size such that for any segment [𝑎𝑖, 𝑏𝑖] there is a point 𝑥 ∈ 𝑋 such
that 𝑎𝑖 ≤ 𝑥 ≤ 𝑏𝑖.
Input Format. The first line of the input contains the number 𝑛 of segments. Each of the following 𝑛 lines
contains two integers 𝑎𝑖 and 𝑏𝑖 (separated by a space) defining the coordinates of endpoints of the 𝑖-th
segment.
Constraints. 1 ≤ 𝑛 ≤ 100; 0 ≤ 𝑎𝑖 ≤ 𝑏𝑖 ≤ 109 for all 0 ≤ 𝑖 < 𝑛.
Output Format. Output the minimum number 𝑚 of points on the first line and the integer coordinates
of 𝑚 points (separated by spaces) on the second line. You can output the points in any order. If there
are many such sets of points, you can output any set. (It is not difficult to see that there always exist
a set of points of the minimum size such that all the coordinates of the points are integers.)
*******************************************************************************/
import java.util.*;
public class MinCpointsAllSeg
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] cord = new int[n][2];
		for(int i=0;i<n;i++){
		    cord[i][0] = sc.nextInt();
		    cord[i][1] = sc.nextInt();
		}
		Arrays.sort(cord, Comparator.comparingInt(o -> o[0]));
		int i=1;
		ArrayList<Integer> points = new ArrayList<Integer>();
		int start = cord[0][0];
		int end = cord[0][1];
		while(i<n){
		  if(cord[i][0]>=start&&end>=cord[i][0]) {
		      start=cord[i][0];
		      if(cord[i][1]<end){
		          end = cord[i][1];
		      }
		  }
		  else{
		      points.add(end);
		      start = cord[i][0];
		      end = cord[i][1];
		  }
		   if(i==n-1){
		          points.add(end);
		      }
		  i++;
		}
	
		int length = points.size();
		System.out.println(length);
		for(int j=0;j<length;j++){
		    System.out.print(points.get(j)+" ");
		}
	}
}
