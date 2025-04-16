class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public void generatePerformanceReport() {
        System.out.println(jobTitle + " " + name + " has satisfactory performance.");
    }

    public void manageProject() {
        System.out.println(jobTitle + " " + name + " is assigned to a general project.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println();
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }

    @Override
    public void manageProject() {
        System.out.println("Manager " + name + " is overseeing multiple projects.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void manageProject() {
        System.out.println("Developer " + name + " is developing new features.");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }

    @Override
    public void manageProject() {
        System.out.println("Programmer " + name + " is fixing bugs and maintaining code.");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");

        Manager mgr = new Manager("Hima", "Chennai", 500000);
        Developer dev = new Developer("Loki", "Bangalore", 800000);
        Programmer prog = new Programmer("Dillu", "Hyderabad", 150000);

        mgr.displayDetails();
        mgr.generatePerformanceReport();
        mgr.manageProject();

        dev.displayDetails();
        dev.generatePerformanceReport();
        dev.manageProject();

        prog.displayDetails();
        prog.generatePerformanceReport();
        prog.manageProject();
    }
}
