package hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class LunchBoxes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int it=0;it<tc;it++) {
		int lb = sc.nextInt();
		int sch = sc.nextInt();
		int A[] = new int[sch];
		int max = 0;
		for(int i=0;i<sch;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for(int i=0;lb>0 && i<sch;i++) {
			if(lb>=A[i]) {
				lb-=A[i];
				max++;
			}
		}
		System.out.println(max);
	}
	}
}
