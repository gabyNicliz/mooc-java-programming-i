
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) return -1;
        
        int sumOfGrades = 0;
        
        for (Integer grade : this.grades) {
            sumOfGrades += grade;
        }
        
        double average = sumOfGrades / (double) this.grades.size();
        
        return average;
    }
    
    public double averageOfPoints() {
        if (this.points.isEmpty()) return -1;
        
        int sumOfPoints = 0;
        
        for (Integer point : this.points) {
            sumOfPoints += point;
        }
        
        double average = sumOfPoints / (double) this.points.size();
        
        return average;
    }
}