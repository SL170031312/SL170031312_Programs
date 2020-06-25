package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P3_7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int[] arr=new int[n];
		int[] tem=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		int k=0;
		tem[0]=arr[0];
		for(int j=0;j<n-1;j++) {
			if(arr[j]!=arr[j+1]) {
				tem[k++]=arr[j];
			}
			
		}
		for(int j=0;j<k;j++) {
			System.out.print(tem[j]+" ");
		}
	}
	
}
