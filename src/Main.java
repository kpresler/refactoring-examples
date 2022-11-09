import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		Student joe = new Student("Joe", "Smith", "12/20/1980", "Sophomore");
		
		Student rebecca = new Student("Rebecca", "Jackson", "1/1/1970", "Senior");
		
		Student jan = new Student("Jan", "Peters", "3/4/1998", "Junior");
		
		List<Student> students = List.of(joe, rebecca, jan);
		
		___(students);
				
		
	}
	
	
	
	static public void ___(List<Student> students) {
		
		int i = 0;
		while (true) {
			
			try {
				Student s = students.get(i);
				System.out.println(s.toString());
				i++;
			}
			
			catch(IndexOutOfBoundsException ioobe) {
				break;
			}
			
			
		}
		
		
	}
	
}
