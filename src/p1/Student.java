package p1;

public class Student {
	private String Name;


	private int Age;
	private String DOB;
	private int ID;
	private String username;
	private String courses;
	private String moduleRegisteredFor;
	
	 public Student(String Name, int Age, String DOB, int ID, String username, String courses, String moduleRegisteredFor) {
	        this.Name = Name;
	        this.Age = Age;
	        this.DOB = DOB;
	        this.ID = ID;
	        this.setUsername(username);
	        this.courses = courses;
	        this.moduleRegisteredFor = moduleRegisteredFor;
	        	                
	 }
		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getAge() {
			return Age;
		}

		public void setAge(int age) {
			Age = age;
		}

		public String getDOB() {
			return DOB;
		}

		public void setDOB(String dOB) {
			DOB = dOB;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}

		public String getCourses() {
			return courses;
		}

		public void setCourses(String courses) {
			this.courses = courses;
		}

		public String getModuleRegisteredFor() {
			return moduleRegisteredFor;
		}

		public void setModuleRegisteredFor(String moduleRegisteredFor) {
			this.moduleRegisteredFor = moduleRegisteredFor;
		}
		
}
