package ReplHomeworks;

public class ReplHW135 {
	
	public static int MaxValue(int[] arr) {	
	int max=0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) {
		max=arr[i];
		}
	}
	return max;
	}
	public static void main(String[] args) {
		int[] arr= {5,12,-3,7,3,22};
		System.out.println(MaxValue(arr));

	}

}
