import java.util.*;
public class P2_16 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int r=0,sum=0;
	while(n>0) {
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	System.out.println(sum);
	}
}
