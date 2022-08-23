package students;

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
    double total = 0;
        for (double grade : grades){
            total += grade;
        }
        return total/grades.size();
    }

    public void deleteGrade(int index) {
        this.grades.remove(index);
    }

    public void updateGrade(int index, int newGrade ) {
//        Integer grade = grades.get(index);
//        if(grade != null) {
//            grades.set(grade, newGrade);
//        }
//        int grade = grades.indexOf(index);
        grades.set(index, newGrade);
    }

}
