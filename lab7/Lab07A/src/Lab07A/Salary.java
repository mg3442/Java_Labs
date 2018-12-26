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
public class Salary {
      
  public static double calculateAvgSalary(Department department,WorkingTime time)
  
  {
      int salary1 = (department.getEmployee1().getRate()*time.getHours());
      int salary2 = (department.getEmployee2().getRate()*time.getHours());
      int salary3 = (department.getEmployee3().getRate()*time.getHours());
      int avg = (salary1 + salary2 + salary3)/3;
      return avg;
  }

    
}
