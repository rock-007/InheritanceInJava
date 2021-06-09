package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    public Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public Double getSalary() {
        return this.salary;
    }

    public Double raiseSalary(Double raise) {
        if (raise > 0) {
            return this.salary += raise;
        }

        return null;
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }

    public String setName(String name) {
        if (name != null) {
            return this.name = name;
        }
        return null;
    }
}

