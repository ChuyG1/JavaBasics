package ReplHomeworks;

public class ReplHW194 {
		int studentId;
		String name, lastName;
		
		ReplHW194(String name, String lastName, int studentId){
			this.name=name;
			this.lastName=lastName;
			this.studentId=studentId;
		}
		
		void display(){
			System.out.println("Student details: "+name+" "+lastName+" "+"with id: "+studentId);
		}
}
