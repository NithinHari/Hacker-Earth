package hackerEarth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SpecialMatrix {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder out = new StringBuilder();
		long prime[] = new long[2000001];
		for(int i=2;i<prime.length;i++) {
			int j=2;
			if(prime[i]==0) {
				prime[i]=1;
				while((i*j)<prime.length) {
					prime[i*j]++;
					j++;
				}
			}
		}
		while(T-->0) {
			String str[] = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			long tot = 0;
			if(N>N) {
				int temp = N;
				N=M;
				M=temp;
			}
			int lim = M+N;
			long cnt = 1;
			for(int i=2;i<=lim;i++) {
				tot = tot+(cnt*prime[i]);
				if((i-1)<N) {
					cnt++;
				}else if((i-1)>=M){
					cnt--;
				}				
			}
			out.append(tot);
			out.append("\n");
		}
		System.out.println(out);

	}

}
