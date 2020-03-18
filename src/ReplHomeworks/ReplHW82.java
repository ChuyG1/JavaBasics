package ReplHomeworks;

public class ReplHW82 {

	public static void main(String[] args) {
			int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
			int sum=0;
			for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum+=a[i][j];
			}
			if(sum==-3)
			continue;
			if(sum==-7)
			continue;
			System.out.println(sum);
				
			}
			}
	}
	

