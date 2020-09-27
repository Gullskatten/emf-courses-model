# School Programs and Courses

## Background
This project is a solution to the first and second assignment in the course "TDT4250 - Avansert programvaredesign".

## Case
In short, the first assignment is to model a school institution, with courses, study programs and individual study plans using [Eclipse Modelling Framework (EMF)](https://www.eclipse.org/modeling/emf/) with Eclipse. Solution to this assignment is found under [no.espegu.course.model/](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/). 

The second assignment is to use an instance of the model to generate a html-webpage using a model-to-text (M2T) framework (Acceleo). Solution to the second assignment is found under [no.espegu.course.html/](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.html/) (but is dependant on the model-folder in order to generate the output). 

## Assignment 2

### Running the transformation
A separate guide for running assignment 2 can be found [here](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.html/).

### Assignment 2: Sample output
A sample output of the transformation can be found and opened directly in your browser [here](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.html/sample-html-files/).

### Assigment 2: Modeling changes
The model from assignment 1 has been slightly improved with a new entity "Slot". 

A list of `Slot` is now what makes up mandatory and elective courses in a `ProgramSemester`. This enables more fine grained control of which courses that can be selected in a semester. A slot may include multiple courses `availableCourses`, but if only one is present the course is considered mandatory. The field `requiredCredits` is used to determine how many subjects one may choose from the list of `availableCourses`.  

A `StudyPlanSemester` no longer has a list `selectedCourse`, but selected courses are derived from the selected courses of each `Slot` in the related `ProgramSemester`.

## Project Structure
Most of the Java code in this project was generated using models made with the [Eclipse Modelling Framework (EMF)](https://www.eclipse.org/modeling/emf/) in Eclipse. 

### E-core Project ([model/](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/model))

#### [Courses.ecore](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/model/Courses.ecore)
This file contains information about the model itself. In short it describes the relation between each entity (e.g. "school" or "student"), details about the entities themselves (fields, supported operations), and other information such as "validation constraints". This file is edited through a graphical view in Eclipse.

#### [CoursesGenMod.genmodel](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/model/CoursesGenMod.genmodel)
This file is linked to the **[Courses.ecore](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/model/Courses.ecore)** file. Using the information from the ecore-file, one may use this file to generate source code such as concrete Java classes of the modelled entities (as well as test a suite for the entities in the model).

### Java Code ([src/course](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/src/course))
The `src/course` folder contains generated interfaces, concrete classes and utility classes (all generated by **[CoursesGenMod.genmodel](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/src/model/CoursesGenMod.genmodel)** using the model described by **[Courses.ecore](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/model/Courses.ecore)**). Custom files added to the `src` folder is not removed if code generation is run again.

#### Noteworthy interfaces

**[CourseFactory.java](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/src/course/CourseFactory.java)**
 Provides a singleton factory `eINSTANCE` in order to create new instances of the different entities in the project.

#### [/impl](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/src/course/impl)
Concrete implementation classes of the generated interfaces. These classes also have mostly generated code (annotated `@generated`), but if custom implementation of some code is needed it is possible to override the methods using the _NOT_-keyword in the annotation `@generated NOT`.

#### [/util](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/src/course/util)

**[CourseValidator.java](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/src/course/util/CourseValidator.java)**
 May be used to run runtime validations of any instantiated entity, using constraints described in code (Ecore) or in the model itself (OCL-constraints). 

#### Assignment 1: Example usage
An example where the generated java classes in this project have been used can be found here
**[CompleteRunnableExample.java](https://github.com/Gullskatten/emf-courses-model/blob/master/no.espegu.course.model/src/CompleteRunnableExample.java)**

_This example also contains inline comments explaining more in-depth the relations between the entities in the domain model._

The output generated by the program can be found here: **[docs / output_from_CompleteRunnable.txt ](https://github.com/Gullskatten/emf-courses-model/blob/master/docs/output_from_CompleteRunnable.txt)**


## Domain Model

### Model Hierarchy
![UML Diagram](https://github.com/Gullskatten/emf-courses-model/blob/master/docs/UML-diagram.PNG)

| ENTITY | DESCRIPTION | 
| :------- | :---------- |
| `School`| Being the top level entity in the domain model, "School" includes multiple `Programs` and `Students`. |
| `Program`| Consist of a name, required credits and a list of `ProgramYear` entities. |
| `Student`| Has a name, and a one-to-one relation to `StudyPlan` (so that a `Student` can exist, though it has no `StudyPlan` yet). |
| `ProgramYear`| A `Program` may have multiple starting years (`ProgramYear`). The content of a program may change depending on the `ProgramYear`, e.g. new `Courses` or `ProgramDirections` are introduced. Has multiple `ProgramSemesters`. |
| `ProgramDirection` | Selectable specialization within a `Program`. A `ProgramDirection` appears in a `ProgramSemester` (with an opposite-link `chosenInSemester`), but may also contain `ProgramSemesters` to define current or future semesters. |
| `ProgramSemester`| Contains mandatory and elective `Courses`, or `ProgramDirections` (specializations). If the `ProgramSemester` is contained in a `ProgramYear`, its field `programYear` is populated. If the `ProgramSemester` is contained in a `ProgramDirection` its field `parentProgramDirection` is populated. _Note:_ This reference is populated automatically ("opposite"-link in ecore model). |
| `StudyPlan`| Has multiple `StudyPlanSemesters`, is owned by a `Student`. Also has a reference to a `ProgramYear`, making it possible to know which year the `StudyPlan` was started and which `Program` is selected. |
| `StudyPlanSemester`| Contains a list of selected `Courses`. Has a reference to the `ProgramSemester`, which contains which `Courses` are mandatory and optional for this semester. Total credits for a `StudyPlanSemester` is done by combining credits for selected `Courses` with the referenced `ProgramSemester` mandatory courses. |
| `Course`| Consist of a code, name, total credits, when it is taught (`SemesterType.AUTUMN` or `SemesterType.SPRING`). |
| `Semester`| Consist of a `Year` and `SemesterType` (`SemesterType.AUTUMN` or `SemesterType.SPRING`). `StudyPlanSemester` and `ProgramSemester` inherits from this entity. |
