package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
     private String department;
     private double payRate;
      private int hoursWorked;
      // creating this when I need to punch in
      private int punchInTime;



    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    // this is a derived because it's not generate it's not asking for it
    public double getTotalPay(){
        double regularPay = this.payRate * this.getRegularHours();
        //pay rate times regular hours
        double overTimePay= this.payRate * getOverTimeHours() * 1.5;

        return regularPay + overTimePay;
    }
    //If they worked 40 or less it will return the hours they worked (regular hours)
    public int getRegularHours(){
        if(this.hoursWorked<=40){
            return this.hoursWorked;

        }
        return 40;
    }

    // if the employee worked more than 40 hrs return the overtime employee worked - 40 to see the amount of hours they worked
    public int getOverTimeHours(){
        if(this.hoursWorked>40){
           return this.hoursWorked - 40;

        }
        return 0;
    }

    public void punchIn(int time) {
        this.punchInTime = time;

    }
    // figure out the difference between the punch time
    //and the punch in time and then add to the employees hours worked
    public void punchOut(int time) {
        // this gets us the hours worked based on the punch in and punch out
        int currentHoursWorked = time - this.punchInTime;
        // make sure the employee gets credit for the days worked
        this.hoursWorked += currentHoursWorked;

    }


   // public void punchTimeCard(int startTime, int endTime ):
     //   this.punchIn(start);
       //      this.punchOut(end);

    public void punchIn() {
        //get current time
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();

    }
}
