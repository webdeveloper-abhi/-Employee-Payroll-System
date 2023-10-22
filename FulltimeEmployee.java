package com.employee;

public class FulltimeEmployee extends Employee {

    private double salary;
    public FulltimeEmployee(String name,String Id,String phonenumber,String Department,String Address,double salary){
       super(name,Id,phonenumber,Department,Address);
       this.salary=salary;
    }

   @Override
    public double Calculatesalary(){
        return  salary;
   }
}
