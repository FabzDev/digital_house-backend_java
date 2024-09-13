import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class University {

    private String name;
    private Set<Student> studentSet;
    private Set<Course> courseSet;

    public University(String name) {
        this.name = name;
        this.studentSet = new HashSet<>();
        this.courseSet = new HashSet<>();
    }

    public void matriculateNewStudent(Integer id, String name){
        this.studentSet.add(new Student(id, name));
    }

    public void registerNewCourse(Integer id, String name){
        this.courseSet.add(new Course(id, name));
    }

    public void registerStudentToCourse(Integer idStudent, Integer idCourse){
        try {
            Student studentFound = findStudentById(idStudent);
            Course courseFound = findCourseById(idCourse);

            courseFound.addStudent(studentFound);

        } catch (StudentNotFoundException e){
            System.out.println("El estudiante ingresado no existe\n");
            e.printStackTrace();
        }catch (CourseNotFoundException e){System.out.println("El estudiante no existe\n");
            System.out.println("El curso ingresado no existe\n");
            e.printStackTrace();
        }
    }

    private Course findCourseById(Integer id) throws StudentNotFoundException {
        Course courseFound = null;
        for(Course c:this.courseSet){
            if(Objects.equals(id, c.getId()))
                courseFound = c;
        }
        if (courseFound == null){
            throw new StudentNotFoundException("El id ingresado no existe");
        }
        return courseFound;
    }

    private Student findStudentById(Integer id) throws CourseNotFoundException {
        Student studentFound = null;
        for(Student s:this.studentSet){
            if(Objects.equals(id, s.getId()))
                studentFound = s;
        }
        if (studentFound == null){
            throw new CourseNotFoundException("El id ingresado no existe");
        }
        return studentFound;
    }
}
