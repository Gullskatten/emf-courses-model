package course.impl;

import course.Course;

public class CourseAlreadyExistsException extends RuntimeException {

	
	public CourseAlreadyExistsException(Course course) {
		super("Course " + course.getCode() + " is already selected.");
	}

	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = 4183076133113752980L;
	
	
}
