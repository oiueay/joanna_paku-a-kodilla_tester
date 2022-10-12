package Grades;

public class MainApp {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(50);
        grades.add(100);
        System.out.println(grades.getLastGrade());
        System.out.println(grades.getAverage());
    }
}
