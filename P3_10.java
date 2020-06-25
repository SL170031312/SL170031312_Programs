package arrays;

import java.util.Scanner;

public class P3_10 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	int i=0,j=0,k=0,k1=0,sum=0;
	for( i=0;i<n;i++) {
		a[i]=s.nextInt();
		
	}
	for(i=0;i<n;i++) {
		if(a[i]==6)
			k=i;
		if(a[i]==7)
			k1=i;
		}
	if(k<k1) {
		for(j=0;j<k;j++)
			sum=sum+a[j];
		k1=k1+1;
		for(j=k1;j<n;j++)
			sum+=a[j];
	}
	else {
		for(j=0;j<n;j++)
			sum+=a[j];
	}
	System.out.println(sum);
}
}
