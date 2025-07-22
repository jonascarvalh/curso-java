package entities;

public class Company extends Person {

    private Integer numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double annualSalary, Integer numberOfEmployees) {
        super(name, annualSalary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double paidTax() {
        double tax;
        if (this.numberOfEmployees <= 10) {
            tax = this.getAnnualIncome() * 0.16;
        } else {
            tax = this.getAnnualIncome() * 0.14;
        }

        return tax;
    }
}
