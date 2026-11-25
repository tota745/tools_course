import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student 
{
    private String studentId;
    private String name;
    private String major;
    private List<Course> registeredCourses;
    private Map<String, Double> grades; 


    public Student(String studentId, String name, String major)
     {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.registeredCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public String getStudentId()
     {
        return studentId;
    }

    public String getName()
     {
        return name;
    }

    public String getMajor()
     {
        return major;
    }

    public List<Course> getRegisteredCourses() 
    {
        return registeredCourses;
    }

    public Map<String, Double> getGrades() 
    {
        return grades;
    }

    public void addRegisteredCourse(Course course)
     {
        if (!registeredCourses.contains(course)) 
        {
            registeredCourses.add(course);
        }}

    public void setGrade(String courseCode, double grade)
     {
        grades.put(courseCode, grade);
    }

    @Override
    public String toString()
     {
        return "ID: " + studentId + " | Name: " + name + " | Major: " + major;
    }}



