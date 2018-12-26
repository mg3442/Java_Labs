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

public class Employee {
    private String firstName;
    private String secondName;
    private int rate;
    
    public Employee(){
        rate = 1000;
    }

    public Employee(String firstName, String secondName, int rate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.rate = rate;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public int getRate(){
        return rate;
    }
    public void setRate(int rate){
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee :" + firstName + " " + secondName + " " + rate;
    }


   
   
}
