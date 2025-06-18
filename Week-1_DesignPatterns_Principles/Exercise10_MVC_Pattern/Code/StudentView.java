public class StudentView {
    public void displayStudentDetails(Student student) {
        System.out.println("Student: " + student.getName() + ", ID: " + student.getId() + ", Grade: " + student.getGrade());
    }
}