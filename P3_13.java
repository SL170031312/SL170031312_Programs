package arrays;

import java.util.Scanner;

public class P3_13 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int i=0,j=0;
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(j=0;j<n;j++) {
			b[j]=s.nextInt();
		}
		int k=n/2;
		System.out.print(a[k]+","+b[k]);
		
		
	}
}
