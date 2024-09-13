public class Main {
    public static void main(String[] args) {
        University universidad = new University("Uninorte");

        universidad.matriculateNewStudent(1, "Fabio Escobar");
        universidad.registerNewCourse(10001, "Java Backend");

        universidad.registerStudentToCourse(1,10001);

    }
}
