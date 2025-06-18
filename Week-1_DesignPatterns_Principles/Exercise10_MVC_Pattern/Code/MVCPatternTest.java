public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("John", "S101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Jane");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}