package hackerEarth;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int sum = 0;
String[] A = new String[N];

for(int i=0;i<N;i++) {
	A[i] = sc.next();
}
for(int i=0;i<N/2;i++) {
	final int sum1 = Integer.parseInt(String.valueOf(A[i].charAt(0)));
	if(i%2==0) {
		sum+=sum1;
	}
	else {
		sum-=sum1;
	}
}

for(int i=N/2;i<N;i++) {
	final int sum1 = Integer.parseInt(String.valueOf(A[i].charAt(A[i].length()-1)));
	if(i%2!=0) {
		sum-=sum1;
	}

else {
	sum+=sum1;
}
}
	if(sum%11==0) {
		System.out.println("OUI");
	}else {
		System.out.println("NON");
	}
}
}