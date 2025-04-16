class Employee {
    String name;
    int employeeID;
    double salary;

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void Details() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    } 
}

class RegularEmployee extends Employee {
    public RegularEmployee(String name, int employeeID, double salary) {
        super(name, employeeID, salary);
    }
}

class Manager extends Employee {
    double bonus;

    public Manager(String name, int employeeID, double salary, double bonus) {
        super(name, employeeID, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }

    @Override
    public void Details() {
        super.Details();
        System.out.println("Bonus: " + bonus);
    }
}

public class SoftwareCompany {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL.NO: AV.SC.U4CSE24111\n");

        RegularEmployee RE = new RegularEmployee("Loki", 765, 300000);
        RE.Details();

        Manager M = new Manager("Hima", 574, 500000, 30000);
        M.Details();
        System.out.println("Total Salary (Manager): " + M.getSalary());
    }
}
