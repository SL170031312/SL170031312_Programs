import java.util.*;
public class P2_12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				f++;
		}
		if(f==0) {
			System.out.println("Prime");
		}
		else System.out.println("Not Prime");
	}
}
