package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		/* if student completed a quiz we will check for a score
		 * if score is > 90 --> Great Job
		 * if score is > 80 --> Well done
		 * if score is > 70 --> You could have done better
		 * 
		 *  if student did not complete the quiz--> not good
		 *  please do homework online
		 */

		boolean quizCompleted=true;
		int score=66;
		
		if(quizCompleted) {
			System.out.println("Lets check your score");
			
			if(score>90) {
				System.out.println("Great Job!");
			}else if(score>80) {
				System.out.println("Well done");
			}else if(score>70) {
				System.out.println("You could have done better");
			}else {
				System.out.println("YOU FAIL");
			} 	
		
		}else {
			System.out.println("Please do HW online");
		}
		
	}

}
