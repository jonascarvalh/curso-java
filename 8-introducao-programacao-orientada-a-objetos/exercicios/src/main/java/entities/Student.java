package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String status() {
        double points = 60.00;
        if (this.finalGrade() >= points) {
            return "PASS";
        } else {
            double missingPoints = points - this.finalGrade();
            return "FAILED" + "\nMISSING " + String.format("%.2f", missingPoints) + " POINTS";
        }
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", this.finalGrade()) + "\n" + this.status();
    }

}
