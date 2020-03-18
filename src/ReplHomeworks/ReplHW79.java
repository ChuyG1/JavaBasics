package ReplHomeworks;

public class ReplHW79 {

	public static void main(String[] args) {
		//print all the lements within the 2d array
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};

		for(double[] A2:a) {
			for(double A3:A2) {
				System.out.print(A3+" ");
			}
		System.out.println();
		}	
		
		}
		
}