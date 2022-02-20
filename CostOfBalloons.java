package hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CostOfBalloons {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int testCases = Integer.parseInt(br.readLine());
for(int i=0;i<testCases;i++) {
	String[] colors = br.readLine().split(" ");
	int colorOne = Integer.parseInt(colors[0]);
	int colorTwo = Integer.parseInt(colors[1]);
	
	int participants = Integer.parseInt(br.readLine());
	int one = 0;
	int two = 0;
	for(int j=0;j<participants;j++) {
		String[] solvedby = br.readLine().split(" ");
		if(Integer.parseInt(solvedby[0])==1) {
			one+=1;
		}
		if(Integer.parseInt(solvedby[1])==1) {
			two+=1;
		}
	}
	int result = findAnswer(colorOne, colorTwo, one, two);
	System.out.println(result);
 }	
}
private static int findAnswer(int colorOne,int colorTwo,int one,int two) {
	int oneOne = one * colorOne;
	int twoTwo = two * colorTwo;
	
	int twoOne = two * colorOne;
	int oneTwo = one * colorTwo;
	
	return Math.min(oneOne+twoTwo,twoOne+oneTwo);
}
}
