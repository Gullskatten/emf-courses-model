# School Programs and Courses

## Background
This project is a proposed solution for the first assignment in the course "TDT4250 - Avansert programvaredesign".


### Case
In short, the case is to model a school institution, with courses, study programs and individual study plans.

## Solution

### Overview

#### School
Being the top level entity in the domain model, "School" includes both multiple "Programs" and "Students".

#### Program

##### Program Years in a Program
A program may have multiple starting years, or e.g. a program may change depending on the starting year. Specializations and courses may change from year to year.


### Model Hierarchy




Value	aql:self.selectedCourses -> collect(selectedCourse | selectedCourse.taughtInSemester) -> forAll(semester | semester == self.semesterType)
