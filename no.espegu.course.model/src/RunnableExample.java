import org.eclipse.emf.common.util.EList;

import course.CourseFactory;
import course.Program;
import course.School;

public class RunnableExample {

	public static void main(String[] args) {
		School school = CourseFactory.eINSTANCE.createSchool();
		Program program = generateProgram("", 120f);
		
		
		school.getPrograms().add(program);
		
	
	
	}
	
	
	
	
	
	public static Program generateProgram(String name,
			float credits) {
		Program program = CourseFactory.eINSTANCE.createProgram();
		program.setName(name);
		program.setRequiredCredits(credits);
		// School is automatically set by EOpposite-link
		return program;
	}
	
}
