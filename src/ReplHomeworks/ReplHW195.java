package ReplHomeworks;

public class ReplHW195 {
	private String FullName;
	private int ssn;
	private double salary;
	
	ReplHW195(String FullName, int ssn, double salary){
		this.FullName=FullName;
		this.ssn=ssn;
		this.salary=salary;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	
}
