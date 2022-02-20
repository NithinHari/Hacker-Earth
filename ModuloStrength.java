package hackerEarth;

import java.util.Scanner;

public class ModuloStrength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] R = new long[K];
		int i = 0;
		for(i=0;i<N;i++) {
			R[(sc.nextInt())%K]++;
		}
		long s=0;
		for(i=0;i<K;i++) {
			s+=(R[i]*(R[i]-1));
		}
		System.out.println(s);
	}

}
