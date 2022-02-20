package hackerEarth;

import java.util.Scanner;

public class GoingToOffice {

	public static void main(String[] args) {
		double Distance;
		double CostForFirst,FirstKm,KmAfterwards;
		double BaseFare,MinInTaxi,CostKm,KmSpeed;
		Scanner sc = new Scanner(System.in);
		Distance = sc.nextInt();
		
		CostForFirst = sc.nextInt();
		FirstKm = sc.nextInt();
		KmAfterwards = sc.nextInt();
		
		BaseFare = sc.nextInt();
		MinInTaxi = sc.nextInt();
		CostKm = sc.nextInt();
		KmSpeed = sc.nextInt();
		
		double OnlineTaxi = CostForFirst + (Distance - FirstKm)*KmAfterwards;
		double ClassicTaxi = BaseFare + (Distance/KmSpeed)*MinInTaxi+(Distance/CostKm);
		
		if(OnlineTaxi<=ClassicTaxi) {
			System.out.println("Online Taxi");
		}else {
			System.out.println("Classic Taxi");
		}
	}

}
