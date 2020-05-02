package ReplHomeworks;

public class ReplHW176_2 extends ReplHW176 {

	public static void main(String[] args) {
		ReplHW176_2 obj=new ReplHW176_2();
		obj.setFirstName("John");
		obj.setLastName("Doe");
		obj.setSsn("123-45-6789");
		
		
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.formatBirthday());
		System.out.println(obj.getSsn());
	}

}
