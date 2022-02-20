package hackerEarth;

import java.util.Scanner;
import java.util.HashMap;

public class MultipleOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();			
			}
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int j=0;j<arr.length;j++) {
				map.put(arr[j], j+1);
			}
			int sum = 0;
			for(int j=0;j<arr.length;j++) {
				if(map.containsKey(arr[j])) {
					int val = map.remove(arr[j]);
					sum = sum+(val-(j+1));
				}
			}
			System.out.println(sum);
		}
	}

}
