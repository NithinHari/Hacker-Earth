package hackerEarth;

import java.util.Scanner;

public class Excursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		int M = sc.nextInt();
		int K = sc.nextInt();
		int rooms = 0;
		if(N%K!=0) {
			rooms+=(N/K)+1;
		}else {
			rooms+=(N/K);
		}
		if(M%K!=0) {
			rooms+=(M/K)+1;
		}else {
			rooms+=(M/K);
		}
		System.out.println(rooms);
	}

}
