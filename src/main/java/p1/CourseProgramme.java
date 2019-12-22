package p1;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {

	//Start and end dates should use Joda Time classes(i.e.
	//DateTime), which must be added as a project dependency

	
	private DateTime StartDate;	
	private DateTime EndDate;
	private String CourseName;
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Module> Modules = new ArrayList<Module>();
	
	public CourseProgramme() {
		
	}
	
	
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

	public DateTime getEndDate() {
		return EndDate;
	}
	public void setEndDate(DateTime endDate) {
		EndDate = endDate;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public DateTime getStartDate() {
		return StartDate;
	}
	public void setStartDate(DateTime startDate) {
		StartDate = startDate;
	}
	public void addModule(Module module) {
		Modules.add(module);
	}
	public void addStudent(Student student) {
		students.add(student);
		for(int i=0;i<Modules.size();i++) {
			Module cmod = Modules.get(i);
			cmod.addStudent(student);
		}
	}
	
}
