package arrays;
import java.util.*;
public class P3_1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] arr=new int[n];
	for(int j=0;j<n;j++) {
		arr[j]=s.nextInt();
	}
	int sum=0,avg=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	avg=sum/n;
	System.out.println(sum);
	System.out.println(avg);
}
}
