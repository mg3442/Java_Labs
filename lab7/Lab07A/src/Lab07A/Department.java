/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab07A;

/**
 *
 * @author Aliaksiej Protas
 */
public class Department {
    private String name;
    private Employee employee1;
    private Employee employee2;
    private Employee employee3;
    public Department() {
    };
    
    public Department(String name) { this.name = name; }

    
    
    public Department(String name, Employee empl1, Employee empl2, Employee empl3) {
        this.name = name;
        employee1 = empl1;
        employee2 = empl2;
        employee3 = empl3;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee1() {
        return employee1;
    }

    public void setEmployee1(Employee employee) {
        this.employee1 = employee;
    }

    public Employee getEmployee2() {
        return employee2;
    }

    public void setEmployee2(Employee employee) {
        this.employee2 = employee;
    }
public Employee getEmployee3() {
        return employee3;
    }

    public void setEmployee3(Employee employee) {
        this.employee3 = employee;
    }
   

    @Override
    public String toString() {
        return "Department " + name + ":\n" + employee1 + "\n"
                + employee2 + "\n" + employee3 ;
    }
}
