package dk.clbo;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Claus", "221070-1111", 60,  120000);

        System.out.println(employee.getName());
        System.out.println(employee.getCpr());
        System.out.println(employee.getHours());
        System.out.println(employee.getSalary());
    }
}
