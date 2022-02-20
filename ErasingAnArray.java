package hackerEarth;

import java.util.Scanner;

public class ErasingAnArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int j=0;j<t;j++){
            int n=s.nextInt();
            StringBuilder sb=new StringBuilder();
                for(int i=0;i<n;i++){
                    int o=s.nextInt();
                    sb.append(o);
                    }
            int count=0;
            while(sb.length()>0){
                int k=0;
                for(int i=0;i<sb.length();i++){
                    try{
                        if(sb.charAt(i+1)>=sb.charAt(i)){
                              k++;
                            }
                        else break;
                        }catch(Exception e){
                        continue;
                        }
                        }
                        sb.delete(0,k+1);
                        count++;
                }
                System.out.println(count);
                }
	}

}
