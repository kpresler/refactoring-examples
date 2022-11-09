import java.util.List;

public class Main {

	
	
	
	public void ___(List<Student> students) {
		
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
