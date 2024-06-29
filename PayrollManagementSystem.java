import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.omg.CORBA.StringSeqHelper;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class PayrollManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("██████╗  █████╗ ██╗   ██╗██████╗  ██████╗ ██╗     ██╗     ");
        System.out.println("██╔══██╗██╔══██╗╚██╗ ██╔╝██╔══██╗██╔═══██╗██║     ██║     ");
        System.out.println("██████╔╝███████║ ╚████╔╝ ██████╔╝██║   ██║██║     ██║     ");
        System.out.println("██╔═══╝ ██╔══██║  ╚██╔╝  ██╔══██╗██║   ██║██║     ██║     ");
        System.out.println("██║     ██║  ██║   ██║   ██║  ██║╚██████╔╝███████╗███████╗");
        System.out.println("╚═╝     ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚══════╝");
        System.out.println("");
        System.out.println(
                "\t███╗   ███╗ █████╗ ███╗   ██╗ █████╗  ██████╗ ███████╗███╗   ███╗███████╗███╗   ██╗████████╗  ");
        System.out.println(
                "\t████╗ ████║██╔══██╗████╗  ██║██╔══██╗██╔════╝ ██╔════╝████╗ ████║██╔════╝████╗  ██║╚══██╔══╝  ");
        System.out.println(
                "\t██╔████╔██║███████║██╔██╗ ██║███████║██║  ███╗█████╗  ██╔████╔██║█████╗  ██╔██╗ ██║   ██║     ");
        System.out.println(
                "\t██║╚██╔╝██║██╔══██║██║╚██╗██║██╔══██║██║   ██║██╔══╝  ██║╚██╔╝██║██╔══╝  ██║╚██╗██║   ██║     ");
        System.out.println(
                "\t██║ ╚═╝ ██║██║  ██║██║ ╚████║██║  ██║╚██████╔╝███████╗██║ ╚═╝ ██║███████╗██║ ╚████║   ██║     ");
        System.out.println(
                "\t╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝     ");
        System.out.println();

        System.out.println("\t \t \t \t \t \t \t \t \t ███████╗██╗   ██╗███████╗████████╗███████╗███╗   ███╗");
        System.out.println("\t \t \t \t \t \t \t \t \t ██╔════╝╚██╗ ██╔╝██╔════╝╚══██╔══╝██╔════╝████╗ ████║");
        System.out.println("\t \t \t \t \t \t \t \t \t ███████╗ ╚████╔╝ ███████╗   ██║   █████╗  ██╔████╔██║");
        System.out.println("\t \t \t \t \t \t \t \t \t  ════██║  ╚██╔╝  ╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║");
        System.out.println("\t \t \t \t \t \t \t \t \t ╚════██║  ╚██╔╝  ╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║");
        System.out.println("\t \t \t \t \t \t \t \t \t ███████║   ██║   ███████║   ██║   ███████╗██║ ╚═╝ ██║");
        System.out.println("\t \t \t \t \t \t \t \t \t ╚══════╝   ╚═╝   ╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝");

        System.out.println(
                "_________________________________________________________________________________________________________________________");
        System.out.println("\n \t Enter Employee Details");

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, id, salary);

        System.out.println("\nEmployee Details:");
        employee.displayEmployeeDetails();

        System.out.print("\nEnter new salary for the employee: ");
        double newSalary = scanner.nextDouble();
        employee.setSalary(newSalary);

        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();

        scanner.close();
    }
}
