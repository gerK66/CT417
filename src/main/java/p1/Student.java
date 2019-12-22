package p1;

import java.util.ArrayList;
//import java.time.format.DateTimeFormatter;
import java.util.List;

import org.joda.time.DateTime;

public class Student {
	private String Name;

	private int Age;
	private DateTime DOB;
	private int ID;
	private String Course;
	private String moduleRegisteredFor;
	private List<Module> modules = new ArrayList<Module>();

	public Student(String Name, int Age, DateTime DOB, int ID, String Course, String moduleRegisteredFor) {
		this.Name = Name;
		this.Age = Age;
		this.DOB = DOB;
		this.ID = ID;
		this.Course = Course;
		this.moduleRegisteredFor = moduleRegisteredFor;

	}

	/*
	 * public String toString() { return "Student{" + "Name='" + Name + '\'' +
	 * ", Age='" + Age + '\'' + ", DOB='" + DOB + '\'' + ", ID='" + ID + '\'' +
	 * ", Course='" + Course + '\'' + ", moduleRegisteredFor='" +
	 * moduleRegisteredFor + '\'' + '}'; }
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

	public DateTime getDOB() {
		return DOB;
	}

	public void setDOB(DateTime DOB) {
		DOB = this.DOB;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUsername() {
		String Username = Name.concat(Integer.toString(Age));
		return Username;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String Course) {
		this.Course = Course;
	}

	public String getModuleRegisteredFor() {
		return moduleRegisteredFor;
	}

	public void setModuleRegisteredFor(String moduleRegisteredFor) {
		this.moduleRegisteredFor = moduleRegisteredFor;
	}

	public List<Module> getModules() {
		return modules;
	}

}
