package arrays;

import java.util.Scanner;

public class P3_9 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int d=0;
	int[] a=new int[n];
	int[] b=new int[100];
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
		d=a[i];
		b[d]++;
	}
	int max=b[0],ind=0;
	for(int j=0;j<100;j++) {
		if(max<b[j]) {
			max=b[j];
			ind=j;
		}
	}System.out.println(ind);
	
}
}
