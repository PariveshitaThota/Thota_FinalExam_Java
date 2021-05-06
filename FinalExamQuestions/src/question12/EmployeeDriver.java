/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Pariveshita Thota
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Pariveshita Thota - question 12");
        ArrayList<Employee> employeelist = new ArrayList<>();

        employeelist.add(new Employee(102, "Pari", 8000));
        employeelist.add(new Employee(100, "Bindu", 7250));
        employeelist.add(new Employee(107, "Harsha", 10000));
        employeelist.add(new Employee(110, "Reshmika", 6000));
        employeelist.add(new Employee(104, "likita", 5000));

        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Collections.sort(employeelist);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Comparator<Employee> compareBySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() > e2.getEmpSalary()) {
                    return 1;
                }
                if (e1.getEmpSalary() < e2.getEmpSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(employeelist, compareBySalary);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }

        Comparator<Employee> compareByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }
        };
        Collections.sort(employeelist, compareByName);
        System.out.println();
        for (Employee e : employeelist) {
            System.out.println(e.toString());
        }
    }
}

