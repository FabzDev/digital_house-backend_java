import java.util.HashSet;
import java.util.Set;

public class Course {
    private Integer id;
    private String name;
    private Set<Student> studentSet;

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.studentSet = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        this.studentSet.add(student);
    }
}
