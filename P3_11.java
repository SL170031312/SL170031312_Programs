package arrays;

import java.util.Scanner;

public class P3_11 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	int[] b=new int[n];
	int i=0,j=0;
	for(i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	for(i=0;i<n;i++) {
		if(a[i]!=10) {
			b[j]=a[i];
			j++;
			}
	}
		for(int k=0;k<n;k++) {
			System.out.println(b[k]);
		}
			
	
}
}
