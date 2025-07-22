package entities;

public class Individual extends Person {

    private Double healthExpenses;

    public Individual() {
    }


    public Individual(String name, Double annualSalary, Double healthExpenses) {
        super(name, annualSalary);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double paidTax() {
        double tax;
        if (this.getAnnualIncome() < 20000.00) {
            tax = this.getAnnualIncome() * 0.15;
        } else {
            tax = this.getAnnualIncome() * 0.25;
        }

        if (this.getHealthExpenses() != null) {
            tax -= this.getHealthExpenses() * 0.5;
        }

        return tax;
    }

}
