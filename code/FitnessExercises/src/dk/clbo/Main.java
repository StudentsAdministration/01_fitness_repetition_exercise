package dk.clbo;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Employee("Claus", "221070-1111", 50,  150000));
        persons.add(new Member("Tove", "221070-1119", true));
        persons.add(new Employee("Hans", "221070-5511", 60,  120000));
        persons.add(new Member("Torben", "221070-4411", true));
        persons.add(new Employee("Joon", "221070-3311", 80,  170000));
        persons.add(new Member("Lars", "221070-1133", false));


        for (Person p : persons) {
            System.out.println(p);
        }

        //Employee employee = new Employee("Claus", "221070-1111", 60,  120000);

       /* System.out.println(employee.getName());
        System.out.println(employee.getCpr());
        System.out.println(employee.getHours());
        System.out.println(employee.getSalary()); */
    }
}
