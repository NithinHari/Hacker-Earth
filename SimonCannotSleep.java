package hackerEarth;

import java.util.Scanner;

public class SimonCannotSleep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] time = sc.nextLine().split(":");
		int Hour = Integer.parseInt(time[0]);
		int Min = Integer.parseInt(time[1]);
		int N = (11*(Hour*60+Min))/(12*60);
		System.out.println(N+1);
	}

}
