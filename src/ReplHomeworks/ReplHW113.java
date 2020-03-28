package ReplHomeworks;

public class ReplHW113 {
	
	int sumEvenToX(int x) {
		int sum=0;
		for(int i=1; i<x+1 ;i++ ) {
			if(i%2==0) {
			sum +=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		ReplHW113 a=new ReplHW113();
		System.out.println(a.sumEvenToX(5));
		System.out.println(a.sumEvenToX(8));

	}

}
