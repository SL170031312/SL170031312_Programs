import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class P2_3 {
public static void main(String[] args) {
int n;
n=args.length;
	if(args.length==0) {
		System.out.println("No values");
	}
	else {
		for(int i=0;i<n-1;i++) {
			System.out.print(args[i]+",");
		}
		System.out.print(args[n-1]);
	}
}
}
