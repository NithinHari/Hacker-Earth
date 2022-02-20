package hackerEarth;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int N = s.nextInt();
int fact = cF(N);
System.out.println(fact);
	}
private static int cF(int N) {
	int fact = 1;
	for(int i=0;i>0;i++) {
		fact = fact*i;
	}
	return fact;
}
}
