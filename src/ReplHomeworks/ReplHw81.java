package ReplHomeworks;

public class ReplHw81 {

	public static void main(String[] args) {
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
			int maxNumber=a[0][0];
			
			for(int H=0; H<a.length; H++) {
				for(int G=0; G<a.length; G++) {
					if(a[H][G]>maxNumber) {
					maxNumber=a[H][G];
					System.out.println(maxNumber);
				}
				}

	}
		}

}
