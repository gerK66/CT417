package p1;

import java.awt.List;
import java.util.ArrayList;

public class Module {
	String moduleName;
		int ModuleId; //(e.g. CT417)
	//Array list of students;
	//link array courses it is associated with;
	
	public Module (String moduleName, int ModuleId){
		this.moduleName = moduleName;
		this.ModuleId = ModuleId;
			
		}
	
	ArrayList<Student> students = new ArrayList<Student>();
	 Student foo = new Student("Bob", 23, "23/11/19", 15428569, "BobTheBlob", "eng","ct101");
	 students.add(foo);
	 
	
	 public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getModuleId() {
		return ModuleId;
	}

	public void setModuleId(int moduleId) {
		ModuleId = moduleId;
	}

		}
