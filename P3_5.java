package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P3_5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int min1=999,max1=0,min2=999,max2=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		/*
		for(int j=0;j<n;j++) {
			if(arr[j]>max1) {
				max2=max1;
				max1=arr[j];
			}
			 if(arr[j]<min1) {
				min2=min1;
				min1=arr[j];
			}
		}
		System.out.println("Largest two num are "+max1+","+max2);
		System.out.println("Smallest two num are "+min1+","+min2);
		*/
		Arrays.sort(arr);
System.out.println(arr[0]+","+arr[1]);
System.out.println(arr[n-1]+","+arr[n-2]);
}
}
