import java.io.*;
import java.util.*;
public class fibonacci_last_digit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
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
		System.out.println(arr[(n)]);}
		else System.out.println("0");
	}
}