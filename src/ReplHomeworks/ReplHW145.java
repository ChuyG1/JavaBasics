package ReplHomeworks;

public class ReplHW145 {
	
	public static void Sum2D(int [][] a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}
}
