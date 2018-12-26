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
public class WorkingTime {
        private String year;
        private String nameOfMonth;
        private int hours;
    
    public  WorkingTime(){
     
        hours = 8;
    }

    public  WorkingTime(String year, String nameOfMonth, int hours) {
        this.year = year;
        this.nameOfMonth = nameOfMonth;
        this.hours = hours;

    }
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public void setNameOfMonth(String nameOfMonth) {
        this.nameOfMonth = nameOfMonth;
    }

    
 
     public int getHours(){
        return hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }
    @Override
    public String toString() {
        return "Working time :" + year + " " + nameOfMonth + " " + hours;
    }


   
}
