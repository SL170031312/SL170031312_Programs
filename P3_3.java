package arrays;

import java.util.Scanner;

public class P3_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=-1;
		int[] arr=new int[n];
		
		for(int j=0;j<n;j++) {
			arr[j]=s.nextInt();
		}
		int key=s.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				k=i;
			break;
			}
		}
		if(k!=-1)
			System.out.println(k);
			else System.out.println("-1");	
		
	}
}
