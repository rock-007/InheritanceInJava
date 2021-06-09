package management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String niNumber, Double salary, String departmentName, Double budget) {
        super(name, niNumber, salary, departmentName);
        this.budget = budget;

    }

    public Double getBudget() {
        return this.budget;
    }

    public Double payBonus() {
        return super.payBonus() * 2;
    };
}
