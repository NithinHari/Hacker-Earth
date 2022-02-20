package hackerEarth;

import java.util.Scanner;

public class Divisability {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(arr[n-1]%10==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
	}

}
