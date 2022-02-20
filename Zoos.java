package hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2 * x = y
public class Zoos {
public static void main (String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name = br.readLine();
	char[] n = name.toCharArray();
	char zoo = name.charAt(0);
	int num = 1;
	for(int i=1;i<n.length;i++) {
		if(zoo == n[i]) {
			num++;
		}else {
			break;
		}
	}
	if(name.substring(num).length() == 2 *num) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
}
}
