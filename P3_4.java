package arrays;
import java.util.*;
public class P3_4 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] arr=new int[n];
	char[] c1=new char[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
		c1[i]=(char)arr[i];
	}
	for(int j=0;j<n;j++) {
		System.out.println(c1[j]);
	}
	
}
}
