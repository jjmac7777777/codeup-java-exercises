package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private final ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        grades = new ArrayList<>();
    }

    public static void main(String[] args) {

        Student Charley = new Student("Charley");
        Student Charlie = new Student("Charlie");
        Charley.addGrade(99);
        Charley.addGrade(98);
        Charley.addGrade(97);
        Charley.addGrade(96);
        Charley.addGrade(95);
        Charley.addGrade(88);
        Charlie.addGrade(70);
        Charlie.addGrade(80);
        Charlie.addGrade(90);
        Charlie.addGrade(67);
        Charlie.addGrade(53);
        Charlie.addGrade(49);

        System.out.println("This is what Charley got for an average\n" + Charley.getGradeAverage());
        System.out.println("This is what Charlie got for an average\n" + Charlie.getGradeAverage());
        System.out.println("Poor Charlie!");


    }
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum;
        sum=0;

        for (int grade:grades) {
          sum+=grade;
        }

        return  (sum/grades.size());
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}