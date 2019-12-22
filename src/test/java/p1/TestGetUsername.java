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
	private String engStudentName = "Bob";
	private int engStudentAge = 27;
	private DateTime engStudentDoB = (new DateTime(06/06/1992));
	private  int engStudentID = 10320021;
	private String engStudentCourse = "ECE";
	private String engStudentModule = "EE453";
	
	private Student engStudent = new Student(engStudentName, engStudentAge, engStudentDoB, engStudentID, engStudentCourse, engStudentModule);

	
	private String ITStudentName = "Gob";
	private int ITStudentAge = 24;
	private DateTime ITStudentDoB = (new DateTime(05/03/1995));
	private int ITStudentID = 10320021;
	private String ITStudentCourse = "CSIT";
	private String ITStudentModule = "CT417";
	
	private Student compSciStudent = new Student(ITStudentName, ITStudentAge, ITStudentDoB, ITStudentID, ITStudentCourse, ITStudentModule);

	
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
	public void testGetUsername() {

		// assertions
		assertTrue(engStudent.getName().equals(engStudentName));
		assertTrue(compSciStudent.getName().equals(ITStudentName));
		
		assertEquals(engStudentAge, engStudent.getAge());
		assertEquals(ITStudentAge, compSciStudent.getAge());
		
		assertTrue(engStudent.getUsername().equals(engStudentName + engStudentAge), "Eng Student username was not equal to name and age concatenated");
		assertTrue(compSciStudent.getUsername().equals(ITStudentName + ITStudentAge), "IT Student username was not equal to name and age concatenated");

	}
	
	@Test
	public void testStudentComponents() {
		
		assertTrue(engStudent.getName().equals(engStudentName));
		assertTrue(compSciStudent.getName().equals(ITStudentName));
		
		assertEquals(engStudentAge, engStudent.getAge());
		assertEquals(ITStudentAge, compSciStudent.getAge());
		
		assertTrue(engStudent.getDOB().equals(engStudentDoB));
		assertTrue(compSciStudent.getDOB().equals(engStudentDoB));
		
		assertEquals(engStudentID, engStudent.getID());
		assertEquals(ITStudentID, compSciStudent.getID());
		
		assertTrue(engStudent.getCourse().equals(engStudentCourse));
		assertTrue(compSciStudent.getCourse().equals(ITStudentCourse));
		
		assertTrue(engStudent.getModuleRegisteredFor().equals(engStudentModule));
		assertTrue(compSciStudent.getModuleRegisteredFor().equals(ITStudentModule));
		
		
		
		
	}
	@Test
	public void testStudentEnrollment() {
		
		assertTrue(engStudent.getModuleRegisteredFor().equals("EE453"), "Eng Student should be enrolled in Telecomms Module");
	    assertTrue(compSciStudent.getModuleRegisteredFor().equals("CT417"), "IT Student should be enrolled in Telecomms Module");
}
	

}
