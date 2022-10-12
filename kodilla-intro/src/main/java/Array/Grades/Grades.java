package Grades;

public class Grades {
    private int[] grades;
    private int size;
    private boolean average;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
    return grades[size -1];
    }

    public double getAverage(){
        double sum = 0;
        for (int n = 0; n < size; n++){
            sum = sum + grades[n];
        }
        return sum/size;
    }
}
