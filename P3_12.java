package arrays;

import java.util.Scanner;

public class P3_12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int i=0,j=0,c=0;
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
			j=a[i];
			if(j==1 || j==4)
				c++;
		}
		if(c==n) {
			System.out.println("true");
		}
		else System.out.println("false");
		
	}
	
}
