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

        System.out.println("Inaguración universidad " + name + "!");
    }

    public void matriculateNewStudent(Integer id, String name){
        this.studentSet.add(new Student(id, name));
        System.out.println("Se matriculó al nuevo estudiante " + name + ", con el id: " + id);
    }

    public void registerNewCourse(Integer id, String name){
        this.courseSet.add(new Course(id, name));
        System.out.println("Se registro el nuevo curso " + name + ", id asignado: " + id);
    }

    public void registerStudentToCourse(Integer idStudent, Integer idCourse){
        try {
            Student studentFound = findStudentById(idStudent);
            Course courseFound = findCourseById(idCourse);

            courseFound.addStudent(studentFound);

            System.out.println("Se ha registrado al estudiante " + studentFound.getName() + " al curso: " + courseFound.getName());

        } catch (StudentNotFoundException e){
            System.out.println("\nEl estudiante que desea registar al curso no existe \n");
            e.printStackTrace();
        }catch (CourseNotFoundException e){
            System.out.println("\nEl curso al cual desea registrar al alumno no existe\n");
            e.printStackTrace();
        }
    }

    private Course findCourseById(Integer id) throws CourseNotFoundException {
        Course courseFound = null;
        for(Course c:this.courseSet){
            if(Objects.equals(id, c.getId()))
                courseFound = c;
        }
        if (courseFound == null){
            throw new CourseNotFoundException("El id de curso ingresado no existe");
        }
        return courseFound;
    }

    private Student findStudentById(Integer id) throws StudentNotFoundException {
        Student studentFound = null;
        for(Student s:this.studentSet){
            if(Objects.equals(id, s.getId()))
                studentFound = s;
        }
        if (studentFound == null){
            throw new StudentNotFoundException("El id de estudiante ingresado no existe");
        }
        return studentFound;
    }
}
