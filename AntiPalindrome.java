package hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class AntiPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String bla = sc.nextLine();
		while(t-->0) {
			String a = sc.nextLine();
			StringBuffer sb = new StringBuffer(a);
			String rev = sb.reverse().toString();
			if(a.equals(rev)) {
				System.out.println("-1");
			}else {
				char ar[] = a.toCharArray();
				Arrays.sort(ar);
				String temp = String.valueOf(ar);
				System.out.println(temp);
			}
			
		}
	}

}
