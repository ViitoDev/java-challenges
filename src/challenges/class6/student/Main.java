package challenges.class6.student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setGrade1(10);
        student1.setGrade2(5);
        student1.setGrade3(0);

        System.out.println(student1.calculateMedia());

    }
}
