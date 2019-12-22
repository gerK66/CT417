package p1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestGetUsername {

	// String data
	private DateTime semesterStartDate = new DateTime(9 / 9 / 2019);
	private DateTime semesterEndDate = new DateTime(20 / 12 / 2019);
	private String courseNameECE = "Electronic and Computer Engineering";
	private String courseNameCS = "Computer Science";
	private String softEngModule = "Software Engineering";
	private String softEngCode = "CT417";
	private String telecommsModule = "Telecommunications Software Applications";
	private String telecommsCode = "EE453";
	private String MLModule = "Machine Learning";
	private String MLCode = "CT4101";

	// Course Data
	CourseProgramme ECE = new CourseProgramme();
	CourseProgramme CSIT = new CourseProgramme();
	Module telecomms = new Module(telecommsModule, telecommsCode);
	Module softwareEng = new Module(softEngModule, softEngCode);
	Module ML = new Module(MLModule, MLCode);

	// Student data	
	String engStudentName = "Bob";
	int engStudentAge = 27;
	DateTime engStudentDoB = (new DateTime(06/06/1992));
	int engStudentID = 10320021;
	String engStudentCourse = "ECE";
	String engStudentModule = "EE453";
	
	Student engStudent = new Student(engStudentName, engStudentAge, engStudentDoB, engStudentID, engStudentCourse, engStudentModule);

	
	String ITStudentName = "Gob";
	int ITStudentAge = 24;
	DateTime ITStudentDoB = (new DateTime(05/03/1995));
	int ITStudentID = 10320021;
	String ITStudentCourse = "CSIT";
	String ITStudentModule = "CT417";
	
	Student compSciStudent = new Student(ITStudentName, ITStudentAge, ITStudentDoB, ITStudentID, ITStudentCourse, ITStudentModule);

	
	@Before
	public void setup() {
		// Setup common logic 
		ECE.setCourseName(courseNameECE);
		ECE.setStartDate(semesterStartDate);
		ECE.setEndDate(semesterEndDate);
		CSIT.setCourseName(courseNameCS);
		CSIT.setStartDate(semesterStartDate);
		CSIT.setEndDate(semesterEndDate);

		softwareEng.addAssociatedCourse(ECE);
		softwareEng.addAssociatedCourse(CSIT);
		telecomms.addAssociatedCourse(ECE);
		ML.addAssociatedCourse(CSIT);

		ECE.addModule(telecomms);
		ECE.addModule(softwareEng);
		CSIT.addModule(softwareEng);
		CSIT.addModule(ML);
		

		ECE.addStudent(engStudent);
		CSIT.addStudent(compSciStudent);

	}

	@Test
	void testGetUserName() {


		// assertions
		assertTrue(engStudent.getName().equals(engStudentName));
		assertTrue(compSciStudent.getName().equals(ITStudentName));
		
		//assertTrue(engStudent.getAge().equals(engStudentAge));
		//assertTrue(compSciStudent.getAge().equals(ITStudentAge));

		assertTrue(engStudent.getUsername().equals(engStudentName + engStudentAge), "Eng Student username was not equal to name and age concatenated");
		assertTrue(compSciStudent.getUsername().equals(ITStudentName + ITStudentAge), "IT Student username was not equal to name and age concatenated");

	}
	
	

}
