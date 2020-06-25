package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P3_6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int min1=999,max1=0,min2=999,max2=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
		
		}
}
