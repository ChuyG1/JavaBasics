package ReplHomeworks;

public class ReplHW62 {

	public static void main(String[] args) {
	/*Using for loop print 1 to 10
	 * numbers except 5 and 6
	 */
		for(int I=1; I<=10; I++) {
			if(I==5) 
			continue;
			if(I==6) 
			continue;
			System.out.println(I);
			
		}
	}

}
