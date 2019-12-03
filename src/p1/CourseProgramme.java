package p1;

import java.util.ArrayList;
import java.util.Date;
import javax.xml.crypto.Data;

public class CourseProgramme {
	//list of modules
	//list of students that are enrolled,
	//academic start	date and end date.
	//Start and end dates should use Joda Time classes(i.e.
	//DateTime), which must be added as a project dependency
	/*ArrayList<String> Course = new ArrayList<String>();
	{
		Course.add("CS");
		Course.add("IT");
		Course.add("ECE");
	}
	*/
	
	private Data Startdate;	
	private Date EndDate;
	private String CourseName;
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Module> Modules = new ArrayList<Module>();
	
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public ArrayList<Module> getModules() {
		return Modules;
	}
	public void setModules(ArrayList<Module> modules) {
		Modules = modules;
	}
	public Data getStartdate() {
		return Startdate;
	}
	public void setStartdate(Data startdate) {
		Startdate = startdate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	
}
