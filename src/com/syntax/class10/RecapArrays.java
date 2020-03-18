package com.syntax.class10;

public class RecapArrays {

	public static void main(String[] args) {
	/*creating a array of cities
	 * 
	 */
		String[] cities= {"Washington DC","New York","Paris",
						"Los Angeles","Dallas","Chantilly"};
		//i live in paris
		System.out.println("I Live in"+cities[2]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to"+cities[x]);
		//how many elements stored inside an array
		int arraysize=cities.length;
		System.out.println("Total elemts "+arraysize);
		
		//how can we access last element from an array?
		System.out.println(cities[arraysize-1]);
		
		//access all elements from an array
		//cities[0], cities[1], cities[2]
		for(int I=0; I<arraysize; I++) {
			System.out.println(cities[I]);
		}
		
	}

}
