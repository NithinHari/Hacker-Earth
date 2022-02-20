package hackerEarth;

import java.util.Scanner;

public class MathematicallyBeautifulNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			long x = sc.nextLong();
			long k = sc.nextLong();
			boolean flag = true;
			while(x > 0) {
				if(x % k >=2) {
					flag = false;
					break;					
				}else {
					x = x/k;
				}
				if(flag == true) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				t--;
			}
		}
		sc.close();
 
	}

}
