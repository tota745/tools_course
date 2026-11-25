public class Main 
{
    public static void main(String[] args) 
{
        RegistrationSystem system = new RegistrationSystem();

        // Add students
        system.addStudent("32301002546", "Tala", "Software Engineering");

        system.addStudent("32301002526", "marah", "Software Engineering");

        // Add courses
        system.addCourse("011524", "Software  Tools", 3);
        system.addCourse("653220", "Numerical Analysis", 3);

      available courses
        system.displayAvailableCourses();

        enrollment & grades
       
 system.enrollAndSetGrade("32301002546", "011524", 92.5);
        system.enrollAndSetGrade("32301002546", "653220", 88.0);

        registered courses & grades for student 23201002546
        system.displayRegisteredCourses("32301002546");
        system.viewStudentGrades("32301002546");
    }}