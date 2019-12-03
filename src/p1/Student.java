package p1;

import java.util.Date;

public class Student {
	private String Name;


	private int Age;
	private Date DOB;
	private int ID;
	private String courses;
	private String moduleRegisteredFor;
	
	 public Student(String Name, int Age, Date DOB, int ID, String courses, String moduleRegisteredFor) {
	        this.Name = Name;
	        this.Age = Age;
	        this.DOB = DOB;
	        this.ID = ID;
	        this.courses = courses;
	        this.moduleRegisteredFor = moduleRegisteredFor;
	        	                
	 }
	/* public String toString() {
	        return "Student{" +
	                "Name='" + Name + '\'' +
	                ", Age='" + Age + '\'' +
	                ", DOB='" + DOB + '\'' +
	                ", ID='" + ID + '\'' +
	                ", courses='" + courses + '\'' +
	                ", moduleRegisteredFor='" + moduleRegisteredFor + '\'' +
	                '}';
	    }
	    */
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

		public Date getDOB() {
			return DOB;
		}

		public void setDOB(Date DOB) {
			DOB = DOB;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}
		
		public String getUsername() {
			String Username = Name.concat(DOB);
			return Username;
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
