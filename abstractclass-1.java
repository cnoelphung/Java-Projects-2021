package finalexam;
public class abstractclass {

	private String names;
	
	private int ages;
	
	private String greetings;
	
	private String teacher;
	
	public String getNames() {
		return names;
	}
	
	public int getAges() {
		return ages;
	}
	public String getGreetings() {
		return greetings;
	}
	public void setNames(String aNames) {
		names = aNames;
	}
	public void setAges(int aAges) {
		ages = aAges;
	}
	public void setTeacher (String aTeacher) {
		teacher = aTeacher;
	}
	public void setGreetings(String aGreetings) {
		greetings = aGreetings;
	}
}

class Students {
	int ages = 18;
	int getages() {
		return ages;
	}
	String greetings() {
		return "You are a Student";
	}
	class undergradStudents extends Students{
		int getages() {
			return ages+2;
		}
		String greetings() {
		return "You are an undergrad Student";
		}
		class gradStudents extends Students{
			int getages() {
				return ages+2;
			}
			String greeting() {
				return "You are a grad Student";
			}
		}
		public class Inheritance{
			public static void main(String[] args) {
				       
				       Students s=new Students();
				      
				       System.out.println(s.greetings()+" with age ="+s.getages());
				       
				       gradStudents gs=new gradStudents();
				       
				       System.out.println(gs.greeting()+" with age ="+gs.getages());
				      
				       undergradStudents us=new undergradStudents();
				      
				       System.out.println(us.greetings()+" with age ="+us.getages());
				
				
			}
		}
}
}
