package course.tests.util;

import course.Course;
import course.CourseFactory;
import course.CourseLevel;
import course.SemesterType;

public class TestObjectInitializer {
	public static Course createAnyCourse(CourseFactory factory) {
		Course aCourse = CourseFactory.eINSTANCE.createCourse();
		aCourse.setCode("TDT4252");
		aCourse.setName("Avansert Programvareutvikling");
		aCourse.setTaughtInSemester(SemesterType.AUTUMN);
		aCourse.setCredits(7.5f);
		aCourse.setLevel(CourseLevel.HIGHER_DEGREE);
		return aCourse;
	}
}
