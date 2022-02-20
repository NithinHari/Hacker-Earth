package hackerEarth;

import java.util.*;

public class AliHelpingPeople {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int s1 = s.charAt(0) + s.charAt(1);
		int s2 = s.charAt(3) + s.charAt(4);
        int s3 = s.charAt(4) + s.charAt(5);
        int s4 = s.charAt(7) + s.charAt(8);
        
        if(s.charAt(2) == 'A'|| s.charAt(2) =='E' || s.charAt(2) == 'I' || s.charAt(2) == 'O' || s.charAt(2) == 'U' ||s.charAt(2) == 'Y'){
                	System.out.println("invalid");
                }
        else {
        	if(s1 % 2 == 0 && s2 % 2 == 0 && s3 % 2 == 0 && s4 % 2 == 0) {
        		System.out.println("valid");
        	}
        	else {
        		System.out.println("invalid");
        	}
        }

			
		


	}

}
