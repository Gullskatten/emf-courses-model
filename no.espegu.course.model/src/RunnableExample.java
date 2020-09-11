import org.eclipse.emf.common.util.EList;

import course.CourseFactory;
import course.Program;
import course.School;

public class RunnableExample {

	public static void main(String[] args) {
		School school = CourseFactory.eINSTANCE.createSchool();
		
		
		
		
		school.getPrograms().add(generateProgram());
		
		
	}
	
	public Program generateProgram(String name,
			float credits) {
		Program program = CourseFactory.eINSTANCE.createProgram();
		program.setName(name);
		program.setRequiredCredits(credits);
		// School is automatically set by EOpposite-link
		return program;
	}
	
}
