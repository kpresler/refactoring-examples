
public class Student {
	
	/** Represents a student's last name */
	private String lastName;
	
	/** Represents a student's first name */
	private String firstName;
	
	/** Represents a student's date of birth */
	private String dob;
	
	/** Represents a student's class standing (Freshman, Sophomore, etc) */
	private String classStanding;
	
	public Student(String lastName, String firstName, String dob, String classStanding) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.dob = dob;
		this.classStanding = classStanding;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", dob=" + dob + ", classStanding="
				+ classStanding + "]";
	}
	
	
	

}
