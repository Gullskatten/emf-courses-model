import org.eclipse.emf.common.util.EList;

import course.CourseFactory;
import course.Program;
import course.School;

public class RunnableExample {

	public static void main(String[] args) {
		School school = CourseFactory.eINSTANCE.createSchool();
		
		
		
		
		school.getPrograms().add(generateProgram());
		
		
	}
	
	public EList<Program> generateProgram() {
		Program program = CourseFactory.eINSTANCE.createProgram();
		
		
	}
	
}
