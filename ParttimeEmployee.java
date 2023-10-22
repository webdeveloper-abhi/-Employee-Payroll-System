package com.employee;

public class ParttimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public ParttimeEmployee(String name, String Id, String phonenumber, String Department, String Address,int hoursWorked,double hourlyRate) {
        super(name, Id, phonenumber, Department, Address);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double Calculatesalary(){
        return hoursWorked*hourlyRate;
    }
}
