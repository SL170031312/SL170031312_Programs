package arrays;

import java.util.Scanner;

public class P3_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int j=0;j<n;j++) {
			arr[j]=s.nextInt();
		}
		int sum=0,avg=999;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>sum)
				sum=arr[i];
			if(arr[i]<avg)
				avg=arr[i];
		}
		System.out.println(sum);
		System.out.println(avg);
	}
}
