import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RegistrationSystem 
{
    private List<Student> students;
    private List<Course> availableCourses;

    public RegistrationSystem() 
{
        this.students = new ArrayList<>();
        this.availableCourses = new ArrayList<>();
    }

 //student
    public void addStudent(String id, String name, String major) 
{
        Student student = new Student(id, name, major);
        students.add(student);
        System.out.println("Student added successfully: " + student);
    }

 //course
    public void addCourse(String code, String title, int credits) 
{
        Course course = new Course(code, title, credits);
        availableCourses.add(course);
        System.out.println("Course added successfully: " + course);
    }

 available courses
    public void displayAvailableCourses() 
{
        System.out.println("\n--- Available Courses ---");
        if (availableCourses.isEmpty()) 
{
            System.out.println("No courses available.");
            return;
        }
        for (Course c : availableCourses) 
{
            System.out.println(c);
        }}
    public void enrollAndSetGrade(String studentId, String courseCode, double grade) 
{
        Student s = findStudentById(studentId);
        Course c = findCourseByCode(courseCode);
        if (s != null && c != null) 
{
            s.addRegisteredCourse(c);
            s.setGrade(courseCode, grade);
        }}
     //grades
    public void viewStudentGrades(String studentId)
 {
        Student s = findStudentById(studentId);
        if (s == null) 
{
            System.out.println("Student not found.");
            return;
        }
        System.out.println("\n--- Grades for " + s.getName() + " (" + s.getStudentId() + ") ---");
        Map<String, Double> grades = s.getGrades();
        if (grades.isEmpty()) 
{
            System.out.println("No grades recorded yet.");
            return;
        }
        for (Map.Entry<String, Double> entry : grades.entrySet()) 
{
            System.out.println("Course Code: " + entry.getKey() + " | Grade: " + entry.getValue());
        }}
 registered courses
    public void displayRegisteredCourses(String studentId) 
{
        Student s = findStudentById(studentId);
        if (s == null) 
{
            System.out.println("Student not found.");
            return;
        }
        System.out.println("\n--- Registered Courses for " + s.getName() + " ---");
        List<Course> courses = s.getRegisteredCourses();
        if (courses.isEmpty()) 
{
            System.out.println("No registered courses.");
            return;
        }
        for (Course c : courses) 
{
            System.out.println(c);
        }}
    private Student findStudentById(String id) 
{
        for (Student s : students) 
{
            if (s.getStudentId().equalsIgnoreCase(id)) 
{
                return s;
            }}
        return null;
    }
    private Course findCourseByCode(String code)
 {
        for (Course c : availableCourses) 
{
            if (c.getCourseCode().equalsIgnoreCase(code)) 
{
                return c;
       } }
        return null;
    }}