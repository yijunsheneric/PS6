package base;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.StudentDomainModel;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Date dob = new Date();
		StudentDomainModel stuA = new StudentDomainModel("A","B","C",dob);
		UUID IdA = stuA.getStudentID();
		StudentDomainModel stuB = new StudentDomainModel("D","E","F",dob);
		UUID IdB = stuB.getStudentID();
		StudentDAL.addStudent(stuA);
		assertEquals(stuA,StudentDAL.getStudent(IdA));
		StudentDAL.updateStudent(stuB);
		assertEquals(stuB,StudentDAL.getStudent(IdB));
		StudentDAL.deleteStudent(IdB);
				
	}

}