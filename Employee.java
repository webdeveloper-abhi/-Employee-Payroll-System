package com.employee;

public abstract class Employee {

    private String name;
    private String Id;
    private String phonenumber;
    private String Department;
    private String Address;

    public Employee(String name,String Id,String phonenumber,String Department,String Address){
        this.name=name;
        this.Id=Id;
        this.phonenumber=phonenumber;
        this.Department=Department;
        this.Address=Address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getDepartment() {
        return Department;
    }
    public String getAddress() {
        return Address;
    }
    abstract double Calculatesalary();

    @Override
    public String toString(){
        return "The Employee of Id "+Id +" have name "+name+" live in "+Address+" working in department "+Department+". His Mobile Number is "+phonenumber;
    }
}
