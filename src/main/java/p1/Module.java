package p1;

import java.util.ArrayList;
import java.util.List;

public class Module {
	String moduleName;
	String ModuleId; //(e.g. CT417)
	List<Student> students = new ArrayList<Student>();
	private List<CourseProgramme> coursesAssociated = new ArrayList<CourseProgramme>();
	
	
	public Module (String moduleName, String ModuleId){
		this.moduleName = moduleName;
		this.ModuleId = ModuleId;
			
	}
	 
	
	 public void setStudents(List<Student> students) {
		this.students = students;
	}


	public void setCoursesAssociated(List<CourseProgramme> coursesAssociated) {
		this.coursesAssociated = coursesAssociated;
	}


	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleId() {
		return ModuleId;
	}

	public void setModuleId(String moduleId) {
		ModuleId = moduleId;
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<CourseProgramme> getCoursesAssociated() {
		return coursesAssociated;
	}
	public void addAssociatedCourse(CourseProgramme course) {
		coursesAssociated.add(course);
	}
	public void addStudent(Student s) {
		students.add(s);
	}
}
