package com.syntax.class10;

public class SlidesTasks4 {

	public static void main(String[] args) {
	//find the largst number inside array
		int[] nums= {200,30,-1,900,56,787};
		int largest=Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>largest) {
				largest=nums[i];
			}
			System.out.println(largest);
		}
System.out.println("---------------------------");
		int[] nums1= {200,30,-1,900,56,787};
		int maxNumber=nums1[0];
		
		for(int H=0; H<nums1.length; H++) {
			if(nums1[H]>maxNumber) {
				maxNumber=nums1[H];
				System.out.println(nums1[H]);
			}
		}
	}
	

}
