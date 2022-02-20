package hackerEarth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RoyAndProfilePicture {
	public static void main(String[] args) throws IOException{
		BufferedReader br =	new BufferedReader(new InputStreamReader(System.in));
	        String dimension = br.readLine();
	        int L_dimension = Integer.parseInt(dimension);
	        String usecase = br.readLine();
	        int n_useCase = Integer.parseInt(usecase);
	        StringBuilder Output = new StringBuilder();
	        for (int i = 0; i < n_useCase; i++) {
	            String inputDimension[] = br.readLine().split(" ");
	            if (Integer.valueOf(inputDimension[0]) >= L_dimension &&
	                Integer.valueOf(inputDimension[1]) >= L_dimension) {
	                if (Integer.valueOf(inputDimension[0]).equals(Integer.valueOf(inputDimension[1]))
	                    ) {
	                    Output.append("ACCEPTED\n");
	                } else {
	                    Output.append("CROP IT\n");
	                }
	            } 
	            else {
	                Output.append("UPLOAD ANOTHER\n");
	            }
	        }
	        System.out.println(Output);
	}
}
