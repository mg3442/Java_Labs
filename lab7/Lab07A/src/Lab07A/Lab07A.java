/*
 * Design classes (user-
 * datatypes) in java for programmatically representing these objects
 * and the main logic of the system. Objects must have at least 5 attributes
 * (characteristics) and at least three methods. The program must decide
 * minimum two efficiencies.
 * Write a program to create objects of the designed classes and de
 * monstration of interaction between them.
 */
package Lab07A;


/**
 *
 * @author Aliaksiej Protas
 */

public class Lab07A {
     public static void main(String[] args) {
        
  Employee employee1 = new Employee("Vital","Kirylienka",10);
  Employee employee2 = new Employee("Aliaksiej","Siarhiejczyk",12);
  Employee employee3 = new Employee("Siarhiej","Tukala",11);
    
    Department department = new Department("Sales");
    department.setEmployee1(employee1);
    department.setEmployee2(employee2);
    department.setEmployee3(employee3);
    
    WorkingTime time = new WorkingTime("2018","May",160);
    double avgKepartmentSalary = Salary.calculateAvgSalary(department, time);
    
    double avgDepartmentSalary = Salary.calculateAvgSalary(department, time);
    
    
    View.print(department + "");
    View.print(time + "");
View.print("\nAvg department salary = " + avgDepartmentSalary);
      
    }
}
