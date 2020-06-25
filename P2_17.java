import java.util.Scanner;

public class P2_17 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int m=s.nextInt();
		int n=m;
		int r=0,sum=0;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(m==sum) {
			System.out.println("Palindrome");
		}
		else System.out.println("Not Palindrome");
		}
}
