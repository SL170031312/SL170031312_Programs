package arrays;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class P3_8 {
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
		int max=0,ind=0;
		for(int j=0;j<100;j++) {
			if(b[j]>0) {
				
				ind=j;
				System.out.println(ind);
			}
		}
		/*int n=s.nextInt();
		int[] arr=new int[n];
		int[] b=new int[n];
		int i=0;
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		LinkedHashSet<Integer> lis
        = new LinkedHashSet<Integer>(); 

    // adding elements to LinkedHashSet 
		
    for ( i = 0; i < arr.length; i++) {
        lis.add(arr[i]); 
    	
    }
    Iterator<Integer> itr=lis.iterator();
    while(itr.hasNext())
    System.out.print(itr.next()+" "); 
		*/
	}
	
}
