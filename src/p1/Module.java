package p1;

import java.util.ArrayList;

public class Module {
	String moduleName;
	String ModuleId; //(e.g. CT417)
	
	
	ArrayList<Student> students = new ArrayList<Student>();
	{
	
		students.add(new Student("Bob", 23, 23/11/1995, 15428569, "ECE","ct101"));
		students.add(new Student("Tob", 26, 23/11/1993, 15428569, "CS","ct101"));
		students.add(new Student("Gob", 21, 23/11/1998, 15428569, "IT","ct101"));
	}
	
		public Module (String moduleName, String ModuleId){
		this.moduleName = moduleName;
		this.ModuleId = ModuleId;
			
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

		}
