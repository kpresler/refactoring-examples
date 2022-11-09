
public class Student {
	
	/** Represents a student's last name */
	private String lastName;
	
	/** Represents a student's first name */
	private String firstName;
	
	/** Represents a student's date of birth */
	private String dob;
	
	/** Represents a student's class standing (Freshman, Sophomore, etc) */
	private String classStanding;
	
	public Student() {}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getClassStanding() {
		return classStanding;
	}

	public void setClassStanding(String classStanding) {
		this.classStanding = classStanding;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", dob=" + dob + ", classStanding="
				+ classStanding + "]";
	}
	
	
	

}
